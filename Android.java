package week1day1;

public class Android {
	
	long modelnumber = 989478699;
	Boolean verification = true;
	String mobilemodel = "Samsung";
	int cost = 25000;
	float age = 16.1f;
	
public static void main(String[] args) 
{
	Android mobile = new Android();
	
	float age1 = mobile.age;
	System.out.println(age1);
	
	int cost1 = mobile.cost;
	System.out.println(cost1);
	
	String mobilemodel1 = mobile.mobilemodel;
	System.out.println(mobilemodel1);
	
	boolean verf = mobile.verification;
	System.out.println(verf);
	
	long number = mobile.modelnumber;
	System.out.println(number);
	
}
}

