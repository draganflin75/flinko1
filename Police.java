import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Police here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Police extends Person
{
    private String up;
    private String down;
    private String left;
    private String right;
    
    /**
     * Act - do whatever the Police wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Police(String up,String down,String left,String right)
    {
       this.up=up;
       this.down=down;
       this.left=left;
       this.right=right;
           }
    
    public void act()
    {   
        super.act();
        if(this.isTouching(Robber.class))
        {
            World world=this.getWorld();
            Beach beach=(Beach)world;
            beach.endTheGame(true);
            //Greenfoot.stop();
            
            
        }
        
    }
    public void movement()
    {
        int x=this.getX();
        int y=this.getY();
        
        if (Greenfoot.isKeyDown(this.up))
        {
            this.setRotation(270);
              //this.move(1);
              y--;
              this.setRotation(0);
        }else
        if (Greenfoot.isKeyDown(this.down))
        {
            this.setRotation(90);
              y++;
            // this.move(1);
             this.setRotation(0);
        }else if (Greenfoot.isKeyDown(this.right))
        {
            this.setRotation(0);
              //this.move(1);
              x++;
              this.setRotation(0);
        }
        else if (Greenfoot.isKeyDown(this.left))
        {
            this.setRotation(180);
              //this.move(1);
              x--;
              this.setRotation(0);
        }
        if (this.getWorld().getObjectsAt(x,y,HiddingSpot.class).isEmpty())
        {
            this.setLocation(x,y);
        }
    }
}
