package kma.upp.neruhomist.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{Config.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
