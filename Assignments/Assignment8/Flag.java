import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

class Flag extends JFrame{
	Flag(){
		setTitle("Nepal Flag");
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// Creating bigger flag to make the blue border
		int xCoordinateBlueBorder[] = {50, 550, 150, 550, 70, 70, 50};
		int yCoordinateBlueBorder[] = {50, 400, 400, 700, 700, 850, 850};

		Polygon blueBorder = new Polygon(xCoordinateBlueBorder,yCoordinateBlueBorder,xCoordinateBlueBorder.length);
		g.setColor(Color.BLUE);
		g.fillPolygon(blueBorder);

		// Creating smaller red flag inside the blue border
		int xCoordinateFlag[] = {70, 490, 90, 490, 70};
		int yCoordinateFlag[] = {100, 380, 380, 680, 680};

		Polygon flagNepal = new Polygon(xCoordinateFlag,yCoordinateFlag,xCoordinateFlag.length);
		g.setColor(Color.RED);
		g.fillPolygon(flagNepal);

		// drawArc(x, y, width, height, startAngle, arcAngle);
		g.setColor(Color.WHITE);
		// 150,265,100,75,-5,-170);
		// Drawing Moon == fillArc(x, y, width, height, startingAngle[-360,360], arcAngle[-360,360])
		g.fillArc(150, 265, 100, 70, 15, -210);

		// Sun
		g.fillArc(150, 540, 100, 100, 0, 360);
	}
	public static void main(String[] args){
		new Flag();
	}
}