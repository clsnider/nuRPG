/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldObjects;

/**
 *  Used for non-basic attacks and magic spells.
 * @author Clayton Snider  06/03/2016
 * @version 1.0
 */
public class Skill {
    private String name;
    private int cost;
    private int effect;
    private Character target;
    
    //constructor
    public Skill(String initName, int initCost, int initEffect)
    {
        this.name = initName;
        this.cost = initCost;
        this.effect = initEffect;
    }
    
    //getters and setters
    public String getName()
    {
        return this.name;
    }
    
    public int getCost()
    {
        return this.cost;
    }
    
    public int getEffect()
    {
        return this.effect;
    }
    
    public void setName(String initName)
    {
        this.name = initName;
    }
    
    public void setCost(int initCost)
    {
        this.cost = initCost;
    }
    
    public void setEffect(int initEffect)
    {
        this.effect = initEffect;
    }
    
    public String getTarget()
    {
        return this.target.getName();
    }
    
    public void setTarget(Character initTarget)
    {
        this.target = initTarget;
    }
    
}
