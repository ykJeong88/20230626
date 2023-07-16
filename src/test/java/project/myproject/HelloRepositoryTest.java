package project.myproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@MyProjectTest
public class HelloRepositoryTest {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        Assertions.assertThat(helloRepository.findHello("ykjeong")).isNull();
    }

    @Test
    void increaseCount() {
        Assertions.assertThat(helloRepository.countOf("ykjeong")).isEqualTo(0);
        helloRepository.increaseCount("ykjeong");
        Assertions.assertThat(helloRepository.countOf("ykjeong")).isEqualTo(1);
        helloRepository.increaseCount("ykjeong");
        Assertions.assertThat(helloRepository.countOf("ykjeong")).isEqualTo(2);
    }
}
