package Homeworks.Assignment_14;

public class ParkingMeter {
    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int coin) {
        int timeLeft1 = timeLeft;
        timeLeft = (coin == 25 && timeLeft <= maxTime) ? +30 : +0;

        return timeLeft > timeLeft1 ? true : false;
    }

    public void tick() {
        timeLeft = (timeLeft > 0) ? timeLeft - 1 : timeLeft;
    }

    public boolean isExpired() {
        return (timeLeft <= 0) ? true : false;
    }
}