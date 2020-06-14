package package_java.hierarchy;

public class BluetothSpeaker extends Speaker {
    private int versionBluetoth;

    public BluetothSpeaker(String name, int price, int power, int versionBluetoth) {
        super(name, price, power);
        this.versionBluetoth = versionBluetoth;
    }

    public int getVersionBluetoth() {
        return versionBluetoth;
    }

    public void setVersionBluetoth(int versionBluetoth) {
        this.versionBluetoth = versionBluetoth;
    }
    @Override
    public String description() {
        return super.description() +  ", мощность: " + getPower() + "Вт, версия блютус: " + getVersionBluetoth();
    }
}
