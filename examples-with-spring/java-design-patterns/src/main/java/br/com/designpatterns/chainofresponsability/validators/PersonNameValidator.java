package br.com.designpatterns.chainofresponsability.validators;

import br.com.designpatterns.chainofresponsability.Person;
import br.com.designpatterns.chainofresponsability.PersonValidatorChain;
import org.springframework.stereotype.Component;

@Component
public class PersonNameValidator extends PersonValidatorChain {

    protected PersonNameValidator() {
        super(null);
    }

    @Override
    public void execute(final Person person) {
        if (person.getName() == null) {
            throw new RuntimeException("Name is Null!");
        }

        if (person.getName().isBlank()) {
            throw new RuntimeException("Name is Blank!");
        }

        hasNext(person);
    }

}
