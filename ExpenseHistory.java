import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExpenseHistory extends JPanel {
	private String data; 

	public ExpenseHistory()
	{
		setBorder(new LineBorder(new Color(0, 128, 0), 3));
		setLayout(null);

		JLabel lblNewLabel = new JLabel("Expense History");
		lblNewLabel.setForeground(new Color(0, 100, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 48));
		lblNewLabel.setBounds(27, 70, 500, 60);
		add(lblNewLabel);
	}
}
