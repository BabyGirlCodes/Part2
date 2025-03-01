package business;

/**
 *
 * @author michelle
 */
public class Song {
    private String artist;
    private String title;

    /**
     * Constructor setting the artist and title to a default value of "Joe Bloggs" and "Mmmbops"
     */
    public Song(){
        this.artist = "Joe Bloggs";
        this.title = "Mmmbops";
    }

    /**
     * Construct a song object to a specified artist or title
     * @param artist  The name of the artist
     * @param title The title of the song
     */
    public Song(String artist, String title){
        this.artist = artist;
        this.title = title;
    }

    /**
     * @return the name of the artist
     */
//Getters and Setters
    public String getArtist() {
        return artist;
    }

    /**
     * Set a new artist name
     */
    public void setArtist(){
        this.artist = artist;
    }

    /**
     * @return The title of the song
     */
    public String getTitle(){
        return title;
    }

    /**
     * Set a new title of the song
     */
    public void setTitle(){
        this.title = title;
    }
}
