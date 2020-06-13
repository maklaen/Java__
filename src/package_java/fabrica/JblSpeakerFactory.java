package package_java.fabrica;

import package_java.hierarchy.AbstractAudio;
import package_java.hierarchy.AudioSystem;
import package_java.hierarchy.BluetothSpeaker;
import package_java.hierarchy.Headphones;

public class JblSpeakerFactory extends SpeakerFactory {

    @Override
    public AbstractAudio createSpeaker(SpeakerType type) {
        AbstractAudio abstractAudio = null;

        switch (type) {
            case Headphones:
                abstractAudio = new Headphones("JBS Headphones", 150, 10, 1.2);
                break;
            case AudioSystem:
                abstractAudio = new AudioSystem("JBL AudioSystem", 400, 150, 4);
                break;
            case BluetothSpeaker:
                abstractAudio = new BluetothSpeaker("JBL BluetorhSpeaker", 250, 50, 4);
                break;
        }
        return abstractAudio;
    }
}
