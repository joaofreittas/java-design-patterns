package behavioral.chainofresponsability.personvalidator.chain;

import behavioral.chainofresponsability.personvalidator.Person;
import behavioral.chainofresponsability.personvalidator.exception.PersonInvalidDataException;

import static java.util.Objects.isNull;

public class PersonValidatorDocument extends PersonValidatorChain {

    public PersonValidatorDocument() {
        super(null);
    }

    @Override
    public void execute(final Person person) {
        if (isNull(person.getDocumentNumber()))
            throw new PersonInvalidDataException("Document Number is Null!");

        if (person.getDocumentNumber().isBlank())
            throw new PersonInvalidDataException("Document Number is Blank!");

        if (person.getDocumentNumber().length() != 11)
            throw new PersonInvalidDataException("Document Number is Invalid! document number must have 11 numbers");

        hasNext(person);
    }

}
