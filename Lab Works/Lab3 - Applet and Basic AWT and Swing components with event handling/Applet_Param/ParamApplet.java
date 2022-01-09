import java.applet.Applet;
import java.awt.Graphics;

class ParamApplet extends Applet
{
	String name;

	public void init()
	{
		name =  getParameter("parameterName");
	}

	public void paint(Graphics g)
	{
		g.drawString(name, 100, 100);
	}
}