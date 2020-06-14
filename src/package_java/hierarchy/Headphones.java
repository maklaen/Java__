package package_java.hierarchy;

public class Headphones extends Speaker {
    private double longOfKabel;

    public Headphones(String name, int price, int power, double longOfKabel) {
        super(name, price, power);
        this.longOfKabel = longOfKabel;
    }

    public double getLongOfKabel() {
        return longOfKabel;
    }

    public void setLongOfKabel(double longOfKabel) {
        this.longOfKabel = longOfKabel;
    }

    public String description() {
        return super.description() + ", мощность: " + getPower() + "Вт, длинная кабеля: " + getLongOfKabel();
    }
}
