package igrushki;

public class TanksToys extends Toys{
    protected String name = "Tank";
    public TanksToys(int id, String name, int rand) {
        super(id, name, rand);
    }

    public TanksToys() {
    }

    public int getRand() {
        return rand;
    }



    @Override
    public void setRand(int rand) {
        this.rand = rand;
    }
}
