package project.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.PostConstruct;

@MySpringBootApplication
public class MyprojectApplication {

//    @Bean
//    ApplicationRunner applicationRunner(Environment env) {
//        return args -> {
//            String name = env.getProperty("my.name");
//            System.out.println("my.name : " + name);
//        };
//    }

    private JdbcTemplate jdbcTemplate;

    public MyprojectApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @PostConstruct
    void init() {
        jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key, count int)");
    }

    public static void main(String[] args) {
        SpringApplication.run(MyprojectApplication.class,args);
    }
}
