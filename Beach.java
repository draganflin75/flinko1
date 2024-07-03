import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{

    /**
     * Constructor for objects of class Beach.
     * 
     */
    private int counter;
    
    public Beach()
    {    
        // Create a new world with 15x400 cells with a cell size of 1x1 pixels.
        super(15, 10, 60); 
        prepareTheBeach();
    }
    public void act()
    {
        counter--;
        if (counter==0)
        {
           
            this.endTheGame(false);
        }
    }
    private void prepareTheBeach()
    {
      this.addObject(new Police("w","s","a","d"),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        this.addObject(new Robber(),Greenfoot.getRandomNumber(this.getWidth()),Greenfoot.getRandomNumber(this.getHeight()));
        //this.addObject(new Police("w","s","a","d"),0,0);
        for(int i=0;i<10;i++)
        {
        int x=Greenfoot.getRandomNumber(this.getWidth());
          int  y=Greenfoot.getRandomNumber(this.getHeight());
        while(!this.getObjectsAt(x,y,Actor.class).isEmpty())
        {
            x=Greenfoot.getRandomNumber(this.getWidth());
            y=Greenfoot.getRandomNumber(this.getHeight());
        }
        this.addObject(new HiddingSpot(),x,y);
        }
        counter=1000;  
    
    }
    public void endTheGame(boolean win)
    {
        this.removeObjects(this.getObjects(Actor.class));
        int x=this.getWidth()/2;
        int y=this.getHeight()/2;
        if (win){        
        showText("The robber was caught. You win",x,y);
    }else
    {
        showText("The robber escaped You lost",x,y);
    }
    Greenfoot.delay(40);
    this.showText(null,x,y);
    prepareTheBeach();
    Greenfoot.stop();
    
    }
}
