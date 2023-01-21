package com.ibik.pbo.praktikum;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Latihan03 extends JFrame {


	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JCheckBox remember;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan03 frame = new Latihan03();
					frame.setVisible(true);
					frame.setSize(380,300);
					frame.setTitle("Latihan 03");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Latihan03() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		//frame.setContentPane(mainPanel);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(50, 50, 150, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(22, 23, 80, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(105, 18, 169, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(22, 69, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		final JPasswordField textField_1 = new JPasswordField();
		textField_1.setBounds(105, 64, 169, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox remember = new JCheckBox("Remember Password?");
		remember.setBounds(90, 120, 180, 10);
		contentPane.add(remember);

		final JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBounds(105, 146, 150, 26);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "isi data dengan benar!", "PERINGATAN", JOptionPane.WARNING_MESSAGE);
				}
				else {
					if(e.getSource() == btnNewButton) {
						JOptionPane.showMessageDialog(null, "Selamat Datang Michael F", "informasi", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			
		});
	}
}