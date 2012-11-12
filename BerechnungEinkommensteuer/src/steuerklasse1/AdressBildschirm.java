package steuerklasse1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdressBildschirm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Vorname;
	private JTextField txt_Nachname;
	private JTextField txt_Stra�eWO;
	private JTextField txt_PlzWO;
	private JTextField txt_Wohnort;
	private JTextField txt_NameAG;
	private JTextField txt_Stra�eAG;
	private JTextField txt_PlzAG;
	private JTextField txt_Arbeitsort;
	private JTextField txt_FahrtStrecke;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdressBildschirm frame = new AdressBildschirm();
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
	public AdressBildschirm() {
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngabenZurPerson = new JLabel("Angaben zur Person:");
		lblAngabenZurPerson.setFont(lblAngabenZurPerson.getFont().deriveFont(lblAngabenZurPerson.getFont().getStyle() | Font.BOLD));
		lblAngabenZurPerson.setBounds(10, 11, 179, 25);
		contentPane.add(lblAngabenZurPerson);
		
		JLabel lblVorname = new JLabel("Vorname: ");
		lblVorname.setBounds(10, 47, 101, 14);
		contentPane.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(10, 70, 101, 14);
		contentPane.add(lblNachname);
		
		JLabel lblStrae = new JLabel("Stra\u00DFe:");
		lblStrae.setBounds(10, 95, 101, 14);
		contentPane.add(lblStrae);
		
		JLabel lblPlz = new JLabel("PLZ: ");
		lblPlz.setBounds(10, 119, 101, 14);
		contentPane.add(lblPlz);
		
		JLabel lblWohnort = new JLabel("Wohnort:");
		lblWohnort.setBounds(10, 143, 101, 14);
		contentPane.add(lblWohnort);
		
		JLabel lblAngabenZumArbeitgeber = new JLabel("Angaben zum Arbeitgeber:");
		lblAngabenZumArbeitgeber.setFont(lblAngabenZumArbeitgeber.getFont().deriveFont(lblAngabenZumArbeitgeber.getFont().getStyle() | Font.BOLD));
		lblAngabenZumArbeitgeber.setBounds(10, 188, 179, 14);
		contentPane.add(lblAngabenZumArbeitgeber);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 213, 101, 14);
		contentPane.add(lblName);
		
		JLabel label = new JLabel("Stra\u00DFe:");
		label.setBounds(10, 238, 101, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("PLZ: ");
		label_1.setBounds(10, 263, 101, 14);
		contentPane.add(label_1);
		
		JLabel lblArbeitsort = new JLabel("Arbeitsort:");
		lblArbeitsort.setBounds(10, 288, 101, 14);
		contentPane.add(lblArbeitsort);
		
		JButton btnWeiter = new JButton("weiter");
// btn.Weiter.addActionListner(this);
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				Auswertung A = new Auswertung();
				A.setVisible(true);
				
			}
		});
		btnWeiter.setBounds(10, 391, 89, 23);
		contentPane.add(btnWeiter);
		
		txt_Vorname = new JTextField();
		txt_Vorname.setBounds(195, 44, 145, 20);
		contentPane.add(txt_Vorname);
		txt_Vorname.setColumns(10);
		
		txt_Nachname = new JTextField();
		txt_Nachname.setColumns(10);
		txt_Nachname.setBounds(195, 67, 145, 20);
		contentPane.add(txt_Nachname);
		
		txt_Stra�eWO = new JTextField();
		txt_Stra�eWO.setColumns(10);
		txt_Stra�eWO.setBounds(195, 92, 145, 20);
		contentPane.add(txt_Stra�eWO);
		
		txt_PlzWO = new JTextField();
		txt_PlzWO.setColumns(10);
		txt_PlzWO.setBounds(195, 116, 145, 20);
		contentPane.add(txt_PlzWO);
		
		txt_Wohnort = new JTextField();
		txt_Wohnort.setColumns(10);
		txt_Wohnort.setBounds(195, 140, 145, 20);
		contentPane.add(txt_Wohnort);
		
		txt_NameAG = new JTextField();
		txt_NameAG.setColumns(10);
		txt_NameAG.setBounds(195, 210, 145, 20);
		contentPane.add(txt_NameAG);
		
		txt_Stra�eAG = new JTextField();
		txt_Stra�eAG.setColumns(10);
		txt_Stra�eAG.setBounds(195, 235, 145, 20);
		contentPane.add(txt_Stra�eAG);
		
		txt_PlzAG = new JTextField();
		txt_PlzAG.setColumns(10);
		txt_PlzAG.setBounds(195, 260, 145, 20);
		contentPane.add(txt_PlzAG);
		
		txt_Arbeitsort = new JTextField();
		txt_Arbeitsort.setColumns(10);
		txt_Arbeitsort.setBounds(195, 285, 145, 20);
		contentPane.add(txt_Arbeitsort);
		
		JButton btnGoogleMaps = new JButton("Entfernung berechnen");
		btnGoogleMaps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*
				 * Hyperlink zu Google Maps einbauen
				 * 
				 */
				
				
			}
		});
		btnGoogleMaps.setBounds(195, 391, 145, 23);
		contentPane.add(btnGoogleMaps);
		
		JLabel lblEntfernungWohnung = new JLabel("Entfernung Wohnung / Arbeit:");
		lblEntfernungWohnung.setBounds(10, 332, 179, 14);
		contentPane.add(lblEntfernungWohnung);
		
		txt_FahrtStrecke = new JTextField();
		txt_FahrtStrecke.setColumns(10);
		txt_FahrtStrecke.setBounds(195, 329, 145, 20);
		contentPane.add(txt_FahrtStrecke);


/*

//Pray to GOD :-)

VorsorgeTF = txt_Vorname;


// btnWeiter.addActionListner(this);

public void actionPerformed(ActionEvent e) {
Object source = e.getSource();
if(source == btnWeiter)
{
Adressbildschirm.setGlobalData(new Global(VorsorgeTF.getText()));
}




*/

	}
}
