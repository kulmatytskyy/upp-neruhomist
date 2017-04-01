package kma.upp.neruhomist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String getTestBean() {
        return "test";
    }

}
