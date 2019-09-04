package maven.shoes.lab01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class lab01 {
	public static void main(String[] args) {
		SpringApplication.run(lab01.class, args);
	}
@RequestMapping("/index")
String home() {
	System.out.println("asdasd");
	return "Welcome To My Shop";
	}
}