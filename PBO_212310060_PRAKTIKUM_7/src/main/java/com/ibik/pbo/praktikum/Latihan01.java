package com.ibik.pbo.praktikum;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
	public class Latihan01 extends JFrame{
		Latihan01(){
			JFrame frame = new JFrame();
			setVisible(true);
			pack();
			setLocationRelativeTo(null);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setSize(400,150);
			setTitle("Latihan 01");
			GenerateUI(this);
		}
		public static void main(String[]args) {
			new Latihan01();
		}
		private void GenerateUI(JFrame frame) {
			JButton button1 = new JButton("你好");
			JButton button2 = new JButton("みんな");
			JButton button3 = new JButton("IBIK");
			
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			frame.setLayout(new FlowLayout());
			
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "你好 is a word for 'Hello' ", "You Just Click 你好", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			
			button2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "みんな is a word for 'Everyone' ", "You Just Click みんな", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			button3.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "IBIK is an acronym of 'Institut Bisnis dan Informatika Kesatuan' ", "You Just Click IBIK", JOptionPane.INFORMATION_MESSAGE);
				}
			});
	
		}
	}