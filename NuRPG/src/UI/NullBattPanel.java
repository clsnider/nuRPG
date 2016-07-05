/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author  Clayton Snider
 * @version 1.0
 */
public class NullBattPanel extends BattPanel {
    
    
    public NullBattPanel()
    {
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

}
