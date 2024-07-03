import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber extends Person
{
    /**
     * Act - do whatever the Robber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    
     public Robber()
    {
       super(15);
    }
    
    public void movement()
    {
        
        this.setRotation(90*Greenfoot.getRandomNumber(4));
        this.move(1);
        this.setRotation(0);
        
    }
}
