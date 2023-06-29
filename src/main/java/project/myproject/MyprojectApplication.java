package project.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
@ComponentScan
public class MyprojectApplication {

//    @Bean
//    public HelloController helloController(HelloService helloService) {
//        return new HelloController(helloService);
//    }
//
//    @Bean
//    public HelloService helloService() {
//        return new SimpleHelloService();
//    }

    @Bean
    public ServletWebServerFactory servletWebServerFactory() {
        return new TomcatServletWebServerFactory();
    }

    @Bean
    public DispatcherServlet dispatcherServlet() {
        return new DispatcherServlet();
    }

    public static void main(String[] args) {
//        MySpringApplication.run(MyprojectApplication.class, args);
        SpringApplication.run(MyprojectApplication.class,args);
    }
}
