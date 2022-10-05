public class Cow extends Mammal{
    protected int numOfHamlatot;

    public Cow() {
    }

    public Cow(String name, double age, boolean torefAl, int kaloriot, int milkKal, int pregMonth, int numOfHamlatot) {
        super(name, age, torefAl, kaloriot, milkKal, pregMonth);
        this.numOfHamlatot = numOfHamlatot;
    }

    public void setNumOfHamlatot(int numOfHamlatot) {
        this.numOfHamlatot = numOfHamlatot;
    }

    public int getNumOfHamlatot() {
        return numOfHamlatot;
    }

    @Override
    public String toString() {
        return "Cow(" + "numOfHamlatot:" + numOfHamlatot + ")";
    }
}
