/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Song;

/**
 *
 * @author daffa
 */
public class PrintSongDetails {
    private final Song song;
    private final Album album;
    private final Artist artist;

    public PrintSongDetails(Song song, Album album, Artist artist) {
        this.song = song;
        this.album = album;
        this.artist = artist;
    }
    
    private void songDetails(){
        boolean isUndefined = this.song.getGenre().equals(Song.SongGenre.UNDEFINED);
        
        System.out.printf("Song Title: %s\n", this.song.getTitle());
        System.out.printf("Release Year: %s\n", this.song.getReleaseYear());
        
        if(!isUndefined){
            System.out.printf("Genre: %s\n", this.song.getGenre().name());
        }
        
    }
    
    private void artistDetails(){
        System.out.printf("Artist Name: %s\n", this.artist.getName());
        System.out.printf("Artist Alias: %s\n", this.artist.getAlias());
    }
    
    private void albumDetails(){
        System.out.printf("Album Name: %s\n", this.album.getName());
    }
    
    
    public void PrintSongDetailsByLevel(int desiredLevel){
        int level = desiredLevel;
        
        switch(level){
            case 0:
                songDetails();
                break;
            case 1:
                songDetails();
                artistDetails();
                break;
            case 2:
                songDetails();
                albumDetails();
                break;
            case 3:
                songDetails();
                artistDetails();
                albumDetails();
                break;
            default:
                System.out.println("Your input invalid");
                break;
        }
        
    }
}
