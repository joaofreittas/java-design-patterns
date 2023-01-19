package behavioral.chainofresponsability.personvalidator.exception;

public class PersonInvalidDataException extends RuntimeException {

    public PersonInvalidDataException(final String message) {
        super(message);
    }

}
