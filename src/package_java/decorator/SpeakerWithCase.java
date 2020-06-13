package package_java.decorator;

import package_java.hierarchy.AbstractAudio;

public class SpeakerWithCase extends Decorator {
    AbstractAudio abstractAudio;

    public SpeakerWithCase(String name, int price, AbstractAudio abstractAudio) {
        super(name, price);
        this.abstractAudio = abstractAudio;
    }

    @Override
    public String description() {
        return super.description() + " с чехлом в комплекте.";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }
}
