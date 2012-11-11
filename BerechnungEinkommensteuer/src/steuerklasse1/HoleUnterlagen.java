package steuerklasse1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class HoleUnterlagen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoleUnterlagen frame = new HoleUnterlagen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HoleUnterlagen() {
		setBounds(100, 100, 450, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAufstehenUndUnterlagen = new JLabel("aufstehen und Unterlagen holen!!!!!! :-) ");
		lblAufstehenUndUnterlagen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAufstehenUndUnterlagen.setHorizontalAlignment(SwingConstants.CENTER);
		lblAufstehenUndUnterlagen.setBounds(51, 65, 304, 28);
		contentPane.add(lblAufstehenUndUnterlagen);
	}

}
