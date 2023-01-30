package br.com.designpatterns;

import br.com.designpatterns.chainofresponsability.Person;
import br.com.designpatterns.chainofresponsability.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DesignPatternsApplication {

	@Autowired
	private PersonValidator personValidator;

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Bean
	public void executeProgram() {
		Person person = new Person("Joao", 18, "18008827777");
		personValidator.validate(person);
	}

}
