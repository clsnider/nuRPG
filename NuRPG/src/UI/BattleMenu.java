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
public class BattleMenu extends JPanel {
    private JButton attackB, itemB, skillB, escapeB;
    
    private AttackButtonHandler aBHandler;
    private ItemButtonHandler iBHandler;
    private SkillButtonHandler sBHandler;
    private EscapeButtonHandler eBHandler;
    
    public BattleMenu()
    {
        attackB = new JButton(" Attack ");
        aBHandler = new AttackButtonHandler();
        attackB.addActionListener(aBHandler);
        
        itemB = new JButton(" Item ");
        iBHandler = new ItemButtonHandler();
        itemB.addActionListener(iBHandler);
        
        skillB = new JButton(" Use Skill ");
        sBHandler = new SkillButtonHandler();
        skillB.addActionListener(sBHandler);
        
        escapeB = new JButton(" Escape ");
        eBHandler = new EscapeButtonHandler();
        escapeB.addActionListener(eBHandler);
        
        this.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        this.setLayout(new GridLayout(2,2));
        this.add(attackB);
        this.add(itemB);
        this.add(skillB);
        this.add(escapeB);
        
        
    }
    
    private class AttackButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            attackB.setText("I just attacked!");
        }
    }
    
    private class ItemButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            itemB.setText("Just used item!"); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class SkillButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            skillB.setText("Just used skill!"); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    private class EscapeButtonHandler implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            escapeB.setText("Did we escape?"); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
