package behavioral.chainofresponsability.personvalidator.chain;

import behavioral.chainofresponsability.personvalidator.Person;
import behavioral.chainofresponsability.personvalidator.exception.PersonInvalidDataException;

import static java.util.Objects.isNull;

public class PersonValidatorBirthDate extends PersonValidatorChain {

    public PersonValidatorBirthDate() {
        super(null);
    }

    @Override
    public void execute(final Person person) {
        if (isNull(person.getBirthDate())) {
            throw new PersonInvalidDataException("Birth Date is Invalid!");
        }

        hasNext(person);
    }

}
