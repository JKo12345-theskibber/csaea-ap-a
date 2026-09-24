public class Song {
    // private instancce variables
    private String title;
    private String artist;
    private String album;
    private int lengthInSeconds;
    private int releaseYear;
    private String genre;
    private boolean isExplicit;
    private int plays;

    // constructor
    public Song(String title, String artist, int lengthInSeconds) {
        this.title = title;
        this.artist = artist;
        this.lengthInSeconds = lengthInSeconds;
        album = "Unknown";
        releaseYear = 2024;
        genre = "Unclassified";
        isExplicit = false;
        plays = 0;
    }
   
    // methods
    public void play() {
        plays = plays + 1;
        System.out.println(title + " by " + artist + " is now playing.");
    }
   
    public void increasePlayCount() {
        plays = plays + 1;
    }
   
    public void markAsFavorite() {
        if (isExplicit == true) {
            System.out.println(title + " is explicit but marked as favorite.");
        } else {
            System.out.println(title + " marked as favorite.");
        }
    }
   
    public void getArtistInfo() {
        System.out.println("Artist: " + artist + " | Song plays: " + plays);
    }
}