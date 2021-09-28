public class Cycle implements Drivable, Tradable{

    String company;
    String type;
    int maxSpeed;

        public void Cycle(String company,String type, int maxSpeed) {
        this.company = company;
        this.type = type;
        this.maxSpeed = maxSpeed;
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

    @Override
    public int getPrice() {
        return 5000 * this.company.length * this.maxSpeed;
    }
}
