package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import  org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication
public class WebNewsV2Application {
	public static void main(String[] args) {
		SpringApplication.run(WebNewsV2Application.class, args);
	}
}
