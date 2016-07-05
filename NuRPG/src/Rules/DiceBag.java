/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rules;

import java.util.Random;

/**
 *This class imitates a bag of polyhedral dice. It uses one of the random
 * number generators built-in to Java to simulate d4, d6, d8, d10, d12, d20 and
 * percentile dice.
 * 
 * @author Clayton Snider
 * @version 1.0
 */
public class DiceBag {
    //instantiates the Random class
    static Random roll = new Random();
    //used to store the face value of the die
    private static int face;
    
    public static int rollD4()
    {
        face = 1 + roll.nextInt(4);
        return face;
    }
    
    public static int rollD6()
    {
        face = 1 + roll.nextInt(6);
        return face;
    }
    
    public static int rollD8()
    {
        face = 1 + roll.nextInt(8);
        return face;
    }
    
    public static int rollD10()
    {
        face = 1 + roll.nextInt(10);
        return face;
    }
    
    public static int rollD12()
    {
        face = 1 + roll.nextInt(12);
        return face;
    }
    
    public static int rollD20()
    {
        face = 1 + roll.nextInt(20);
        return face;
    }
    
    public static int rollD100()
    {
        face = 1 + roll.nextInt(100);
        return face;
    }
    
    public static int getFace()
    {
      return face; 
    }
    
}
