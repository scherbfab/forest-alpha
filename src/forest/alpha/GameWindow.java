/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forest.alpha;


/**
 *
 * @author fabianscherbauer
 */


import javax.swing.JFrame;


public class GameWindow extends JFrame {
    
    private final GamePanel forestGamePanel;
    
    public GameWindow() {
        
        this.forestGamePanel = new GamePanel();  
        
        add(forestGamePanel);
        pack();
        
        setTitle("forest-alpha");
        setLocation(10, 10);
        setResizable(false);
        
        setVisible(true);
    }
    

}
