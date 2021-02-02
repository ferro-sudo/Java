package assignments.assignment_14.q07;

public class GasTank {
    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    public void addGas(double addedGas) {
        amount += addedGas;
        amount = Math.min(amount, capacity);
    }

    public void useGas(double usedGas) {
        amount -= usedGas;
        amount = Math.max(0, amount);
    }

    public boolean isEmpty() {
        return amount < 0.1;
    }

    public boolean isFull() {
        return amount > capacity - 0.1;
    }

    public double getGasLevel() {
        return amount;
    }

    public double fillUp() {
        return capacity - amount;
    }


}
