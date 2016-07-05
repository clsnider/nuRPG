/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author  Clayton Snider
 * @version 1.0
 */
public class InGameMenu extends JPanel{
    private JButton charB, optionsB, exitB;
    
    private CharButtonHandler cBHandler;
    private OptionsButtonHandler oBHandler;
    private ExitButtonHandler eBHandler;
    
    public InGameMenu()
    {
        charB = new JButton(" Character ");
        cBHandler = new CharButtonHandler();
        charB.addActionListener(cBHandler);
        
        optionsB = new JButton(" Options ");
        oBHandler = new OptionsButtonHandler();
        optionsB.addActionListener(oBHandler);
        
        exitB = new JButton(" Exit ");
        eBHandler = new ExitButtonHandler();
        exitB.addActionListener(eBHandler);
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setLayout(new GridLayout(2,2));
        this.add(charB);
        this.add(optionsB);
        this.add(exitB);
    }
    
    private class CharButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class OptionsButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class ExitButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    

}
