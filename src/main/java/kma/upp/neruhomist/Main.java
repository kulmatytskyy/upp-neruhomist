package kma.upp.neruhomist;

import kma.upp.neruhomist.config.Config;
import kma.upp.neruhomist.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

//    @Autowired
//    private ClientRepository clientRepository;

    @Autowired
    private ContractRepository contractRepository;

    public static void main(String[] args) {
        Main app = new Main();
//        System.out.println(app.testBean);
        System.out.println(app.contractRepository.count());
        System.out.println(Arrays.toString(app.contractRepository.findAll().toArray()));
    }

    private Main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.getAutowireCapableBeanFactory().autowireBean(this);
    }
}
