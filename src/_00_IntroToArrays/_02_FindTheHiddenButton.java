package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	String input = "";
	int intInput;
	Random r = new Random();
	JButton special = new JButton();

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] jButtons;
	// 2 create an integer variable called hiddenButton
	int hiddenButton;
	ActionListener aL;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		input = JOptionPane.showInputDialog("Enter a positive number.");
		intInput = Integer.parseInt(input);
		jButtons = new JButton[intInput];
		hiddenButton = r.nextInt(intInput);
		special.addActionListener(this);
		for (int i = 0; i < jButtons.length; i++) {
			if (i == hiddenButton) {
				panel.add(special);
			} else {
				jButtons[i] = new JButton();
				jButtons[i].addActionListener(this);
				panel.add(jButtons[i]);
			}
		}

		// special.setText("Hello Andrew");
		window.add(panel);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setVisible(true);
		JOptionPane.showMessageDialog(null, "When you click the hidden button it will say Me! Find the hidden button.");
		// jButtons[hiddenButton] = special;
		special.setText("ME!");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		special.setText("");

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3

		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		// 11. set the JFrame to visible.

		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3

		// 14. Set the text of the JButton located at hiddenButton to read "ME"

		// 15. Use Thread.sleep(100); to pause the program.

		// 16. Set the text of the JButton located at hiddenButton to be blank.

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();
		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked == special) {
			JOptionPane.showMessageDialog(null, "You Win!");
		} else {
			JOptionPane.showMessageDialog(null, "You should get your eyes checked.");
		}
		// 18. else tell them to try again
	}
}
