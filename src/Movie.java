public class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("Play movie");
    }
}
class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to burn out on stocks";
        one.genre = "Tragedy";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in the office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Byte club";
        three.genre = "Tragic but overall fun";
        three.rating = 127;
    }
}
