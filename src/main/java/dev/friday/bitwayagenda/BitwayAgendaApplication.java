package dev.friday.bitwayagenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/META-INF/applicationContext.xml")
public class BitwayAgendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitwayAgendaApplication.class, args);
	}

}
