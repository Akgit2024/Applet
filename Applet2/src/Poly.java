import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Poly extends Applet implements ActionListener{

	 Button b1 =new Button("Submit");  
	 Button b2 =new Button("Reset");
	 String str = " ";
	 
	 Label lb1 = new Label("First Name:");
	 TextField t1 = new TextField(10);
	 Label lb2 = new Label("Last Name:");
	 TextField t2 = new TextField (10);
	 Label lb3 = new Label("Select the Languages Known:");
	 Checkbox c1 = new Checkbox("Python");
	 Checkbox c2 = new Checkbox("Java Programming");
	 Checkbox c3 = new Checkbox("C Programming");
	 Checkbox c4 = new Checkbox("Flutter");
	 Checkbox c5 = new Checkbox("\nKotlin\n\n\n");
	 Label lb4 = new Label("Choose any one Language: ");
	 CheckboxGroup cg = new CheckboxGroup();
	 Checkbox c6 = new Checkbox("Python",cg,false);
	 Checkbox c7 = new Checkbox("Java Programming",cg,false);
	 Checkbox c8 = new Checkbox("\nKotlin\n\n\n",cg,false);
	 Choice state = new Choice();	
	
	 public void init() {
		setBackground(Color.GRAY);
		add(lb1);
		add(t1); 
		add(lb2);
		add(t2);
		add(lb3);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		
		add(lb4);
		add(c6);
		add(c7);
		add(c8);
		
		
		add(b2);
		b2.addActionListener(this);
		add(b1); 
		b1.addActionListener(this);
	 }
	 public void paint(Graphics g) {
		 g.drawString(str, 150, 200);
	 }
	 public void actionPerformed(ActionEvent e) {
		 String st = e.getActionCommand();
		 
		 if(st.equals("Reset")){
			str = "Check once more!";
		 }
		 else if(st.equals("Submit")){
		    str = "Informaton Submitted Successfully!!"; 
		 }
		 else {
		    str = "No Action Performed.";
		 }
		 repaint();
	 }
	
}



/*
<APPLET code= "Poly.class" width="380" height="260">
</APPLET>
*/