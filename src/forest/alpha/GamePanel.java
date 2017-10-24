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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GamePanel extends JPanel {
    

  public static final String IMAGE_DIR = "images/";
    
  private final Dimension prefSize = new Dimension(1180, 780);
    
  //hier muss der background initialisiert werden
    
  private boolean gameOver = false;
  private int tanksDestroyedCounter = 0;
    
    
    
  public GamePanel() {        
    setFocusable(true);
    setPreferredSize(prefSize);
        
    //initGame();         
  }
  
   /* private void initGame () {
    setBackgroundImage(1);
    createGameObjects();
    }*/
    

}
