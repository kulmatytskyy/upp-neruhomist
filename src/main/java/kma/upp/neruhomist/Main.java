package kma.upp.neruhomist;

import kma.upp.neruhomist.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    @Autowired
    private String testBean;

    public static void main(String[] args) {
        Main app = new Main();
        System.out.println(app.testBean);
    }

    private Main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.getAutowireCapableBeanFactory().autowireBean(this);
    }
}
