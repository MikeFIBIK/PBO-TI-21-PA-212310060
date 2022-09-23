import java.util.Scanner;

public class Latihan03 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Diagonal 1 : ");
		double d1 = input.nextDouble();
		System.out.print("Diagonal 2 : ");
		double d2 = input.nextDouble();
		System.out.print("alas : ");
		double a = input.nextDouble();
		System.out.print("Tinggi : ");
		double t = input.nextDouble();
		System.out.print("Panjang : ");
		double p = input.nextDouble();
		System.out.print("Lebar : ");
		double l = input.nextDouble();
		
		double KelilingLayangLayang = 2*(d1 + d2);
		double LuasLayangLayang = 0.5 * d1 * d2;
		double KelilingPrisma = 2 * (a + t + l) + (3*p);
		double LuasPrisma = 2 * (0.5 * a * t) + (a + t + l);

		System.out.print("Luas Layang - Layang = " + LuasLayangLayang +" cm");
		System.out.print("\nKeliling Layang - Layang = " + KelilingLayangLayang +"cm");
		System.out.print("\nLuas Prisma Segitiga = " + LuasPrisma +" cm");
		System.out.print("\nKeliling Prisma Segitiga = " + KelilingPrisma +"cm");
		
		}
}