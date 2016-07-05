/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldObjects;

/**
 * Imitates behavior of objects the characters carry and use. Will eventually 
 * be abstacted to represent equipment and consumables.
 * @author Clayton Snider   6/1/2016
 * @version 1.0
 */
public class Item {
    private String name;
    private int weight;
    private int price;
    private int effect;
    
    public Item (String initName, int initWeight, int initPrice, int initEffect)
    {
        this.name = initName;
        this.weight = initWeight;
        this.price = initPrice;
        this.effect = initEffect;
    }
    
    //getters and setters
    public String getName()
    {
        return this.name;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    public int getEffect()
    {
        return this.effect;
    }
    
    public void use()
    {}
    
    
}
