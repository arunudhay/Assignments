package week1.day4;

public class PrintNextChar {

	public static void main(String[] args) {
		String bee ="A1B2C3";
		char s[] = bee.toCharArray();

		for(int i = 0; i<=5; i++)
		{
			int ascii = (int)s[i];
			int c= ascii+1;
			char d = (char)c;
			System.out.print(d);
		}

	}

	}

