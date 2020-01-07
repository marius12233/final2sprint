/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twinkingdom.game;

import java.util.LinkedList;
import java.util.List;
import twinkingdom.worlds.*;

/**
 *
 */
public class LevelHandler {

    private List<World> worlds;
    private int currentWorld;

    public LevelHandler() {
        
        this.currentWorld = 0;
        this.worlds = new LinkedList<>();
        this.worlds.add(new Forest());
        this.worlds.add(new Dungeon1());
        this.worlds.add(new Garden());
        this.worlds.add(new Dungeon2());
        this.worlds.add(new Castle());
        this.worlds.add(new Dungeon3());
    }

    public void setCurrentWorld(int id) {
        this.currentWorld = id;
    }
    
    public int getCurrentWorldId() {
        return this.currentWorld;
    }
    
    public World getCurrentWorld() {
        return this.worlds.get(currentWorld);
    }
    
    public World getNextWorld() {
        return ((currentWorld + 1 == this.worlds.size()) ? null : this.worlds.get(++currentWorld));
    }
    

}