import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui extends JFrame {
	private JTextField answerField;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, multiply, div, equals;
	private String stemp1, stemp2, sanswer;
	private double answer = 0.0;
	private JPanel contentPanel;
	private boolean equalsClicked = false, opChoosen = false;
	char operation = ' ';
	
	public gui(){
		super("Calculator");
		answerField = new JTextField(null, 15);
		answerField.setEditable(false);
		
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		add= new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		div = new JButton("/");
		equals = new JButton("=");
		
		Dimension dim = new Dimension(75, 50);
		
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		six.setPreferredSize(dim);
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		nine.setPreferredSize(dim);
		zero.setPreferredSize(new Dimension(225, 50));
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		div.setPreferredSize(dim);
		equals.setPreferredSize(dim);
		
		Numbers n = new Numbers();
		Calc c = new Calc();
	
		one.addActionListener(n); two.addActionListener(n); three.addActionListener(n); four.addActionListener(n);
		five.addActionListener(n); six.addActionListener(n); seven.addActionListener(n); eight.addActionListener(n);
		nine.addActionListener(n);  zero.addActionListener(n);
		
		add.addActionListener(c); sub.addActionListener(c); multiply.addActionListener(c); div.addActionListener(c);
		equals .addActionListener(c);
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.ORANGE);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerField, BorderLayout.NORTH);
		contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four);
		contentPanel.add(five); contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight);
		contentPanel.add(nine); contentPanel.add(zero); contentPanel.add(add); contentPanel.add(sub);
		contentPanel.add(multiply); contentPanel.add(div); contentPanel.add(equals);
		
		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed (ActionEvent event){
			JButton src = (JButton) event.getSource();
			if(src.equals(one)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "1";
					}else{
						stemp1 += "1";
					}
				}else{
					if(stemp2==null){
						stemp2 = "1";
					}else{
						stemp2 += "1";
					}
				}
			}
			if(src.equals(two)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "2";
					}else{
						stemp1 += "2";
					}
				}else{
					if(stemp2==null){
						stemp2 = "2";
					}else{
						stemp2 += "2";
					}
				}
			}
			if(src.equals(three)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "3";
					}else{
						stemp1 += "3";
					}
				}else{
					if(stemp2==null){
						stemp2 = "3";
					}else{
						stemp2 += "3";
					}
				}
			}
			if(src.equals(four)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "4";
					}else{
						stemp1 += "4";
					}
				}else{
					if(stemp2==null){
						stemp2 = "4";
					}else{
						stemp2 += "4";
					}
				}
			}
			if(src.equals(five)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "5";
					}else{
						stemp1 += "5";
					}
				}else{
					if(stemp2==null){
						stemp2 = "5";
					}else{
						stemp2 += "5";
					}
				}
			}
			if(src.equals(six)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "6";
					}else{
						stemp1 += "6";
					}
				}else{
					if(stemp2==null){
						stemp2 = "6";
					}else{
						stemp2 += "6";
					}
				}
			}
			if(src.equals(seven)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "7";
					}else{
						stemp1 += "7";
					}
				}else{
					if(stemp2==null){
						stemp2 = "7";
					}else{
						stemp2 += "7";
					}
				}
			}
			if(src.equals(eight)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "8";
					}else{
						stemp1 += "8";
					}
				}else{
					if(stemp2==null){
						stemp2 = "8";
					}else{
						stemp2 += "8";
					}
				}
			}
			if(src.equals(nine)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "9";
					}else{
						stemp1 += "9";
					}
				}else{
					if(stemp2==null){
						stemp2 = "9";
					}else{
						stemp2 += "9";
					}
				}
			}
			if(src.equals(zero)){
				if(opChoosen==false){
					if(stemp1==null){
						stemp1 = "0";
					}else{
						stemp1 += "0";
					}
				}else{
					if(stemp2==null){
						stemp2 = "0";
					}else{
						stemp2 += "0";
					}
				}
			}
			if(equalsClicked==false){
				if(opChoosen==false){
					answerField.setText(stemp1);
				}else{
					answerField.setText(stemp2);
				}
			}
		}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed (ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(add)){
				if(stemp1==null){
					System.out.println("choose your numbers first!");
				}else 
					if(stemp1 != null && stemp2 == null){
					opChoosen = true;
					operation = '+';
					}else
						if(stemp1 != null && stemp2 != null){
							System.out.println("Two Operation only");
						}
			}
			if(src.equals(sub)){
				if(stemp1==null){
					System.out.println("Choose your numbers first!");
				}else 
					if(stemp1 != null && stemp2 == null){
					opChoosen = true;
					operation ='-';
					}else
						if(stemp1 != null && stemp2 != null){
							System.out.println("Two Operation only");
						}
			}
			if(src.equals(multiply)){
				if(stemp1==null){
					System.out.println("Choose your numbers first!");
				}else 
					if(stemp1 != null && stemp2 == null){
					opChoosen = true;
					operation = '*';
					}else
						if(stemp1 != null && stemp2 != null){
							System.out.println("Two Operation only");
						}
			}
			if(src.equals(div)){
				if(stemp1==null){
					System.out.println("Choose yournumbers first!");
				}else 
					if(stemp1 != null && stemp2 == null){
					opChoosen = true;
					operation = '/';
					}else
						if(stemp1 != null && stemp2 != null){
							System.out.println("Two Operation only");
						}
			}
			if(src.equals(equals)){
				if(stemp1==null){
					System.out.println("Choose yournumbers first!");
				}else 
					if(stemp1 != null && stemp2 == null){
						System.out.println("Choose both numbers first!");
					}
				if(stemp1 != null && stemp2 != null){
					double d1 = 0.0, d2 = 0.0;
					
					d1 = Double.parseDouble(stemp1);
					d2 = Double.parseDouble(stemp2);
					
					switch(operation){
					case '+':
						answer = d1 + d2;
						break;
					case '-':
						answer = d1 - d2;
						break;
					case '*':
						answer = d1 * d2;
						break;
					case '/':
						answer = d1 / d2;
						break;
					}
					sanswer = Double.toString(answer);
					answerField.setText(sanswer);
				}
			}	
			
		}
	}
	
}












