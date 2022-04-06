/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Song;

import java.util.Date;

/**
 *
 * @author daffa
 */
public final class Song extends Link {

    public enum SongGenre {
        UNDEFINED, POP, ROCK, 
        HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
    }
    
    private String id;
    private String title;
    private Date releaseYear;
    private SongGenre genre;
    

    public Song(String id, String title, Date releaseYear, String url) {
        this.setId(id);
        this.setTitle(title);
        this.setReleaseYear(releaseYear);
        this.setUrl(url);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public SongGenre getGenre() {
        return genre;
    }

    public void setId(String id) {
        if(id.isEmpty()) 
            throw new NullPointerException("Id should be filled");
        
        this.id = id;
    }

    public void setTitle(String title) {
        if(title.isEmpty()) 
            throw new NullPointerException("title should be filled");
        
        this.title = title;
    }

    public void setReleaseYear(Date releaseYear) {
        if(releaseYear.equals(null)) 
            throw new NullPointerException("release year should be filled");
        
        this.releaseYear = releaseYear;
    }

    public void setGenre(SongGenre genre) {
        this.genre = genre;
    }
    
}
