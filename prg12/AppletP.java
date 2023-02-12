//IT WILL WORK ONLY IN JDK VERSION LESS THAN 9 
package prg12;
import java.applet.Applet;
import java.awt.Graphics;
/*
<applet code="AppletP.class" width= "300" height="300">
</applet>
*/
public class AppletP extends Applet{
	public void paint(Graphics g)
	{
		g.drawString("Welcome", 100, 150);
	}
}
