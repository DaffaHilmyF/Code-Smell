/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SongDetail;

import java.util.Date;

public final class Song {

  

    public enum GENRE {
        UNDEFINED, POP, ROCK, 
        HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE
    }
    
    private String id;
    private String title;
    private String url;
    private Date releaseYear;
    private GENRE genre;
    
    private Album album;
    private Artist artist;
    

    public Song(String id, String title, Date releaseYear, String url) {
        this.setId(id);
        this.setTitle(title);
        this.setReleaseYear(releaseYear);
        this.setUrl(url);
    }
    
    private void printSong(){
        
        System.out.println("Song Title: " + this.getTitle());
        System.out.println("Release Year: " + this.getReleaseYear());
        if(this.getGenre() != GENRE.UNDEFINED){
            System.out.println("Genre: " + this.getGenre().name());
        }
    }
    
    private void printAlbum(){
        System.out.println("Artist Name: " + this.artist.getName());
        System.out.println("Artist Alias: " + this.artist.getAlias());
    }
    
    private void printArtist(){
        System.out.println("Album Name: " + this.album.getName());
    }
    
    public void PrintSongInfoByLevel(int detailedLevel){
        int level = detailedLevel;
        if(level == 0){
            printSong();
        }else if(level == 1){
            printSong();
            printArtist();
        }else if(level == 2){
            printSong();
            printAlbum();
        }else if(level == 3){
            printSong();
            printArtist();
            printAlbum();
        }else{
            System.out.println("Your input invalid");
        }
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
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

    public GENRE getGenre() {
        return genre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(GENRE genre) {
        this.genre = genre;
    }
     
    private void setUrl(String url) {
        this.url = url;
    }
}
