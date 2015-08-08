import java.util.Scanner;
/*
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner{

	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	try{
		Calculator calc = new Calculator();
		String exit = "no";
		String operation = "";
		String first = null;
		String second = null;
		int check = 0;
		while (!exit.equals("yes")) {
			if(operation.equals("N")){
				System.out.println("First arg = last result");
			}
			else{
				System.out.println("Enter first arg : ");
				first = reader.next();
			}
			System.out.println("Enter second arg : ");
				second = reader.next();
			System.out.println("Choose operation : S[Summ], SB[Substraction], M[Multiply], D[Divide], G[Grade] ");
				operation = reader.next();
			switch(operation){
				case "S":
					calc.summ(Float.valueOf(first), Float.valueOf(second)); check++; break;
				case "SB":
					calc.sub(Float.valueOf(first), Float.valueOf(second)); check++; break;
				case "M":
					calc.mult(Float.valueOf(first), Float.valueOf(second)); check++; break;
				case "D":
					calc.div(Float.valueOf(first), Float.valueOf(second)); check++; break;	
				case "G":
					calc.grade(Float.valueOf(first), Float.valueOf(second)); break;	
				default: System.out.println("Error! Wrong action!");break;
					}
					if(check>0){
			System.out.println("Result : " + calc.getResult());
			System.out.println("Do you want to clear result or use it for other calculations? [Y/N]");
				operation = reader.next();
			switch(operation){
				case "Y":
					operation = "Y";
					calc.cleanResult();break;
				case "N":
					operation = "N";
					first = Float.toString(calc.getResult());break;
			}
		}
			System.out.println("Exit : yes/no ");
			exit = reader.next();
		}
	} finally{
		reader.close();
	}
  }
}  