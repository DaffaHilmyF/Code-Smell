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
public final class Artist {
    private String name;
    private String alias;
    private String url;

    public Artist(String name, String alias, String url) {
        this.setName(name);
        this.setAlias(alias);
        this.setUrl(url);
    }
    
    public String getName() {
        return name;
    }
    
    public String getAlias() {
        return alias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    private void setUrl(String url) {
       this.url = url;
    }
}
