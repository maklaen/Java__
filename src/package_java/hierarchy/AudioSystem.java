package package_java.hierarchy;

public class AudioSystem extends Speaker {
    private int countOfSpeakers;

    public AudioSystem(String name, int price, int power, int countOfSpeakers) {
        super(name, price, power);
        this.countOfSpeakers = countOfSpeakers;
    }

    public int getCountOfSpeakers() {
        return countOfSpeakers;
    }

    public void setCountOfSpeakers(int countOfSpeakers) {
        this.countOfSpeakers = countOfSpeakers;
    }

    public String description() {
        return "Название: " + getName() + ", стоимость: " + getPrice() +  ", мощность: " + getPower() + "Вт, количество динамков: " + getCountOfSpeakers();
    }
}
