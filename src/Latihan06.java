import java.util.Scanner;

public class Latihan06 {

	public static void main(String[] args) {
		
		String firstname, lastname, usia, npm;

        
        Scanner value = new Scanner(System.in);

        
        System.out.print("Usia: ");
        usia = value.nextLine();
        
        System.out.print("Firstname: ");
        firstname = value.nextLine();
        
        System.out.print("Lastname: ");
        lastname = value.nextLine();

        System.out.print("NPM: ");
        npm = value.nextLine();


        String Output = usia.concat(firstname).concat(lastname).concat(npm);
	       System.out.println("Output = " + Output);
	}

}
