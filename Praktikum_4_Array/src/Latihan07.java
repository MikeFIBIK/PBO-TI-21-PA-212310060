import javax.swing.JOptionPane;

public class Latihan07 {
	public static void main(String[] args) {
		int baris =2, kolom =2;
		
		int matriksA[][]= new int[baris][kolom];
		int matriksB[][]= new int[baris][kolom];
		int hasil1[][] = new int[baris][kolom];
		
		//INPUT & OUTPUT
		JOptionPane.showMessageDialog(null, "Matriks A");
		String outputA="Matriks A: \n";
		for(int i =0; i<matriksA.length; i++) {
			for(int j=0; j<matriksA.length; j++) {
				matriksA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE));
				outputA += matriksA[i][j] + " ";
			}
			outputA += "\n";
		}
		String outputB="Matriks B: \n";
		JOptionPane.showMessageDialog(null, "Matriks B");
		for(int i =0; i<matriksB.length; i++) {
			for(int j=0; j<matriksB.length; j++) {
				matriksB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukkan angka: ", "Matriks B ke-["+i+"]"+"["+j+"]", JOptionPane.QUESTION_MESSAGE));
				outputB += matriksB[i][j] + " ";
			}
			outputB += "\n";
		}
		
		//CALCULATION & OUTPUT
		String output1="Pengurangan Matriks A: \n";
		for(int i =0; i<hasil1.length; i++) {
			for(int j=0; j<hasil1.length; j++) {
				hasil1[i][j] = matriksA[i][j] - matriksB[i][j];		
				output1 += hasil1[i][j] + " ";
			}
			output1 += "\n";
		}
	            
		JOptionPane.showMessageDialog(null, outputA+outputB+output1);
	}
}