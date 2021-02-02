package assignments.assignment_14.q01;

public class Atts {
    public String name;
    public String color;
    public int amount;

    @Override
    public String toString() {
        return "Atts{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String asString(){
        return "name: "+name+" color: "+color+" amount: "+amount;
    }
}
