package liga.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "liga")
@EntityScan(basePackages = "liga")
@ComponentScan(basePackages = "liga")
@PropertySource(value = { "classpath:db.properties","classpath:web.properties" })
public class Starter {
    public static void main(String[] args){
        SpringApplication.run(Starter.class);
    }
}
