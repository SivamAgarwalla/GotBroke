import javax.swing.*;
import java.awt.*;

public class ExampleClass
{
	static JPanel homeContainer;
	static JPanel homePanel;
	static JPanel otherPanel;
	static CardLayout cl;

	public ExampleClass()
	{
		JFrame mFrame = new JFrame("CardLayout Example");
		JButton showOtherPanelBtn = new JButton("Show Other Panel");
		JButton backToHomeBtn = new JButton("Show Home Panel");

		cl = new CardLayout(5, 5);
		homeContainer = new JPanel(cl);
		homeContainer.setBackground(Color.black);

		homePanel = new JPanel();
		homePanel.setBackground(Color.blue);
		homePanel.add(showOtherPanelBtn);

		homeContainer.add(homePanel, "Home");

		otherPanel = new JPanel();
		otherPanel.setBackground(Color.green);
		otherPanel.add(backToHomeBtn);

		homeContainer.add(otherPanel, "Other Panel");

		/*
		showOtherPanelBtn.addActionListener(e -> cl.show(homeContainer, "Other Panel"));
		backToHomeBtn.addActionListener(e -> cl.show(homeContainer, "Home"));
		*/

		mFrame.add(homeContainer);
		cl.show(homeContainer, "Home");
		mFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mFrame.setLocationRelativeTo(null);
		mFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		mFrame.setSize(670, 430);
		mFrame.setVisible(true);
	}

	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(ExampleClass::new);
	}
}