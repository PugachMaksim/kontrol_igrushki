package igrushki;

import java.util.Objects;

public abstract class Toys {

    protected int id;
    protected String name;
    protected int rand;

    public Toys(int id, String name, int rand){
        this.id = id;
        this.name = name;
        this.rand = rand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public Toys(){

    }

    @Override
    public String toString() {
        return  id + " " + name + ", шанс = " + rand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toys toys = (Toys) o;
        return id == toys.id && rand == toys.rand && Objects.equals(name, toys.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rand);
    }
}
