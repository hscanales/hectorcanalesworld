/*
 * 
 * 
 * 
 */
package com.hscanales.clans;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class ClanFactory {
    
    
    public Clan ClanCreator(String type){
        
        String typeFix = type.toUpperCase();
        switch(typeFix){
            case "NOVAK":
                return new Novak();
                
            case "EMPIRES":
                return new Empires();
                
            case "BADLION":
                return new BadLion();
                
            
        }
        
        
        
        return null;
        
    }
    
}
