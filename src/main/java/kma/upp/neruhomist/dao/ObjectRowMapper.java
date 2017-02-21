package kma.upp.neruhomist.dao;

import kma.upp.neruhomist.entity.Object;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ObjectRowMapper implements RowMapper<Object> {

    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Object(
                resultSet.getString("address"),
                resultSet.getInt("rooms_num"),
                resultSet.getString("type"),
                resultSet.getDouble("price"),
                resultSet.getInt("days_in_rent")
        );
    }

}
