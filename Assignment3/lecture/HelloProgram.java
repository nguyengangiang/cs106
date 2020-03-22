package lecture;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram{

	public void run() {
		GLabel label = new GLabel("hello, world");
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		double x = (getWidth() - label.getWidth()) / 2;
		double y = (getHeight() - label.getAscent()) / 2;
		add(label, x, y); 
	}
}
