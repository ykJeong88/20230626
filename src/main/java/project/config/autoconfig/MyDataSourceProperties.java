package project.config.autoconfig;

import lombok.Getter;
import lombok.Setter;
import project.config.MyConifgurationProperties;

@MyConifgurationProperties(prefix="data")
@Getter
@Setter
public class MyDataSourceProperties {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
}
