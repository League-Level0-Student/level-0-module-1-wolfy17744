import javax.swing.JOptionPane;

public class myAges {
	public static void main(String[] args) {
		String ageq = JOptionPane.showInputDialog("what is your age?");
		int age = Integer.parseInt(ageq);
		int num = 0;
		for (int i = 0; i < age; i++) {
			num++;
			JOptionPane.showMessageDialog(null, num);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
