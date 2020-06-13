package package_java.decorator;

import package_java.hierarchy.AbstractAudio;

public class ExtraBass extends Decorator {
    AbstractAudio abstractAudio;

    public ExtraBass(String name, int price, AbstractAudio abstractAudio) {
        super(name, price);
        this.abstractAudio = abstractAudio;
    }

    @Override
    public String description() {
        return super.description() + " с функцией усилинеия низких частот.";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 150;
    }
}
