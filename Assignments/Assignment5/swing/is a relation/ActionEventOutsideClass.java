import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ActionEventOutsideClass extends Frame{
    double c = 0.0;
  
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
  
    //Setting Text Fields
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
    JTextField result = new JTextField();
  
    //Setting Buttons
    JButton add = new JButton("Add");
    JButton subtract = new JButton("Subtract");
    JButton divide = new JButton("Divide");
    JButton multiply = new JButton("Multiply");
    
  ActionEventOutsideClass(){
		label1.setText("Number 1: ");
		label1.setBounds(30, 100, 100, 30);

		label2.setText("Number 2: ");
		label2.setBounds(30, 150, 100, 30);

		label3.setText("Result: ");
		label3.setBounds(30, 200, 100, 30);



		num1.setBounds(140, 100, 270, 30);
		num2.setBounds(140, 150, 270, 30);
		result.setBounds(140, 200, 270, 30);


		add.setBounds(10, 250, 100, 50);
		subtract.setBounds(110, 250, 100, 50);
		divide.setBounds(210, 250, 100, 50);
		multiply.setBounds(310, 250, 100, 50);

    
    add.addActionListener(new EventHandler(this));    
    subtract.addActionListener(new EventHandler(this));
    divide.addActionListener(new EventHandler(this));
    multiply.addActionListener(new EventHandler(this));
    
    add(num1);
    add(num2);
    add(result);

    add(add);
    add(subtract);
    add(divide);
    add(multiply);
    
    add(num1Label);
    add(num2Label);
    add(resultLabel);

    setSize(900, 900);
    setLayout(null);    
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ActionEventWithinClass();
  }
}

class EventHandler implements ActionListener {
  
  ActionEventOutsideClass obj;

  public EventHandler(ActionEventOutsideClass obj) {
    this.obj = obj;
  }

  public void actionPerformed(ActionEvent e){
    String number1 = obj.num1.getText();
    String number2 = obj.num2.getText();
    double c = 0.0;
    
    try{
      double a = Double.parseDouble(number1);
      double b = Double.parseDouble(number2);
    if (e.getSource() == obj.add){    
        c = a + b;    
    } else if (e.getSource() == obj.subtract){    
        c = a - b;    
    } else if (e.getSource() == obj.divide) {
          c = a / b;
    } else if (e.getSource() == obj.multiply){    
        c = a * b;    
    }
    } catch (Exception error) {
      obj.result.setText("Give valid Input");
    } 

    String outcome = String.valueOf(c);
    obj.result.setText(outcome);
	}
}
