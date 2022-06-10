package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")

	public String home() {

		return "Hello, You are currently watching a demo of modernizing a Spring Boot app by leveraging Azure's container services";

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
