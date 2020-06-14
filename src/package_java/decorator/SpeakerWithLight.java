package package_java.decorator;

import package_java.hierarchy.AbstractAudio;

public class SpeakerWithLight extends Decorator {
    AbstractAudio abstractAudio;

    public SpeakerWithLight(String name, int price, AbstractAudio abstractAudio) {
        super(name, price);
        this.abstractAudio = abstractAudio;
    }

    @Override
    public String description() {
        return super.description() + ". Особенности: с подсветкой.";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }
}
