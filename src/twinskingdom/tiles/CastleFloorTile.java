/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  twinskingdom.tiles;

import  twinskingdom.gfx.Assets;

/**
 *
 *  
 */
public class CastleFloorTile extends Tile {

    public CastleFloorTile(int id) {
        super(Assets.castleFloor, id);
    }

    @Override
    public boolean isSolid() {
        return false;
    }
}
