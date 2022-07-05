import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 

/* <applet code="CountVowel.class" width=300 height=100> </applet> */ 

public class CountVowel extends Applet implements ActionListener 
{ 
     TextArea txtArea; 
	 TextField text; 
	 Button btn; 
	 public void init() 
	 { 
	    txtArea = new TextArea(); 
		txtArea.setBounds(30,30,200,200); 
		add(txtArea); 
		text = new TextField(20); 
		text.setBounds(30,240,100,30); 
		text.setEditable(false); 
		add(text); 
		btn = new Button("Calculate"); 
		btn.setBounds(150,230,70,30); 
		add(btn); 
		btn.addActionListener(this); 
	} 
	
	public void actionPerformed(ActionEvent ae) 
	{ 
	    if(ae.getSource() == btn ) 
		{ 
	       String strTemp= txtArea.getText(); 
		   int count=0; 
		   for(int i=0;i<strTemp.length();i++) 
		   { 
	           if(strTemp.charAt(i)=='a'|| strTemp.charAt(i)=='A'|| strTemp.charAt(i)=='e'|| strTemp.charAt(i)=='E'|| strTemp.charAt(i)=='i'|| strTemp.charAt(i)=='I'|| strTemp.charAt(i)=='o'|| strTemp.charAt(i)=='O'|| strTemp.charAt(i)=='u'|| strTemp.charAt(i)=='U') 
			   { count++; } 
		   } 
			   String str=Integer.toString(count); 
			   text.setText(str); 
		} 
	} 
		
}