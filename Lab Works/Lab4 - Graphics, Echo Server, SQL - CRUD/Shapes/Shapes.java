import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;

class Shapes extends JFrame {
	Shapes() {
		setTitle("Graphics Class");
		setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		// Circle (oval with equal width and height)
		g.setColor(Color.RED);
		g.fillOval(10, 50, 100, 100);

		// Ellipse (oval with different width and height)
		g.setColor(Color.BLUE);
		g.fillOval(200, 75, 150, 60);

		// Triangle (polygon with 3 sides)
		g.setColor(Color.YELLOW);
		int xTriangle[] = { 110, 210, 10 };
		int yTriangle[] = { 200, 300, 300 };
		Polygon triangle = new Polygon(xTriangle, yTriangle, xTriangle.length);
		g.fillPolygon(triangle);

		// Hexagon (polygon with 6 sides)
		g.setColor(Color.BLACK);
		int xHexagon[] = { 70, 150, 200, 150, 70, 20 };
		int yHexagon[] = { 350, 350, 400, 450, 450, 400 };
		Polygon hexagon = new Polygon(xHexagon, yHexagon, xHexagon.length);
		g.fillPolygon(hexagon);

		// Pentagon (polygon with 5 sides)
		g.setColor(Color.GREEN);
		int xPentagon[] = { 400, 500, 450, 350, 300 };
		int yPentagon[] = { 350, 400, 450, 450, 400 };
		Polygon pentagon = new Polygon(xPentagon, yPentagon, xPentagon.length);
		g.fillPolygon(pentagon);
	}

	public static void main(String[] args) {
		new Shapes();
	}
}