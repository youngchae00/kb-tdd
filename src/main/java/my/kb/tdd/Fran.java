package my.kb.tdd;

public class Fran extends Money {
    private int amount;

    public Fran(int amount){
        super(amount);
    }

    public Fran times(int multiplier){
        return new Fran(amount * multiplier);
    }

}
