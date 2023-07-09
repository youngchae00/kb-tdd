package my.kb.tdd;

public class Fran {
    private int amount;

    public Fran(int amount){
        this.amount = amount;
    }

    public Fran times(int multiplier){
        return new Fran(amount * multiplier);
    }

    public boolean equals(Object object) {
        Fran fran = (Fran)object;
        return amount == fran.amount;
    }

}
