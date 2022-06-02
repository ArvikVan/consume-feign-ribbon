package arv.consumefeignribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ConsumeFeignRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeFeignRibbonApplication.class, args);
	}
/*
	@Bean
	public WebClient.Builder getABuilder() {
		return WebClient.builder();
	}*/

}
