/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  twinskingdom.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * This class is used to display the entire game scene, where all the maps and
 * characters are displayed.
 */
public class GameScenePanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Border gameSceneBorder = BorderFactory.createLineBorder(new Color(232, 142, 0));
        this.setBorder(gameSceneBorder);
    }

}
