public class HeadTask2 {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x = x + 1; //не было счётчика
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}
