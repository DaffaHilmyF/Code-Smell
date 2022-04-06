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
public class Link {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if(url.isEmpty()) 
            throw new NullPointerException("Url should be filled");
        
        this.url = url;
    }
}
