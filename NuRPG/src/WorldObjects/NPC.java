/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldObjects;

/**
 *
 * @author Clayton Snider
 * @version 1.0
 */
public class NPC extends Character{
    
    boolean isHostile;

    public NPC(String initName, int initMaxHP, int initMaxMP, int initAgility, 
            int initStrength, int initBrains, int initSpirit, int initLife) 
    {
        super(initName, initMaxHP, initMaxMP, initAgility, initStrength, 
                initBrains, initSpirit, initLife);
    }
    
    public void setHostile(boolean initHostile)
    {
        this.isHostile = initHostile;
    }
    
    public boolean getHostile()
    {
        return isHostile;
    }
    
    public void decide()
    {
        if(this.getHP() <= 0)
        {
           attack(); 
        }
    }
    
}
