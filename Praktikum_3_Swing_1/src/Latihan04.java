import javax.swing.JOptionPane;

public class Latihan04 {

	public static void main(String[] args) {
		Biodata b = new Biodata();
		

		final String err = "ERROR";
		final String in = "Info";
		boolean isLanjut = true;
		
		JOptionPane.showMessageDialog(null, "Selamat Datang!", in, JOptionPane.INFORMATION_MESSAGE);
				
		while(isLanjut) {
			String nama = JOptionPane.showInputDialog(null, "Masukkan nama lengkap Anda:", "Input Nama", JOptionPane.QUESTION_MESSAGE);
			
			//Latihan03
			if(nama.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Nama tidak boleh kosong!", err, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			//03 - end
			
			String usia = JOptionPane.showInputDialog(null, "Masukkan usia Anda:", "Input Usia", JOptionPane.QUESTION_MESSAGE);
			final String REG_NUMERIK = "[0-9]+";
			
			//Latihan03
			if(usia.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Usia tidak boleh kosong!", err, JOptionPane.WARNING_MESSAGE);
			} else if(!usia.matches(REG_NUMERIK)) {
				JOptionPane.showMessageDialog(null, "Isian Form Usia harus numerik!", err, JOptionPane.WARNING_MESSAGE);
				System.exit(0);
			}
			//03 - end
			
			String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat Anda:", "Input Alamat", JOptionPane.QUESTION_MESSAGE);
			
			//Latihan03
			if(alamat.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Field Form Alamat tidak boleh kosong!", err, JOptionPane.WARNING_MESSAGE);
			} else if(alamat.length() < 10) {
				JOptionPane.showMessageDialog(null, "Masukkan alamat minimum 10 karakter!", err, JOptionPane.WARNING_MESSAGE);
			}
			//03 - end
			
			int intusia = Integer.parseInt(usia);
			
			b.setData(nama, intusia, alamat);
			b.getData();
			
			
			//Latihan04
			int keluar = JOptionPane.showConfirmDialog(null, "Apakah Anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
			
			if(keluar == JOptionPane.YES_OPTION) {
				isLanjut = false;
			} else {
				isLanjut = true;
			}
			//04 - end
			
		}
		
		JOptionPane.showMessageDialog(null, "-- Sesi Selesai --", in, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}