/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Song.*;
import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author daffa
 */
public class RefactorTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Album album = new Album("Hari Yang Cerah", "https://en.wikipedia.org/wiki/Hari_yang_Cerah");
        Artist artist = new Artist("Nazril Irham", "Ariel", "https://en.wikipedia.org/wiki/Ariel_(Indonesian_singer)");
        Song song = new Song("1", "Menghapus Jejakmu", Date.valueOf(LocalDate.of(2022, 1, 21)), "https://www.youtube.com/watch?v=nGMP3kYq2bE");
        song.setGenre(Song.SongGenre.POP);
        
        PrintSongDetails detail = new PrintSongDetails(song, album, artist);
        detail.PrintSongDetailsByLevel(0);
    }
    
}
