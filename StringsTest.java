
public class StringsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringBuffer ?
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<100000; i++)
			sb.append("abc");
		System.out.println("StringBuilder time:" + (System.currentTimeMillis() - startTime));
		
		
			String s = "";
			for (int i = 0; i<100000; i++)
				s += "abc";
			System.out.println("String time:" + (System.currentTimeMillis() - startTime));
		//strings are better to use if you are not going to alter it, if you are going to alter it then string builder is better
	}

}
