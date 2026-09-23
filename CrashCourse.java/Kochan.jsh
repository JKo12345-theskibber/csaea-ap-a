import module java.base;
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
Song s1 = new Song("Blinding", "Weeknd", 200);
Song s2 = new Song("Heat", "Animals", 239);
Song s3 = new Song("Asitwas", "harry", 167);
Song s4 = new Song("Goodforu", "Olivia", 178);
s5 = new Song("Levitating", "Dualipa", 203)
Song s5 = new Song("levitating", "Dualipa", 203);
s1.title
s1.artist
s1.album
s1.lengthInSeconds
s1.releaseYear
s1.genre
s1.isExplicit
s1.plays
s1.play
s1.play();
s1.increasePlayCount()
s1.increasePlayCount();
s1.markAsFavorite();
s1.getArtistInfo();
s2.play();
s2.increasePlayCount();
s3.markAsFavorite();
s4.getArtistInfo();
s5.play();