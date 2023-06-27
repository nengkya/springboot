import javax.swing.JFrame;

public class MyEventQueue {

	public static void main(String[] arguments) {

		java.awt.EventQueue.invokeLater(

			new Runnable() {

				public void run() {

					new JFrame().setVisible(true);

				}				

			}

		);

	}

}
