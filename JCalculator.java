package smJv;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class JSimpleCalculator implements ActionListener{
	JFrame fr;
	JLabel lbl0,lbl1,lbl2,lbl3;
	JTextField txt0,txt1,txt2;
	JButton bt0,bt1,bt2,bt3,bt4,bt5;
	public JSimpleCalculator()
	{
		fr=new JFrame(" <------------------------------- SIMPLE CALCULATOR WITH JAVA AWT FRAME, BUTTON, LABEL AND TEXTFIELD ! ------------------------------------------------------------------------------------>");
		lbl0=new JLabel(" Enter number1 ");
		lbl1=new JLabel(" Enter number2 ");
		lbl2=new JLabel(" Choose Operator ");
		lbl3=new JLabel(" Result ");
		bt0=new JButton("+");
		bt1=new JButton("-");
		bt2=new JButton("x");
		bt3=new JButton("/");
		bt4=new JButton("%");
		bt0.setBackground(Color.YELLOW);
		bt1.setBackground(Color.YELLOW);
		bt2.setBackground(Color.YELLOW);
		bt3.setBackground(Color.YELLOW);
		bt4.setBackground(Color.YELLOW);
		lbl0.setBackground(Color.YELLOW);
		lbl1.setBackground(Color.YELLOW);
		lbl2.setBackground(Color.YELLOW);
		lbl3.setBackground(Color.YELLOW);
		txt0=new JTextField();
		txt1=new JTextField();
		txt2=new JTextField();
		lbl0.setBounds(60,100,120,30);
		lbl1.setBounds(60,140,120,30);
		lbl2.setBounds(60,180,120,30);
		lbl3.setBounds(100,250,100,30);
		txt0.setBounds(160,100,100,20);
		txt1.setBounds(160,140,100,20);
		bt0.setBounds(170,180,50,30);
		bt1.setBounds(225,180,50,30);
		bt2.setBounds(280,180,50,30);
		bt3.setBounds(335,180,50,30);
		bt4.setBounds(390,180,50,30);
		bt0.addActionListener(this);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		txt2.setEditable(false);
		txt2.setBounds(155,250,200,30);
		fr.add(lbl0);
		fr.add(lbl1);
		fr.add(lbl2);
		fr.add(lbl3);
		fr.add(bt0);
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(txt0);
		fr.add(txt1);
		fr.add(txt2);
		fr.setSize(500,500);
		fr.setLayout(null);
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent event)
	{
		String s0=txt0.getText();
		String s1=txt1.getText();
		double num1=Double.parseDouble(s0);
		double num2=Double.parseDouble(s1);
		double res=0;
		if(event.getSource()==bt0)
		{
			res=num1+num2;
		}
		else if(event.getSource()==bt1)
		{
			res=num1-num2;
		}
		else if(event.getSource()==bt2)
		{
			res=num1*num2;
		}
		else if(event.getSource()==bt3)
		{
			res=num1/num2;
		}
		else if(event.getSource()==bt4)
		{
			res=num1%num2;
		}
		String fres=String.valueOf(res);
		txt2.setText(fres);
	}
	public static void main(String[] args) {
		JSimpleCalculator Obj=new JSimpleCalculator();
	}
	}