package package_java.decorator;

import package_java.hierarchy.AbstractAudio;

public class SpeakerWithVoiceHelper extends Decorator {
    AbstractAudio abstractAudio;

    public SpeakerWithVoiceHelper(String name, int price, AbstractAudio abstractAudio) {
        super(name, price);
        this.abstractAudio = abstractAudio;
    }

    @Override
    public String description() {
        return super.description() + " с встроенным голосовым помошником.";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }
}
