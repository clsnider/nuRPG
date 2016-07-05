/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import WorldObjects.Character;

/**
 *
 * @author  Clayton Snider
 * @version 1.0
 */
public class CharBattPanel extends BattPanel {
    
    private JLabel name, HP, MP;
    
    public CharBattPanel(Character c)
    {
        
        name = new JLabel(c.getName());
        HP = new JLabel ("HP: " + c.getHP() + "/" + c.getMaxHP());
        MP = new JLabel ("MP: "  + c.getMP() + "/" + c.getMaxMP());
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(name);
        this.add(HP);
        this.add(MP);
    }

}
