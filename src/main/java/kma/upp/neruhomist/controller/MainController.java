package kma.upp.neruhomist.controller;

import kma.upp.neruhomist.dao.ObjectRowMapper;
import kma.upp.neruhomist.entity.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@Controller
public class MainController {

    // TODO: delete this shit

    private static final String SELECT_AVAILABLE_OBJECTS_SQL = "" + "" +
            "select \n" +
            "    Address as address, \n" +
            "    rooms as rooms_num, \n" +
            "    Type as type, \n" +
            "    payment as price, \n" +
            "    abs(datediff(EndDate, StartDate)) as days_in_rent \n" +
            "from objects o \n" +
            "inner join contracts c \n" +
            "on c.objectID = o.objectID \n";
//            + "where StartDate > now()";
    private static final String SEARCH_AVAILABLE_OBJECTS_SQL = "" +
        "select \n" +
        "    Address as address, \n" +
        "    rooms as rooms_num, \n" +
        "    Type as type, \n" +
        "    payment as price, \n" +
        "    abs(datediff(EndDate, StartDate)) as days_in_rent \n" +
        "from objects o \n" +
        "inner join contracts c \n" +
        "on c.objectID = o.objectID \n" +
        "where\n" +
        "    Address like ('%' || ? || '%')\n" +
        "    and rooms = ?\n" +
        "    and Type = ?\n" +
        "    and payment > ? " +
        "    and payment < ? ";

    private static final String SELECT_ROOMS_NUMS_SQL = "select distinct rooms as rooms_num from objects";
    private static final String SELECT_TYPES_SQL = "select distinct Type as type from objects";
    private static final String SELECT_MIN_PRICE_SQL = "select min(payment) as price from objects";
    private static final String SELECT_MAX_PRICE_SQL = "select max(payment) as price from objects";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchObjectsPage(Model model) {
        List<Object> objects = jdbcTemplate.query(SELECT_AVAILABLE_OBJECTS_SQL, new ObjectRowMapper());
        List<String> types = jdbcTemplate.queryForList(SELECT_TYPES_SQL, String.class);
        List<String> roomsNums = jdbcTemplate.queryForList(SELECT_ROOMS_NUMS_SQL, String.class);
        long minPriceFromAll = (long) Math.ceil(jdbcTemplate.queryForObject(SELECT_MIN_PRICE_SQL, Double.class));
        long maxPriceFromAll = (long) Math.ceil(jdbcTemplate.queryForObject(SELECT_MAX_PRICE_SQL, Double.class));
        System.out.println(minPriceFromAll);
        System.out.println(maxPriceFromAll);
        List<String> prices = new ArrayList<>();
        long priceFromAll = minPriceFromAll;
        for(int i = 0; i < 50; i++) {
            priceFromAll += 1000;
           prices.add(priceFromAll + "-" + (priceFromAll+1000));
        }
        model.addAttribute("objects", objects);
        model.addAttribute("types", types);
        model.addAttribute("roomsNums", roomsNums);
        model.addAttribute("prices", prices);
        model.addAttribute("objects", objects);
        System.out.println("objects: " + objects);
        return "archive-current-search";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String searchObjects(Model model,
                                @RequestParam String street,
                                @RequestParam int roomsNum,
                                @RequestParam String type,
                                @RequestParam String priceRange) {
        long minPrice = Long.parseLong(priceRange.split("-")[0].trim());
        long maxPrice = Long.parseLong(priceRange.split("-")[1].trim());
        List<Object> objects = jdbcTemplate.query(SEARCH_AVAILABLE_OBJECTS_SQL, new ObjectRowMapper(), new java.lang.Object[]{
               street, roomsNum, type, minPrice, maxPrice
        });
        List<String> types = jdbcTemplate.queryForList(SELECT_TYPES_SQL, String.class);
        List<String> roomsNums = jdbcTemplate.queryForList(SELECT_ROOMS_NUMS_SQL, String.class);
        int minPriceFromAll = (int) Math.ceil(jdbcTemplate.queryForObject(SELECT_MIN_PRICE_SQL, Double.class));
        int maxPriceFromAll = (int) Math.ceil(jdbcTemplate.queryForObject(SELECT_MAX_PRICE_SQL, Double.class));
        model.addAttribute("objects", objects);
        model.addAttribute("types", types);
        model.addAttribute("roomsNums", roomsNums);
        model.addAttribute("minPrice", minPriceFromAll);
        model.addAttribute("maxPrice", maxPriceFromAll);
        System.out.println("objects: " + objects);
        return "archive-current-search";
    }

    @RequestMapping("/current")
    public String current(Model model) {
        return searchObjectsPage(model);
    }

    @RequestMapping("/statistics")
    public String statisticsPage() {
        return "statistics";
    }

}
