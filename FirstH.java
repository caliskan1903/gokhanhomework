import java.util.Scanner;
import java.util.Scanner;
public class FirstH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("enter mom name");
		String mname=input.nextLine();
		System.out.println("dad name");
		String dname=input.nextLine();
		System.out.println("baby gender.boy or girl");
		String gender=input.nextLine();
		if(gender.equalsIgnoreCase("boy")) {
			System.out.println("baby boy name is " + dname.toUpperCase().substring(0, 3) + mname.toUpperCase().substring(2));
		}else if (gender.equalsIgnoreCase("girl")) {
			System.out.println("baby girl name is " + mname.toUpperCase().substring(0, 2) + dname.toUpperCase().substring(3));
		}
			}

	}


