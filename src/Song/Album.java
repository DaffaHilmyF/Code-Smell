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
public final class Album extends Link{
    private String name;

    public Album(String name, String link) {
        this.setName(name);
        this.setUrl(link);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) 
            throw new NullPointerException("Name should be filled");
        
        this.name = name;
    }
}
