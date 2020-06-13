package package_java.hierarchy;

public abstract class AbstractAudio {
    private String name;
    private int price;

    public AbstractAudio(String name, int price) {
        this.name = name;
        this.price = price;
    }

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
        return "Название: " + name;
    }
    public void printDescription()
    {
        System.out.println(description());
    }
}
