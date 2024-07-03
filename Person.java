import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int delay;
    private int delayCounter;
    public Person()
    {
        this(3);
    }
    public Person(int delay)
    {
        this.delay=delay;
        this.delayCounter=0;
    }
    public void act()
    {
        if (this.delayCounter==this.delay)
            {
                movement();
                delayCounter=0;
            }
            else
            {
             delayCounter++;
            }
    }
    public abstract void movement();
    
        
    
}
