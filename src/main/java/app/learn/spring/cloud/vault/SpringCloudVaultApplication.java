package app.learn.spring.cloud.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudVaultApplication {

	@Value("${customer.name}")
	private String name;

	@Value("${customer.password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudVaultApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return name + " -> " + password;
	}
}
