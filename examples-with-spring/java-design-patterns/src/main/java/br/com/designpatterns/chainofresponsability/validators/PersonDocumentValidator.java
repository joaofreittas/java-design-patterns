package br.com.designpatterns.chainofresponsability.validators;

import br.com.designpatterns.chainofresponsability.Person;
import br.com.designpatterns.chainofresponsability.PersonValidatorChain;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PersonDocumentValidator extends PersonValidatorChain {

    protected PersonDocumentValidator(final PersonNameValidator next) {
        super(next);
    }

    @Override
    public void execute(final Person person) {
        if (person.getDocumentNumber() == null) {
            throw new RuntimeException("Document Number is Null!");
        }

        if (person.getDocumentNumber().isBlank()) {
            throw new RuntimeException("Document Number is Blank!");
        }

        hasNext(person);
    }

}
