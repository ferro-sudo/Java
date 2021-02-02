package assignments.assignment_14.q06;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int addToMax) {
        if (timeLeft <= maxTime) {
            timeLeft = (addToMax == 25) ? timeLeft += 30 : timeLeft;
        }
        return maxTime == 25;
    }

    public void tick() {
        if (timeLeft > 0)
            timeLeft--;
    }

    public boolean isExpired() {
        return timeLeft == 0;
    }

}
