package package_java.hierarchy;

public class Speaker extends AbstractAudio {
    private int power;

    public Speaker(String name, int price, int power) {
        super(name, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String description() {
        return "Название: " + getName() + ", стоимость: " + getPrice() +  ", мощность: " + getPower() + "Вт.";
    }
}
