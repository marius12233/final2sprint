/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  twinskingdom.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Observable;
import  twinskingdom.gfx.ImageLoader;
import  twinskingdom.utils.GrabbableStarCollection;

/**
 * This class describes a panel that must painted on GameGUI, where all the
 * stars collected by the player are displayed.
 */
public class StarsPanel extends ObservingPanel {

    private int actualStars;
    private int targetStars;
    private BufferedImage img;

    public StarsPanel() throws IOException {
        this.actualStars = 0;
        this.targetStars = 0;
        this.img = ImageLoader.loadImage("/gui/star_icon.png");
    }

    /**
     * Paints the number of stars collected.
     *
     * @param g Graphics object used to draw.
     */
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawImage(img, 0, 0, null);
        g.setColor(new Color(255, 222, 45));
        g.drawString(actualStars + "/" + targetStars, 18, 55);
    }

    /**
     * Updates the number of stars collected.
     *
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {

        GrabbableStarCollection sc = (GrabbableStarCollection) o;

        actualStars = sc.getSize();
        targetStars = sc.getMaxStars();
        repaint();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
