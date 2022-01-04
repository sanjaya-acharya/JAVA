import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class Awt_Has_A_Relation {
	public static void main(String[] args){
		// Setting Labels
		Label label1 = new Label();
		Label label2 = new Label();
		Label label3 = new Label();

		// setBounds(int x-coordinate, int y-coordinate, int width, int height
		label1.setText("Number 1: ");
		label1.setBounds(10, 100, 70, 30);

		label2.setText("Number 2: ");
		label2.setBounds(10, 150, 70, 30);

		label3.setText("Result: ");
		label3.setBounds(10, 200, 70, 30);


		//Setting Text Fields
		TextField num1 = new TextField();
		TextField num2 = new TextField();
		TextField result = new TextField();

		num1.setBounds(100, 100, 220, 30);
		num2.setBounds(100, 150, 220, 30);
		result.setBounds(100, 200, 220, 30);


		//Setting Buttons
		Button add = new Button("Add");
		Button subtract = new Button("Subtract");
		Button divide = new Button("Divide");
		Button multiply = new Button("Multiply");

		add.setBounds(10, 250, 75, 50);
		subtract.setBounds(85, 250, 75, 50);
		divide.setBounds(160, 250, 75, 50);
		multiply.setBounds(235, 250, 75, 50);


		// Declaring a Frame object. 
		Frame f = new Frame("My Calculator");

		// Adding labels into the frame
		f.add(label1);
		f.add(label2);
		f.add(label3);

		//Adding text fields into the frame
		f.add(num1);
		f.add(num2);
		f.add(result);

		//Adding buttons into the frame
		f.add(add);
		f.add(subtract);
		f.add(divide);
		f.add(multiply);
		

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}