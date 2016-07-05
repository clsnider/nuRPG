/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI.GUITest;

import UI.BattleMenu;
import UI.CharBattPanel;
import UI.CharPanel;
import UI.InGameMenu;
import UI.NullBattPanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import WorldObjects.Character;
import WorldObjects.Item;
import WorldObjects.Skill;
import javax.swing.BoxLayout;

/**
 * Tests the GUIs.
 * @author  Clayton Snider
 * @version 1.0
 */
public class Test1 extends JFrame{
    private static final int WIDTH = 400;
    private static final int HEIGHT = 500;
    
    private CharBattPanel playPanel, enPanel;
    private BattleMenu bMenu;
    private InGameMenu gMenu;
    private static Character player, enemy;
    private NullBattPanel[] nullPanel = new NullBattPanel[6];
    
    public Test1()
    {
        setTitle("GUI Test 1");
        setSize(WIDTH, HEIGHT);
        
        
        Container pane = getContentPane();
        GridLayout mainGrid = new GridLayout(5,2);
        pane.setLayout(mainGrid);
        
        playPanel = new CharBattPanel(player);
        enPanel = new CharBattPanel(enemy);
        for(int i = 0; i < nullPanel.length; i++)
        {
            nullPanel[i] = new NullBattPanel();
        }
        bMenu = new BattleMenu();
        gMenu = new InGameMenu();
        
        //pane.setLayout(new BoxLayout(pane, BoxLayout.X_AXIS));
        pane.add(playPanel);
        pane.add(enPanel);
        for (NullBattPanel nullPanel1 : nullPanel) {
            pane.add(nullPanel1);
        }
        pane.add(bMenu);
        pane.add(gMenu);
    }
    
    public static void main(String[]args)
    {
        //create test WorldObjects
        player = new Character("Bob", 100, 10, 10, 10, 10,10,10);
        enemy = new Character("Orc", 100, 10, 10, 10, 10,10,10);
        Item sword = new Item("Sword", 3, 3, 15);
        Item axe = new Item("Axe", 5, 5, 20);
        Skill bolt = new Skill("Bolt", 3, 25);
        Skill cure = new Skill ("Cure", 3, -50);
        player.setWeapon(sword);
        player.setSkill(cure);
        enemy.setWeapon(axe);
        enemy.setSkill(bolt);
        player.setTarget(enemy);
        enemy.setTarget(player);
        
        Test1 test = new Test1();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
        
       
        
    }
            
    
}
