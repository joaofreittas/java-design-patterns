package br.com.designpatterns.chainofresponsability.validators;

import br.com.designpatterns.chainofresponsability.Person;
import br.com.designpatterns.chainofresponsability.PersonValidatorChain;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PersonAgeValidator extends PersonValidatorChain {

    protected PersonAgeValidator(final PersonDocumentValidator next) {
        super(next);
    }

    @Override
    public void execute(final Person person) {
        if (person.getAge() < 18) {
            throw new RuntimeException("Age is minor than 18!");
        }

        hasNext(person);
    }

}
