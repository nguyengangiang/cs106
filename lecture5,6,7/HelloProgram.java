package lecture;

import java.awt.Color;
import acm.graphics.GLabel;
import acm.program.*;

public class HelloProgram extends GraphicsProgram{
	public void run() {
		GLabel label = new GLabel("Hello, world", 100, 75);
		label.setFont("SansSerif-36");
		label.setColor(Color.BLUE);
		add(label);
	}
}
