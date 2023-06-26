/*
main window's frame.
java eXtension.
swing music.
*/
import javax.swing.JFrame;

public class JFrameExample {

	public static void main(String[] arguments) {

		JFrame frame = new JFrame("JFrame HaGa IT Solution");

		/*
		JFrame.EXIT_ON_CLOSE — Exit the application.
		JFrame.HIDE_ON_CLOSE — Hide the frame, but keep the application running.
		JFrame.DISPOSE_ON_CLOSE — Dispose of the frame object, but keep the application running.
		JFrame.DO_NOTHING_ON_CLOSE — Ignore the click.
		*/
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

	}

}
