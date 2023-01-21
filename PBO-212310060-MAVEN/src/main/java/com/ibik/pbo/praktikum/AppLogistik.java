package com.ibik.pbo.praktikum;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.lang.Math;
public class AppLogistik{
    public static ArrayList<String> orders = new ArrayList<String>();
    public static JOptionPane jop;
    public static boolean isExit = false;

    public static void main(String[]args){
        AppLogistik main = new AppLogistik();
        jop = new JOptionPane();
        String[] menus = {"Input order", "Tracking Order"};
        String labels = "pilih menu dibawah ini:\n";

        for (int i = 0; i < menus.length; i++){
            labels += (i+1) + ". " + menus[i] +"\n";
        }
        while(!isExit){
            String menuSelected = jop.showInputDialog(null, labels, "Aplikasi PT.XYZ", jop.INFORMATION_MESSAGE);
            if(menuSelected!= null) {
                switch (Integer.parseInt(menuSelected)) {
                    case 1:
                        main.InputOrder();
                        break;
                    case 2:
                        main.TrackingOrder();
                    break;
                    default:
                        main.ExitApps("Menu tidak ditemukan");
                        break;
                }
        }else{
            main.ExitApps("");
        }
    }while(isExit);
}
	public void InputOrder(){
		JOptionPane jop = new JOptionPane();
	
		ArrayList<Integer> pengiriman = new ArrayList<Integer>();
		
		int berat = Integer.parseInt(jop.showInputDialog(null,"Masukkan Berat"));
		int jarak = Integer.parseInt(jop.showInputDialog(null,"Masukkan Jarak"));
		
		int total_harga = harga_Pengiriman(berat,jarak);
	
		jop.showMessageDialog(null,"Berat paket = " + berat + "(gr)"+"\nJarak lokasi = " + jarak + "(km)"+"\nTotal Harga = " + total_harga + "\nNomor Resi = XYZ002");
		
		
		pengiriman.add(123);
		pengiriman.add(total_harga);
		
		int resi = Integer.parseInt(jop.showInputDialog(null,"Masukkan Resi","Lacak Resi",jop.QUESTION_MESSAGE));
			
		if(resi == pengiriman.get(0)) {
			jop.showMessageDialog(null, "Berat paket = " + berat + "(gr)" + "\nNo Resi = " + pengiriman.get(1) + "\nTotal Harga = " + pengiriman.get(2));
		}
	}
	
	static int harga_Pengiriman(int paramBerat,int paramJarak) {
		int harga_Berat,harga_Jarak;
		
		if (paramBerat < 100) {
			harga_Berat = 5000;
		}else {
			harga_Berat = (paramBerat / 100) * 5000;
		}
		
		if (paramJarak < 10) {
			harga_Jarak = 8000;
		}else {
			harga_Jarak = (paramJarak / 10) * 8000;
		}
		
		return harga_Berat + harga_Jarak;
		}
	
	public void TrackingOrder(){
        jop = new JOptionPane();
        String resi = jop.showInputDialog(null,"Masukkan Resi","Lacak Resi",jop.QUESTION_MESSAGE);
		//int resi = Integer.parseInt(jop.showInputDialog(null,"Masukkan Resi","Lacak Resi",jop.QUESTION_MESSAGE));
            ExitApps("Data tidak ditemukan.\n");
        }
	void ExitApps(String string) {
		// TODO Auto-generated method stub
		
	}
}