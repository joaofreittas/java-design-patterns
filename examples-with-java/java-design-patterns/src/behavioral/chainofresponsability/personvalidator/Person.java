package behavioral.chainofresponsability.personvalidator;

import java.time.LocalDate;

public class Person {

    private final String documentNumber;
    private final String name;
    private final LocalDate birthDate;
    private final String nameOfMother;

    public Person(final String documentNumber, final String name, final LocalDate birthDate, final String nameOfMother) {
        this.documentNumber = documentNumber;
        this.name = name;
        this.birthDate = birthDate;
        this.nameOfMother = nameOfMother;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getNameOfMother() {
        return nameOfMother;
    }

}
