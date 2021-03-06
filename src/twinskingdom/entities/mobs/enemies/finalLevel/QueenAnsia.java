/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  twinskingdom.entities.mobs.enemies.finalLevel;

import java.awt.Graphics;
import  twinskingdom.entities.mobs.Creature;
import  twinskingdom.gfx.FireBallAssets;
import  twinskingdom.gfx.QueenAnsiaAssets;
import  twinskingdom.policies.HorizontalArcherPolicy;
import  twinskingdom.policies.VerticalArcherPolicy;
import  twinskingdom.utils.UtilityTimer;

/**
 * This class implements the game final boss twin, which appears corresponding
 * to lady paranoia last health point remaining. It stands still until the level
 * ending. 
 */
public class QueenAnsia extends Creature {

    FireBallAssets fireBallAsset = new FireBallAssets();
    private UtilityTimer policyTimer;
    private boolean vertical = false;
    private VerticalArcherPolicy verticalPolicy;
    private HorizontalArcherPolicy horizontalPolicy;

    public QueenAnsia(float x, float y, QueenAnsiaAssets queenAnsiaAssets) {
        super(x, y, 80, Creature.DEFAULT_HEIGHT, queenAnsiaAssets);
        //weapons = new LinkedList();

        //verticalPolicy = new VerticalArcherPolicy(handler, this,(int) (getY()-300), (int)(getY()+300));
        //horizontalPolicy = new HorizontalArcherPolicy(handler, this,(int) (getX()-300), (int)(getX()+300));
        /*
        setMovementPolicy(new HorizontalArcherPolicy(this, (int) (getX() - 300), (int) (getX() + 300)));
                for (int i = 0; i < 10; i++) {
            weapons.add(createWeapon());
        }
         */
        //setMovementPolicy(verticalPolicy);
        bounds.x = 25;
        bounds.y = 30;
        bounds.width = 15;
        bounds.height = 22;
        health.setHealthPoints(1);
        health.setLives(1);
        //Asset.init();
        //fireBallAsset.init();
        //policyTimer = new UtilityTimer(100000);
    }

    /***
     * This tick method only implements the class state tick because the character
     * stands still until the level ending. 
     */
    @Override
    public void tick() {
        state.tick();
        //Cambio policy dopo un certo tempo

        //Animations
        //Per update the index
        /*
        
        //Movement
        getMovement();
        move();

        if (policyTimer.isTimeOver()) {
            if (vertical) {
                setMovementPolicy(new HorizontalArcherPolicy(this, (int) (getX() - 300), (int) (getX() + 300)));
                vertical = false;
            } else {

                setMovementPolicy(new VerticalArcherPolicy(this, (int) (getY() - 300), (int) (getY() + 300)));
                vertical = true;
            }
        }
         */
    }

    /*
    @Override
    public FireBall createWeapon() {
        FireBall fireBall = createWeapon((int) getX() + 300, (int) getY() - 300, 48, 48);
        return fireBall;
    }

    @Override
    public FireBall createWeapon(int x, int y, int width, int height) {
        FireBall fireBall = new FireBall( x, y, width, height);
        fireBall.setState(new RightMovementState(fireBall, fireBallAsset));
        return fireBall;
    }  
     */
    
    /***
     * As the tick case, this method implements only the state render.
     * @param g 
     */
    @Override
    public void render(Graphics g) {
        state.render(g);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void die() {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
