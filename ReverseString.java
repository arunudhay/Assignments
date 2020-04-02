package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
	      String string = "welcome";
	      String reverse = new StringBuffer(string).reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);
	   }

	}

