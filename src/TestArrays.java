public class TestArrays {
    public static void main(String[] args) {
        String [] island = new String[4];
        island[0] = "Bermyd";
        island[1] = "Fidzhi";
        island[2] = "Azor";
        island[3] = "Kosymel";

        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;
        while (y < 4) {
            ref = index[y];
            y = y + 1;
            System.out.print("island = ");
            System.out.println(island[ref]);
        }
    }
}
