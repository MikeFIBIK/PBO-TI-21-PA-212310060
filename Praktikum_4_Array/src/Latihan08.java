import javax.swing.JOptionPane;

public class Latihan08 {

		public static void main(String[] args) {
			int baris = 3, kolom = 4, end = 0, s = 1, e = 2;
			String output = "";
			String input[][] = new String[baris][kolom];
			input[0][0] = "Nama Lengkap: ";
			input[1][0] = "Alamat: ";
			input[2][0] = "No Telp: ";
			
			//INPUT & OUTPUT
			for(int i = 0; i < baris; i++) {
				output += input[i][0];
				for(int j = s; j < e; j++) {
					input[i][j] = JOptionPane.showInputDialog(null, input[i][0], "Data Array ke-[" + i + "]" + "[" + j + "]", JOptionPane.QUESTION_MESSAGE);				
					output += input[i][j] + "\n";
				}
				//restart loop
				if (i == baris - 1) {
					output += "\n";
					i = -1;
					s = s + 1;
					e = e + 1;
					end = end + 1;
					if (end == 3) {
						i = baris;
					}
				}
			}

			JOptionPane.showMessageDialog(null, output);
		}
	}