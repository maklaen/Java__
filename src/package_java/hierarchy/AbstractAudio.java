package package_java.hierarchy;

public abstract class AbstractAudio {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void printPrice(){
        System.out.println("Цена: " +getPrice());
    }
    public String description() {
        return "Модель: " + name;
    }
    public void printDescription()
    {
        System.out.println(description());
    }
}
