import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ActionEventWithinClass implements ActionListener{
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

      ActionEventWithinClass(){    
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
    
    add.addActionListener(this);    
    subtract.addActionListener(this);
    divide.addActionListener(this);
    multiply.addActionListener(this);
    
    JFrame f = new JFrame("Calculator");
    f.add(num1);
    f.add(num2);
    f.add(result);

    f.add(add);
    f.add(subtract);
    f.add(divide);
    f.add(multiply);
    
    f.add(label1);
    f.add(label2);
    f.add(label3);

    f.setSize(900, 900);
    f.setLayout(null);    
    f.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e){
    String number1 = num1.getText();
    String number2 = num2.getText();
    double c = 0.0;
    
    try{
      double a = Double.parseDouble(number1);
      double b = Double.parseDouble(number2);
      if (e.getSource() == add){    
          c = a + b;    
      } else if (e.getSource() == subtract){    
          c = a - b;    
      } else if (e.getSource() == divide) {
          // try{
            c = a / b;
          // } catch (ArithmeticException error) {
          //   result.setText("Cannot " + error.getMessage());
          //   return;
          // }
      } else if (e.getSource() == multiply){    
          c = a * b;    
      }
      
      String outcome = String.valueOf(c);
      result.setText(outcome);
      } catch (Exception error) {
        result.setText("Give valid Input");
      } 

	}
  
  public static void main(String[] args) {
    new ActionEventWithinClass();
  }
}

