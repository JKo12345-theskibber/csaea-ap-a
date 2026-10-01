public class Movie {
   private String title;
   private int rating;

   public Movie(String t, int r) {
      title = t;
      rating = r;
   }

   public void printInfo() {
      System.out.println(title + " — Rating: " + rating);
   }
}