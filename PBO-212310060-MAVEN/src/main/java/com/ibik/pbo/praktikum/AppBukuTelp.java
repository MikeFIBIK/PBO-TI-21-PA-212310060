package com.ibik.pbo.praktikum;
import javax.swing.JOptionPane;


public class AppBukuTelp {

	public static void main(String[] args) {
        String[] fields = {"Nama Lengkap", "Alamat", "No Telp"};
        String[][] data = new String[3][3];
        final int sizeFields = fields.length;
		
		for(int i = 0; i < sizeFields; i++) {
			for(int j = 0; j < sizeFields; j++) {
                String values = JOptionPane.showInputDialog(null,
                                "Masukkan " + fields[j] + ":",
                                "Data array[" + i + "][" + j + "]",
                                JOptionPane.INFORMATION_MESSAGE);
                data[i][j] = values;
            }
		}	
		
		String output = "";	
		
		for(int x = 0; x < sizeFields; x++) {
            for(int y = 0; y < sizeFields; y++) {
                String[] fieldsOutput = {"Nama Lengkap", "Alamat", "No Telp"};
                output += fieldsOutput[y] + ": " + data[x][y] + "\n";
            }
            output += "\n";
		}

        JOptionPane.showMessageDialog(null, output, "Output Data", JOptionPane.INFORMATION_MESSAGE);
    }
	
}