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
public final class Artist extends Link {
    private String name;
    private String alias;

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
        if(name.isEmpty()) 
            throw new NullPointerException("Name should be filled"); 
        
        this.name = name;
    }

    public void setAlias(String alias) {
        if(name.isEmpty()) 
            throw new NullPointerException("Alias should be filled"); 
        
        this.alias = alias;
    }
}
