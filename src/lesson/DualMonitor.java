package lesson;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DualMonitor {

	public static void main(String... args) {
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] gs = ge.getScreenDevices();

		javax.swing.JOptionPane.showConfirmDialog((java.awt.Component) null, "Found : " + gs.length,
				"screen detected ?", javax.swing.JOptionPane.DEFAULT_OPTION);

		for (int j = 0; j < gs.length; j++) {
			GraphicsDevice gd = gs[j];
			JFrame frame = new JFrame(gd.getDefaultConfiguration());
			frame.setTitle("I'm on monitor #" + j);
			frame.setSize(400, 200);
			frame.add(new JLabel("hello world"));
			frame.setVisible(true);
		}
	}
}