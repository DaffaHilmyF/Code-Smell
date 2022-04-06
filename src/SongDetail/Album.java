/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SongDetail;


/**
 *
 * @author daffa
 */
public final class Album{
    private String name;
    private String url;

    public Album(String name, String link) {
        this.setName(name);
        this.setUrl(link);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setUrl(String link) {
        this.url = link;
    }
}
