package package_java.decorator;

import package_java.hierarchy.AbstractAudio;

public abstract class Decorator extends AbstractAudio {
    public Decorator(String name, int price) {
        super(name, price);
    }
}
