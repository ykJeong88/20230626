package project.config.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;
import project.config.MyAutoConfiguration;

@MyAutoConfiguration
public class DispatcherServletConfig {
    @Bean("tomcatWebServerFactory")
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }
}
