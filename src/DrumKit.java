public class DrumKit {

    boolean topHat = true;
    boolean snare = true;

    void platSnare() {
        System.out.println("bah ba-bah");
    }
    void playTopHat() {
        System.out.println("din don");
    }
}
class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();
        d.platSnare();
        d.snare = false;
        d.playTopHat();

        if (d.snare == true) {
            d.platSnare();
        }
    }
}
