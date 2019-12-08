public class DogPrivatePublic {
    private int size;

    public int getSize() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Aw! Aw!");
        }
        else if (size > 14) {
            System.out.println("Wuf-Wuf");
        }
        else {
            System.out.println("Tyf-Tyf");
        }
    }
}

class DogPrivatePublicTestDrive {
    public static void main(String[] args) {
        DogPrivatePublic first = new DogPrivatePublic();
        first.setSize(70);
        DogPrivatePublic second = new DogPrivatePublic();
        second.setSize(43);
        System.out.println("First dog say's " + first.getSize());
        System.out.println(("Second dog say's " + second.getSize()));
        first.bark();
        second.bark();
    }
}
