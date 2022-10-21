import javax.swing.JOptionPane;

public class Latihan02 {

	public static void main(String[] args) {
		Biodata b = new Biodata();
		final String in = "Info";
		
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!", in, JOptionPane.INFORMATION_MESSAGE);
		
		String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap Anda:", "Input Nama", JOptionPane.QUESTION_MESSAGE);
		String usia = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Input Usia", JOptionPane.QUESTION_MESSAGE);
		String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat Anda:", "Input Alamat", JOptionPane.QUESTION_MESSAGE);
		
		int intusia = Integer.parseInt(usia);
		
		b.setData(nama, intusia, alamat);
		b.getData();
	
	}
}