import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args){
		float res = 0.f;
		float first = 0.f;
		float second = 0.f;
		String ToC = "";
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		
		
		if( sc.hasNextFloat()){
		first = sc.nextFloat();
		second = sc.nextFloat();
		}
		
		System.out.println("Enter type of calculating ([S]umm/[R]azn/[P]roizv/[C]hast):");
		if(sc1.hasNext()){
		switch(ToC = sc1.next()){
		case "S":	
					res = first + second;
					System.out.println("Summ...");
					break;
		case "R":	
					res = first - second;
					System.out.println("Razn...");
					break;
		case "P":	
					res = first * second;
					System.out.println("Proizv...");
					break;
		case "C":	
					res = first / second;
					System.out.println("Chast...");
					break;			
		default:  	System.out.println("Error! Wrong action!");break;
			}
		}
		
		System.out.println("Calculate...");
		System.out.println("Result of calculating " + res);

	}
}