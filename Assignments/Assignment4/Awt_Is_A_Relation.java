import java.awt.Frame;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;

class Awt_Is_A_Relation extends Frame {
	public static void main(String[] args) {
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

		// Declaring a Awt_Is_A_Relation object. 
		Awt_Is_A_Relation is_A_Reln = new Awt_Is_A_Relation();

		is_A_Reln.add(num1);
		is_A_Reln.add(num2);
		is_A_Reln.add(result);

		is_A_Reln.add(add);
		is_A_Reln.add(subtract);
		is_A_Reln.add(divide);
		is_A_Reln.add(multiply);

		is_A_Reln.add(label1);
		is_A_Reln.add(label2);
		is_A_Reln.add(label3);

		is_A_Reln.setSize(900, 900);
		is_A_Reln.setLayout(null);    
		is_A_Reln.setVisible(true);
	}
}