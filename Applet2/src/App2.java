import java.applet.*;
import java.awt.*;

public class App2 extends Applet {
	  
	   public void paint(Graphics g) {
		   g.fillOval(200, 20, 150, 250);
		   g.setColor(Color.blue);
		   g.fillRect(20, 20, 150, 250);
		   
		   g.setColor(Color.red);
		   g.fillRect(400, 20, 150, 250);
	   }
} 

/*
<APPLET code= "App2.class" width="300" height="300">
</APPLET>
*/