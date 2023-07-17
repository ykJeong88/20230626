package project.myproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import project.myproject.HelloRepository;
import project.myproject.HelloService;
import project.myproject.MyProjectTest;

import java.util.stream.IntStream;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.NONE)
@Transactional
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
