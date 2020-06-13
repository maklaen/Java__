package package_java.builder;

import package_java.fabrica.JblSpeakerFactory;
import package_java.fabrica.SonySpeakerFactory;
import package_java.fabrica.SpeakerType;
import package_java.hierarchy.AudioSystem;
import package_java.hierarchy.BluetothSpeaker;
import package_java.hierarchy.Headphones;

public class Main {
    public static void main(String[] args) {
        JblSpeakerFactory jblSpeakerFactory = new JblSpeakerFactory();
        SonySpeakerFactory sonySpeakerFactory = new SonySpeakerFactory();
        AudioCollections audioCollections1 = new AudioCollections.Builder()
                .withName("Моя коллекция")
                .withBluetothSpeaker((BluetothSpeaker) jblSpeakerFactory.createSpeaker(SpeakerType.BluetothSpeaker))
                .withHeadphones( (Headphones) sonySpeakerFactory.createSpeaker(SpeakerType.Headphones))
                .build();

        AudioCollections audioCollections2 = new AudioCollections.Builder()
                .withName("Не моя коллекция")
                .withBluetothSpeaker((BluetothSpeaker) jblSpeakerFactory.createSpeaker(SpeakerType.BluetothSpeaker))
                .withHeadphones( (Headphones) sonySpeakerFactory.createSpeaker(SpeakerType.Headphones))
                .withAudioSystem((AudioSystem) jblSpeakerFactory.createSpeaker(SpeakerType.AudioSystem))
                .withAudioSystem((AudioSystem) sonySpeakerFactory.createSpeaker(SpeakerType.AudioSystem))
                .build();
        audioCollections1.showInfo();
        audioCollections2.showInfo();
    }
}
