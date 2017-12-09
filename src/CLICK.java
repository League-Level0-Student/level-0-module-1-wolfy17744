import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class CLICK implements KeyEventDispatcher {
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(10000);
	}

	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		// TODO Auto-generated method stub

		try {
			Robot mouse = new Robot();
			for (int i = 0; i < 100; i++) {
				mouse.mousePress(1);
			}

			System.out.println();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
}
