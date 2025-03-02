package business;

import java.util.Objects;

/**
 * @author michelle
 */
public class Song {
    private String artist;
    private String title;

    /**
     * Constructor setting the artist and title to a default value of "Joe Bloggs" and "Mmmbops"
     */
    public Song() {
        this.artist = "Joe Bloggs";
        this.title = "Mmmbops";
    }

    /**
     * Construct a song object to a specified artist or title
     *
     * @param artist The name of the artist
     * @param title  The title of the song
     */
    public Song(String artist, String title) {
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
    public void setArtist() {
        this.artist = artist;
    }

    /**
     * @return The title of the song
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set a new title of the song
     */
    public void setTitle() {
        this.title = title;
    }

    /**
     * Checks supplied object against the current song for equality. Equality is based on
     * artist and title both being identical.
     *
     * @param o The object being compared against.
     * @return True if artist and title match; false if the object supplied is not a Song or
     * artist and title do not match.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Song)) {
            return false;
        }
        Song s = (Song) o;

        if (!this.artist.equals(s.artist)) {
            return false;
        }
        if (!this.title.equals(s.title)) {
            return false;
        }
        return true;
    }

    /**
     * @return Generate the hashcode value for the object
     */
    @Override
    public int hashCode() {
        int hash = 13;
        hash = hash + (11 * Objects.hash(this.artist));
        hash = hash + (11 * Objects.hash(this.title));
        return hash;
    }

    /**
     * @return The string version of the artist and title object
     */
    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
