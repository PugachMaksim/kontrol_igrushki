package igrushki;

public class CarsToys extends Toys{
    String name = "Cars";
    public CarsToys(int id, String name, int rand) {
        super(id, name, rand);
        this.rand = rand;
    }
    public CarsToys() {
    }

    public int getRand() {
        return rand;
    }
}
