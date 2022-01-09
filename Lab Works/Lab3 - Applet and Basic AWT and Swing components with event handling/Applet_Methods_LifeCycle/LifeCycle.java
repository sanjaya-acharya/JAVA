import java.applet.Applet;
import java.awt.Graphics;

class LifeCycle extends Applet
{
    public void init(){
        System.out.println("Applet initialized");
    }
    
    public void start(){
        System.out.println("Applet ready to run");
    }

    public void paint(Graphics g){
        g.drawString("Hello World!");
    }

    public void stop(){
        System.out.println("Applet stopped");
    }

    public void destroy(){
        System.out.println("Applet Destroyed");
    }
}
