package package_java.fabrica;

import package_java.hierarchy.AbstractAudio;
import package_java.hierarchy.AudioSystem;
import package_java.hierarchy.BluetothSpeaker;
import package_java.hierarchy.Headphones;

public class SonySpeakerFactory extends SpeakerFactory {

    @Override
    public AbstractAudio createSpeaker(SpeakerType type) {
        AbstractAudio abstractAudio = null;

        switch (type) {
            case Headphones:
                abstractAudio = new Headphones("Sony Headphones", 120, 8, 2);
                break;
            case AudioSystem:
                abstractAudio = new AudioSystem("Sony AudioSystem", 500, 180, 5);
                break;
            case BluetothSpeaker:
                abstractAudio = new BluetothSpeaker("Sony BluetorhSpeaker", 300, 45, 5);
                break;
        }
        return abstractAudio;
    }
}
