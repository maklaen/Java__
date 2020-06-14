package package_java;

import package_java.Threads.ThreadOne;
import package_java.Threads.ThreadTwo;
import package_java.Threads.Value;
import package_java.decorator.ExtraBass;
import package_java.decorator.SpeakerWithCase;
import package_java.decorator.SpeakerWithLight;
import package_java.fabrica.JblSpeakerFactory;
import package_java.fabrica.SonySpeakerFactory;
import package_java.fabrica.SpeakerType;
import package_java.hierarchy.AbstractAudio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Value storage = new Value();
        ThreadOne thread1 = new ThreadOne(storage);
        ThreadTwo thread2 = new ThreadTwo(storage);
        System.out.println("Threads are started");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("Value = " + storage.value);

        JblSpeakerFactory jblSpeakerFactory = new JblSpeakerFactory();
        SonySpeakerFactory sonySpeakerFactory = new SonySpeakerFactory();

        List<AbstractAudio> collections = new ArrayList<>();

        AbstractAudio abstractAudio;
        abstractAudio = jblSpeakerFactory.createSpeaker(SpeakerType.AudioSystem);
        abstractAudio = new ExtraBass("Динамики от JBL", 100, abstractAudio);
        collections.add(abstractAudio);

        abstractAudio = sonySpeakerFactory.createSpeaker(SpeakerType.Headphones);
        abstractAudio = new SpeakerWithCase("Наушники от Sony", 50, abstractAudio);
        collections.add(abstractAudio);

        abstractAudio = sonySpeakerFactory.createSpeaker(SpeakerType.BluetothSpeaker);
        abstractAudio = new SpeakerWithLight("Беспроводная колонка от Sony", 150, abstractAudio);
        collections.add(abstractAudio);

        for (AbstractAudio audio : collections) {
            audio.printDescription();
        }
    }
}
