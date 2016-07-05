/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import WorldObjects.Character;

/**
 * Creates a panel displaying a character's vital statistics.
 * @author  Clayton Snider
 * @version 1.0
 */
public class CharPanel extends JPanel {
    private static final int WIDTH = 40;
    private static final int HEIGHT = 100;
    private JLabel name, HP, MP, AGL, STR, BRN, SPR, LIF, WPN, WFX, SKL, SCT,
            SFX, pic;
    //Icon profile = new ImageIcon(getClass().getResource());
    
    public CharPanel(Character c)
    {
        setSize(WIDTH, HEIGHT);
        name = new JLabel(c.getName());
        HP = new JLabel ("HP: " + c.getHP() + "/" + c.getMaxHP());
        MP = new JLabel ("MP: "  + c.getMP() + "/" + c.getMaxMP());
        AGL = new JLabel ("AGL: " + c.getAgility());
        STR = new JLabel("STR: " + c.getStrength());
        BRN = new JLabel("BRN: " + c.getBrains());
        SPR = new JLabel("SPR: " + c.getSpirit());
        LIF = new JLabel("LIF: " + c.getLife());
        WPN = new JLabel("WPN: " + c.getWeapon().getName());
        WFX = new JLabel("WFX: " + c.getWeapon().getEffect());
        SKL = new JLabel("SKL: " + c.getSkill().getName());
        SCT = new JLabel("SCT: " + c.getSkill().getCost());
        SFX = new JLabel("SFX: " + c.getSkill().getEffect());
        //pic = new JLabel(profile);
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        //this.add(pic);
        this.add(name);
        this.add(HP);
        this.add(MP);
        this.add(AGL);
        this.add(STR);
        this.add(BRN);
        this.add(SPR);
        this.add(LIF);
        this.add(WPN);
        this.add(WFX);
        this.add(SKL);
        this.add(SCT);
        this.add(SFX);
    }
    
    
    
    
    
}
