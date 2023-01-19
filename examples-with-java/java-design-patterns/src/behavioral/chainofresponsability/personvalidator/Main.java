package behavioral.chainofresponsability.personvalidator;

import behavioral.chainofresponsability.personvalidator.chain.PersonValidatorBirthDate;
import behavioral.chainofresponsability.personvalidator.chain.PersonValidatorDocument;
import behavioral.chainofresponsability.personvalidator.chain.PersonValidatorName;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1998, 12, 6);
        Person person = new Person("18008827777", "João", birthDate, "");

        PersonValidator validator = new PersonValidator(
            new PersonValidatorBirthDate(),
            new PersonValidatorDocument(),
            new PersonValidatorName()
        );

        validator.validate(person);

        System.out.println("Person is Valid!");

    }

}
