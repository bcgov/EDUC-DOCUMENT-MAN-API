package ca.bc.gov.educ.api.documentman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("ca.bc.gov.educ.api.documentman")
@ComponentScan("ca.bc.gov.educ.api.documentman")
public class DocumentManApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocumentManApiApplication.class, args);
	}

}
