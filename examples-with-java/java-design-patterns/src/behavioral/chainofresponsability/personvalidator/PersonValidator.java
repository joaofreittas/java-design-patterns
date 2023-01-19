package behavioral.chainofresponsability.personvalidator;

import behavioral.chainofresponsability.personvalidator.chain.PersonValidatorChain;

public class PersonValidator {

    private PersonValidatorChain personValidatorChain;

    public PersonValidator(final PersonValidatorChain ... validators) {
        for (int i = 0; i < validators.length -1; i++) {
            personValidatorChain = validators[i];
            personValidatorChain.setNext(validators[i + 1]);
        }

        personValidatorChain = validators[0];
    }

    public void validate(Person person) {
        personValidatorChain.execute(person);
    }

}
