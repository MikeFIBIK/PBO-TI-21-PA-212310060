import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > matrixA = new ArrayList<ArrayList<Integer> >();
		ArrayList<ArrayList<Integer> > matrixB = new ArrayList<ArrayList<Integer> >();
		int ordo = 2, jumlah = 0;
		String value = "";
		
		//Matrix A
		String output = "Matrix A: \n";
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			matrixA.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matrixA.get(i).add(j, Integer.parseInt(value));
		}
			}
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			output += matrixA.get(i).get(j) + " ";
		}
			output += "\n";
			}
		
		//matrix B
		output += "\nMatrix B : \n";
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			matrixB.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matrix B ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matrixB.get(i).add(j, Integer.parseInt(value));
		}
			}
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			output += matrixB.get(i).get(j) + " ";
		}
			output += "\n";
			}
		
		//CALCULATION
		output += "\nHasil Perkalian : \n";
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
				 for (int k = 0; k < ordo; k++) {
		            //jumlah = jumlah + matrixA[i][k] * matrixA[k][j];
		            jumlah +=  matrixA.get(i).get(k) * matrixB.get(k).get(j);
		         }
		          output += jumlah + " ";
		          jumlah = 0;
		    }
				output += "\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
}