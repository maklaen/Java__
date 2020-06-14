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


    public String description() {
        return "Название: " + getName() + ", стоимость: " + getPrice();
    }

    public void printDescription()
    {
        System.out.println(description());
    }
}
