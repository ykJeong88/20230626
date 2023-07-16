package project.myproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import project.myproject.HelloRepository;
import project.myproject.HelloService;
import project.myproject.MyProjectTest;

import java.util.stream.IntStream;

@MyProjectTest
public class HelloServiceCountTest {

    @Autowired
    HelloService helloService;

    @Autowired
    HelloRepository helloRepository;

    @Test
    void sayHelloIncreaseCount() {
        IntStream.rangeClosed(1, 10).forEach(count -> {
            helloService.sayHello("ykjeong");
            Assertions.assertThat(helloRepository.countOf("ykjeong")).isEqualTo(count);
        });
    }

}
