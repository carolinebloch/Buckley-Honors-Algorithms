import java.util.Random;
public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer ?
		String ascii = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz!\"#$%&'()*+,-./0123456789:;<=>?@[\\]^_{|}";
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for (int i = 0; i<1111; i++) 
			sb.append(ascii.charAt(r.nextInt(ascii.length())));
		for(int x = 1; x<sb.length()+1; x++) {
			System.out.print(sb.charAt(x-1));
			if (x % 100 == 0) System.out.println("");
		}
	}

}
