public class lab implements Tradable, Drivable {
    String company;
    String type;
    int maxSpeed;

    public void lab(String company, String type, int maxSpeed) {
        this.company = company;
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getPrice() {
        return 5000 * 6;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
}