package my.kb.tdd;

public class Dollar extends Money{
    private int amount;

    public Dollar(int amount){
        super(amount);
    }

    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

}
