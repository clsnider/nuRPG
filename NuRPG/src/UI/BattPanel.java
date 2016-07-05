/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import javax.swing.JPanel;

/**
 *
 * @author  Clayton Snider
 * @version 1.0
 */
public abstract class BattPanel extends JPanel {
    private static final int WIDTH = 40;
    private static final int HEIGHT = 20;
    
    public BattPanel()
    {
        setSize(WIDTH, HEIGHT);
    }

}
