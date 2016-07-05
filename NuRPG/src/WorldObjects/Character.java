/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorldObjects;

import Rules.DiceBag;

/**
 * Contains attributes and behaviors of characters in the game, both those
 * controlled by the player and the NPCs.
 * 
 *Created 1/30/2016
 * @version 1.0
 * @author Clayton Snider
 */
public class Character {
    
    private String name;    //stores the character's name
    /*
        Stores the vital statistics of each character. The maxHP value holds
        the maximum Hit Points (HP), while the maxMP does the same for the 
        maximum Magic Points (MP). The HP and MP values store the current
        total of each, and they cannot exceed the maximum values.
    */
    
    //Icon profile = new ImageIcon(getClass().getResource());
    private int maxHP, maxMP, HP, MP; 
    
    //declare ability scores common to all characters
    private int agility, strength, brains, spirit, life;
    
    private Item weapon;
    
    private Skill skill;
    
    private Character target;
    
    //constructor for Character objects
    public Character(String initName, int initMaxHP, int initMaxMP, 
            int initAgility, int initStrength, int initBrains, int initSpirit,
            int initLife)
    {
        this.name = initName;
        this.maxHP = initMaxHP;
        this.HP = maxHP;
        this.maxMP = initMaxMP;
        this.MP = maxMP;
        this.agility = initAgility;
        this.strength = initStrength;
        this.brains = initBrains;
        this.spirit = initSpirit;
        this.life = initLife;
    }
    
    //getters and setters
    public String getName()
    {
        return this.name;
    }
    public int getMaxHP()
    {
        return this.maxHP;
    }
    public int getHP()
    {
        return this.HP;
    }
    public int getMaxMP()
    {
        return this.maxMP;
    }
    public int getMP()
    {
        return this.MP;
    }
    public int getAgility()
    {
        return this.agility;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public int getBrains()
    {
        return this.brains;
    }
    public int getSpirit()
    {
        return this.spirit;
    }
    public int getLife()
    {
        return this.life;
    }
    
    public Item getWeapon()
    {
        return weapon;
    }
    public void setName(String initName)
    {
        this.name = initName;
    }
    
    public void setMaxHP (int initHP)
    {
        this.maxHP = initHP;
    }
    
    public void setHP(int initHP)
    {
        this.HP = initHP;
    }
    
    public void setMaxMP (int initMP)
    {
        this.maxMP = initMP;
    }
    
    public void setAgility(int initAgility)
    {
        this.agility = initAgility;
    }
    
    public void setBrains(int initBrains)
    {
        this.brains = initBrains;
    }
    
    public void setLife (int initLife)
    {
        this.life = initLife;
    }
    
    public void setSpirit(int initSpirit)
    {
        this.spirit = initSpirit;
    }
    
    public void setStrength(int initStrength)
    {
        this.strength = initStrength;
    }
    
    public void setWeapon(Item initWeapon)
    {
        this.weapon = initWeapon;
    }
    
    public void setSkill(Skill initSkill)
    {
        this.skill = initSkill;
    }
    
    public Skill getSkill()
    {
        return skill;
    }
    
    public Character getTarget()
    {
        return target;
    }
    
    public void setTarget(Character initTarget)
    {
        this.target = initTarget;
    }
    public int attack()
    {
        int damage = strength + weapon.getEffect();
        return damage;
    }
    
    public int takeDamage(int damage)
    {
        this.HP = HP - damage;
        return HP;
    }
    
    public int useSkill(Skill skill)
    {
        this.MP = MP - skill.getCost();
        int damage = this.brains + skill.getEffect() + DiceBag.rollD6();
        return damage;
    }
    
}
