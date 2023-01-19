package behavioral.chainofresponsability.personvalidator.chain;

import behavioral.chainofresponsability.personvalidator.Person;
import behavioral.chainofresponsability.personvalidator.exception.PersonInvalidDataException;

import static java.util.Objects.isNull;

public class PersonValidatorName extends PersonValidatorChain {

    public PersonValidatorName() {
        super(null);
    }

    @Override
    public void execute(final Person person) {
        if (isNull(person.getName()))
            throw new PersonInvalidDataException("Person Name is Null!");

        if (person.getName().isBlank())
            throw new PersonInvalidDataException("Person Name is Blank!");

        hasNext(person);
    }

}
