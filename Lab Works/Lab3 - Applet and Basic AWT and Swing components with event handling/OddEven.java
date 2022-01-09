import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OddEven {
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();

	// Setting Text Fields
	JTextField num1 = new JTextField();
	JTextField result = new JTextField();

	// Setting Buttons
	JButton check = new JButton("Check");

	OddEven() {
		label1.setText("Number 1: ");
		label1.setBounds(30, 100, 100, 30);

		label2.setText("Result: ");
		label2.setBounds(30, 150, 100, 30);

		num1.setBounds(140, 100, 270, 30);
		result.setBounds(140, 150, 270, 30);

		check.setBounds(10, 250, 100, 50);

        check.addActionListener(new EventHandler(this));

		JFrame f = new JFrame("Odd Even");
		f.add(num1);
		f.add(result);

		f.add(check);

		f.add(label1);
		f.add(label2);

		f.setSize(900, 900);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new OddEven();
	}
}

class EventHandler implements ActionListener {

	OddEven obj;

	public EventHandler(OddEven obj) {
		this.obj = obj;
	}

	public void actionPerformed(ActionEvent e) {
		String number1 = obj.num1.getText();
        String res;

		try {
			double a = Double.parseDouble(number1);
			if (e.getSource() == obj.check) {
				if (a % 2 == 0)
                    res = "Even number";
                else
                    res = "Odd number";

                obj.result.setText(res);
			}
		} catch (Exception error) {
			obj.result.setText("Invalid Input");
		}
	}
}