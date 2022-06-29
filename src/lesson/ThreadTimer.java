package lesson;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimer extends JFrame implements ActionListener {
	static int timeLength = 10;
	JLabel timeLabel;
	
	public ThreadTimer() {
		setSize(300, 200);
		setTitle("Timer Test");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		timeLabel = new JLabel("", JLabel.CENTER);
		
		Container c = getContentPane();
		
		
	}
	
	
	public static void main(String[] args) {
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
