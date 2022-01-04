import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Swing_Has_A_Relation {
	public static void main(String[] args){
		// Setting Labels
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();

		// setBounds(int x-coordinate, int y-coordinate, int width, int height
		label1.setText("Number 1: ");
		label1.setBounds(30, 100, 100, 30);

		label2.setText("Number 2: ");
		label2.setBounds(30, 150, 100, 30);

		label3.setText("Result: ");
		label3.setBounds(30, 200, 100, 30);


		//Setting Text Fields
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JTextField result = new JTextField();

		num1.setBounds(140, 100, 270, 30);
		num2.setBounds(140, 150, 270, 30);
		result.setBounds(140, 200, 270, 30);


		//Setting Buttons
		JButton add = new JButton("Add");
		JButton subtract = new JButton("Subtract");
		JButton divide = new JButton("Divide");
		JButton multiply = new JButton("Multiply");

		add.setBounds(10, 250, 100, 50);
		subtract.setBounds(110, 250, 100, 50);
		divide.setBounds(210, 250, 100, 50);
		multiply.setBounds(310, 250, 100, 50);


		// Declaring a JFrame object. 
		JFrame f = new JFrame("My Calculator");

		// Adding labels into the JFrame
		f.add(label1);
		f.add(label2);
		f.add(label3);

		//Adding text fields into the JFrame
		f.add(num1);
		f.add(num2);
		f.add(result);

		//Adding buttons into the JFrame
		f.add(add);
		f.add(subtract);
		f.add(divide);
		f.add(multiply);
		

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}