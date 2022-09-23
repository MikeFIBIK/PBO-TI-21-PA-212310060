import java.util.Scanner;
public class Latihan02 {

	public static void main(String[] args) {
	
		
		double celcius,fahrenheit, reamur, kelvin;
		
		System.out.println("Masukkan suhu: ");
		Scanner input = new Scanner(System.in);
		celcius = input.nextInt();	
		input.close();
		fahrenheit = (9/5 * celcius) + 32;
		reamur = celcius * 4/5;
		kelvin = celcius * 273;
		
		System.out.println("Celcius: " + celcius);
		System.out.println("Kelvin: " + kelvin);
		System.out.println("Reamur: " + reamur);
		System.out.println("Fahrenheit: " + fahrenheit);
		
	}

}
