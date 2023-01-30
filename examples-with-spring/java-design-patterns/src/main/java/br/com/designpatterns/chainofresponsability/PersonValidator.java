package br.com.designpatterns.chainofresponsability;

import br.com.designpatterns.chainofresponsability.validators.PersonAgeValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonValidator {

    private final PersonAgeValidator personAgeValidator;

    public void validate(Person person) {
        personAgeValidator.execute(person);
    }

}
