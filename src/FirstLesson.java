public class FirstLesson {
    public static void main(String[] args) {
        String[] wordListOne = {"new","amazing","lovely", "frontend","3000f","clever"};
        String[] wordListTwo = {"clean","honest","favorite","laptop","somebody"};
        String[] wordListThree = {"RAM","computer","operation","system","java"};
        int lengthOne = wordListOne.length;
        int lengthTwo = wordListTwo.length;
        int lengthThree = wordListThree.length;
        int randOne = (int) (Math.random() * lengthOne);
        int randTwo = (int) (Math.random() * lengthTwo);
        int randThree = (int) (Math.random() * lengthThree);
        String text = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];
        System.out.print(text);
    }
}
