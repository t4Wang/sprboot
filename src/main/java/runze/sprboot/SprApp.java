package runze.sprboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SprApp {
	
	@RequestMapping("/")
	String home() {
		return "你好，世界!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SprApp.class, args);
	}

}
