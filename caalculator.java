 import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
class caalculator implements ActionListener
{
	JFrame jf;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;
	static double a=0,b=0,result=0;
	static int operator=0;
	 caalculator()
	{
		jf = new JFrame("Calculator");
         jf.setLayout(null);
		jf.setBounds(20,20,350,350);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setResizable(true);
	
		t= new JTextField();
	
		t.setBounds(40,40,200,50);
		b1= new JButton("1");
		b2= new JButton("2");
		b3= new JButton("3");
		b4= new JButton("+");
		b5= new JButton("4");
		b6= new JButton("5");
		b7= new JButton("6");
		b8= new JButton("-");
		b9= new JButton("7");
		b10= new JButton("8");
		b11= new JButton("9");
		b12= new JButton("*");
		b13= new JButton("C");
		b14= new JButton("0");
		b15= new JButton("/");
		b16= new JButton("=");
		b17= new JButton("dl");
		b18=new JButton(".");
		b1.setBounds(40,100,50,40);
		b2.setBounds(90,100,50,40);
		b3.setBounds(140,100,50,40);
		b4.setBounds(190,100,50,40);
		b5.setBounds(40,140,50,40);
		b6.setBounds(90,140,50,40);
		b7.setBounds(140,140,50,40);
		b8.setBounds(190,140,50,40);
		b9.setBounds(40,180,50,40);
	    b10.setBounds(90,180,50,40);
		b11.setBounds(140,180,50,40);
		b12.setBounds(190,180,50,40);
		b13.setBounds(40,220,50,40);
		b14.setBounds(90,220,50,40);
		b15.setBounds(140,220,50,40);
		b16.setBounds(190,220,50,40);
		b17.setBounds(40,260,80,40);
		b18.setBounds(90,260,50,40);
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
	
		jf.add(t);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		jf.add(b10);
		jf.add(b11);
		jf.add(b12);
		jf.add(b13);
		jf.add(b14);
		jf.add(b15);
		jf.add(b16);
		jf.add(b17);
		jf.add(b18);
	
		
		
	}
	 public static void main(String[] args){
	   new caalculator();
   }
   public void actionPerformed(ActionEvent e)
   {
	   if(e.getSource()==b18)
	   {
		   t.setText(t.getText().concat("."));
	   }
	   if(e.getSource()==b13)
	   {
		   t.setText("");
	   }
	   if(e.getSource()==b17)
	   {
		   String s = t.getText();
		   t.setText("");
		   for(int i=0; i<s.length()-1; i++)
			   t.setText(t.getText()+s.charAt(i));
	   }
	   if(e.getSource()==b1)
	   {
		   t.setText(t.getText().concat("1"));
	   }
	    if(e.getSource()==b2)
	   {
		   t.setText(t.getText().concat("2"));
	   }
	    if(e.getSource()==b3)
	   {
		   t.setText(t.getText().concat("3"));
	   }
	    if(e.getSource()==b5)
	   {
		   t.setText(t.getText().concat("4"));
	   }
	    if(e.getSource()==b6)
	   {
		   t.setText(t.getText().concat("5"));
	   }
	    if(e.getSource()==b7)
	   {
		   t.setText(t.getText().concat("6"));
	   }
	    if(e.getSource()==b9)
	   {
		   t.setText(t.getText().concat("7"));
	   }
	    if(e.getSource()==b10)
	   {
		   t.setText(t.getText().concat("8"));
	   }
	    if(e.getSource()==b11)
	   {
		   t.setText(t.getText().concat("9"));
	   }
	 
	   if(e.getSource()==b14)
	   {
		   t.setText(t.getText().concat("0"));
	   }
	   if(e.getSource()==b4)
	   {
		   a= Double.parseDouble(t.getText());
		   operator=1;
		   t.setText("");
	   }
	   
	   if(e.getSource()==b8)
	   {
		   a= Double.parseDouble(t.getText());
		   operator=2;
		   t.setText("");
	   }
	   if(e.getSource()==b12)
	   {
		   a= Double.parseDouble(t.getText());
		   operator=3;
		   t.setText("");
	   }
	   if(e.getSource()==b15)
	   {
		   a= Double.parseDouble(t.getText());
		   operator=4;
		   t.setText("");
	   }
	   
	   if(e.getSource()==b16)
	   {
		   b= Double.parseDouble(t.getText());
		   switch(operator)
		   {
			   case 1:result=a+b;
			   break;
			   case 2:result=a-b;
			   break;
			   case 3:result=a*b;
			   break;
			   case 4:result=a/b;
			   break;
			   
		   }
		   
		   t.setText(" "+result);
	   }
	   
	   
   }
}
  