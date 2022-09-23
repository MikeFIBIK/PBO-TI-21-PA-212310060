public class Latihan07 {
	public static void main(String[] args) {
		String data = "Michael Fernandez";

		data = data.replaceAll("[A,a,i,u,e,o]", "X");

		System.out.println("Michael Fernandez => " + data);
	}	    
	
}