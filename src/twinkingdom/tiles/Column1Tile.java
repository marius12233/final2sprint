/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twinkingdom.tiles;

import twinkingdom.gfx.Assets;

/**
 *
 * @author Angelica
 */
public class Column1Tile extends Tile{
    
    public Column1Tile(int id) {
        super(Assets.throneRoom[2],id);
    }
    
    @Override
    public boolean isSolid() {
        return true;
    }
    
}