import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan01 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer> > matriksA = new ArrayList<ArrayList<Integer> >();
		ArrayList<ArrayList<Integer> > matriksB = new ArrayList<ArrayList<Integer> >();
		
		int ordo = 2;
		String value = "";
		
		String output = "Matrix A: \n";
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			matriksA.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matriks A ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matriksA.get(i).add(j, Integer.parseInt(value));
		}
			}
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			output += matriksA.get(i).get(j) + " ";
		}
			output += "\n";
			}
		
		output += "\n Matrix B : \n";
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			matriksB.add(new ArrayList<Integer>());
			value = JOptionPane.showInputDialog(null,"Masukkan angka: ","Matrix B ke-["+i+"]"+"["+j+"]",JOptionPane.QUESTION_MESSAGE);
			matriksB.get(i).add(j, Integer.parseInt(value));
		}
			}
		
		for(int i =0; i<ordo; i++) {
			for(int j=0; j<ordo; j++) {
			output += matriksB.get(i).get(j) + " ";
		}
			output += "\n";
			}
		
		
		JOptionPane.showMessageDialog(null, output);
	}
}