package business;

/**
 *
 * @author michelle
 */
public class Song {
    private String artist;
    private String title;

    public Song(){
        this.artist = "Joe Bloggs";
        this.title = "Mmmbops";
    }

    public Song(String artist, String title){
        this.artist = artist;
        this.title = title;
    }
//Getters and Setters
    public String getArtist() {
        return artist;
    }
    public void setArtist(){
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }
}
