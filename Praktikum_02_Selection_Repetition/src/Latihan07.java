import java.util.Scanner;

public class Latihan07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String jwb;
		
		Resto restoObj = new Resto();
		
		do {
			restoObj.chooseMenu();
			System.out.println("Apakah anda akan memesan kembali ? (Y/N)");
			System.out.print("= ");
			jwb = input.nextLine();
		}
		while(jwb.equals("Y")||jwb.equals("y"));
		System.out.println("------ Sesi Selesai ------");
	}	
}	