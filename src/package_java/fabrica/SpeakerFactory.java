package package_java.fabrica;

import package_java.hierarchy.AbstractAudio;

public abstract class SpeakerFactory {

    protected abstract AbstractAudio createSpeaker(SpeakerType type);
}
