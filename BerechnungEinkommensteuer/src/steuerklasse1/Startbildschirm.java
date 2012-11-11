package steuerklasse1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * @author basti
 *
 */
public class Startbildschirm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int ButtonGehaltsschein = 0; 
	int ButtonKilometerArbeit = 0; 
	int ButtonSpenden = 0;
	int ButtonKrankheitskosten = 0;
	int ButtonArbeitsTage = 0; 
	

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startbildschirm window = new Startbildschirm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Startbildschirm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
				
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 378);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnGehaltsschein = new JRadioButton("Gehaltsschein");
		rdbtnGehaltsschein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ButtonGehaltsschein = 1; 
			}
		});
		rdbtnGehaltsschein.setBounds(18, 140, 251, 23);
		frame.getContentPane().add(rdbtnGehaltsschein);
		
		JTextPane txtpnDasProgrammRichtet = new JTextPane();
		txtpnDasProgrammRichtet.setText("Das Programm richtet sich an ledige, kinderlose Gehaltsempf\u00E4nger.  Folgende Unterlagen werden zur Berechnung ben\u00F6tigt:");
		txtpnDasProgrammRichtet.setBounds(18, 86, 439, 41);
		frame.getContentPane().add(txtpnDasProgrammRichtet);
		
		JLabel lblBerechnungDerEinkommensteuer = new JLabel("Berechnung der Einkommensteuer");
		lblBerechnungDerEinkommensteuer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBerechnungDerEinkommensteuer.setBounds(18, 25, 379, 23);
		frame.getContentPane().add(lblBerechnungDerEinkommensteuer);
		
		JRadioButton rdbtnKilometerArbeit = new JRadioButton("Kilometer zur Arbeit");
		rdbtnKilometerArbeit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ButtonKilometerArbeit = 1; 
			}
		});
		rdbtnKilometerArbeit.setBounds(18, 165, 251, 23);
		frame.getContentPane().add(rdbtnKilometerArbeit);
		
		JRadioButton rdbtnSpenden = new JRadioButton("Spenden");
		rdbtnSpenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ButtonSpenden = 1; 
			}
		});
		rdbtnSpenden.setBounds(18, 189, 251, 23);
		frame.getContentPane().add(rdbtnSpenden);
		
		JRadioButton rdbtnKrankheitskosten = new JRadioButton("Krankheitskosten");
		rdbtnKrankheitskosten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ButtonKrankheitskosten = 1; 
			}
		});
		rdbtnKrankheitskosten.setBounds(18, 215, 251, 23);
		frame.getContentPane().add(rdbtnKrankheitskosten);
		
		JRadioButton rdbtnArbeitstage = new JRadioButton("Arbeitstage");
		rdbtnArbeitstage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ButtonArbeitsTage = 1;
			}
		});
		rdbtnArbeitstage.setBounds(18, 241, 251, 23);
		frame.getContentPane().add(rdbtnArbeitstage);
		
		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((ButtonArbeitsTage == 1) & (ButtonGehaltsschein == 1) & (ButtonKilometerArbeit == 1) & (ButtonKrankheitskosten == 1) & (ButtonSpenden == 1))
				{
					AdressBildschirm ab = new AdressBildschirm();
					ab.setVisible(true);
				}
				else
				{
					HoleUnterlagen hu = new HoleUnterlagen();
					hu.setVisible(true); 
				}
			}
		});
		btnWeiter.setBounds(18, 289, 89, 23);
		frame.getContentPane().add(btnWeiter);
		
		
		
	}
}
