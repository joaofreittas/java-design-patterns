package behavioral.chainofresponsability.personvalidator.chain;

import behavioral.chainofresponsability.personvalidator.Person;

public abstract class PersonValidatorChain {

    private PersonValidatorChain next;

    PersonValidatorChain(final PersonValidatorChain next) {
        this.next = next;
    }

    public void setNext(PersonValidatorChain next) {
        this.next = next;
    }

    public void hasNext(Person person) {
        if (next == null) {
            return;
        }

        next.execute(person);
    }

    public abstract void execute(Person person);

}
