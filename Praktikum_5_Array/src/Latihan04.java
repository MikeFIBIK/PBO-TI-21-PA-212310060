import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Latihan04 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int ordo = 2;
		String output = "";
		
		ArrayList<ArrayList<String> > field = new ArrayList<ArrayList<String> >();
		
		for (int i = 0; i <= ordo; i++) {
			field.add(new ArrayList<String>());
		}
		
		field.get(0).add(0, "Nama Lengkap | ");
		field.get(0).add(1, "Alamat | ");
		field.get(0).add(2, "No Telp");

		for(int i = 0; i <= ordo; i++) {
			output += field.get(0).get(i) + " ";
		}
		
		output += "\n";
		
		for(int i = 0; i <= ordo; i++) {
			for(int j = 0; j <= ordo; j++) {
				String isi = jop.showInputDialog(null, "Masukkan " + field.get(0).get(j) + ":", "Data array ke-" + i, jop.QUESTION_MESSAGE);
				field.get(1).add(j, isi);
				output += field.get(1).get(j) + " | ";
			}
			
			output += "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}