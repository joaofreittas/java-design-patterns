package br.com.designpatterns.chainofresponsability;

public abstract class PersonValidatorChain {

    private PersonValidatorChain next;

    protected PersonValidatorChain(final PersonValidatorChain next) {
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
