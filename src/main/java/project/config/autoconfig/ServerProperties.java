package project.config.autoconfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import project.config.MyConifgurationProperties;

@Getter
@Setter
@MyConifgurationProperties(prefix = "server")
public class ServerProperties {

    private String contextPath;

    private int port;

}
