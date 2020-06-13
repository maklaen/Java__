package package_java.builder;

import package_java.hierarchy.AudioSystem;
import package_java.hierarchy.BluetothSpeaker;
import package_java.hierarchy.Headphones;

public class AudioCollections {
    protected String  name;
    protected AudioSystem audiosystem = null;
    protected BluetothSpeaker bluetothSpeaker = null;
    protected Headphones headphones = null;

    public void showInfo(){
        System.out.println(name);
        if(audiosystem != null)audiosystem.printDescription();
        if(bluetothSpeaker != null)bluetothSpeaker.printDescription();
        if(headphones!= null)headphones.printDescription();
    }
    public static class Builder {
        private  AudioCollections newAudioCollections;
        public  Builder(){
            newAudioCollections = new AudioCollections();
        }
        public AudioCollections.Builder withName(String newName){
            newAudioCollections.name = newName;
            return this;
        }
        public AudioCollections.Builder withAudioSystem(AudioSystem newAudioSystem){
            newAudioCollections.audiosystem = newAudioSystem;
            return this;
        }
        public AudioCollections.Builder withBluetothSpeaker(BluetothSpeaker newBluetothSpeaker){
            newAudioCollections.bluetothSpeaker = newBluetothSpeaker;
            return this;
        }
        public AudioCollections.Builder withHeadphones(Headphones newHeadphones){
            newAudioCollections.headphones = newHeadphones;
            return this;
        }
        public AudioCollections build(){
            return newAudioCollections;
        }
    }
}
