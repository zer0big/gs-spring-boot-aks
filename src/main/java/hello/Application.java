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
<<<<<<< HEAD
		return "Spring Boot Java App Modernization Demo";
=======
		return "Hellooooooo Java App Modernization Demo";
>>>>>>> c511e34f0db8efc1ea4912dee10a7f2b23df5e16
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
