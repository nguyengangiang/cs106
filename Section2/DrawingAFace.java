package lecture;

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class DrawingAFace extends GraphicsProgram{
	private final int HEAD_WIDTH = 100;
	private final int HEAD_HEIGHT = 150;
	private final int EYE_RADIUS = 10;
	private final int MOUTH_HEIGHT = 20;
	private final int MOUTH_WIDTH = 60;
	
	public void run() {
		int xHead = (getWidth() - HEAD_WIDTH) / 2;
		int yHead = (getHeight() - HEAD_HEIGHT) / 2;
		
		GRect head = new GRect(xHead, yHead, HEAD_WIDTH, HEAD_HEIGHT);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
		
		int xLeftEye = xHead + HEAD_WIDTH / 4 - EYE_RADIUS;
		int xRightEye = xHead + HEAD_WIDTH - HEAD_WIDTH / 4 - EYE_RADIUS;
		int yEyes = yHead + HEAD_HEIGHT / 4;
		
		GOval leftEye = new GOval(xLeftEye, yEyes, EYE_RADIUS * 2, EYE_RADIUS * 2);
		leftEye.setColor(Color.yellow);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.yellow);
		add(leftEye);
		
		GOval rightEye = new GOval (xRightEye, yEyes, EYE_RADIUS * 2, EYE_RADIUS * 2);
		rightEye.setColor(Color.yellow);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.yellow);
		add(rightEye);
		
		int xMouth = xHead + (HEAD_WIDTH / 2 - MOUTH_WIDTH / 2);
		int yMouth = yHead + HEAD_HEIGHT / 2 + (HEAD_HEIGHT / 2 - MOUTH_HEIGHT) / 2;
		GRect mouth = new GRect(xMouth, yMouth, MOUTH_WIDTH, MOUTH_HEIGHT);
		mouth.setColor(Color.white);
		mouth.setFilled(true);
		mouth.setFillColor(Color.white);
		add(mouth);
		
	}

}
