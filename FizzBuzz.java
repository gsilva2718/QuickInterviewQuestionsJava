
public class FizzBuzz{
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			fizzBuzz(Integer.parseInt(args[i]));
		}
	}
	private static void fizzBuzz(int num) { 
		
		if (num % 15 == 0) { 
			System.out.println("FizzBuzz");
		} 
		else if (num % 3 == 0) { 
			System.out.println("Fizz"); 
		} 
		else if (num % 5 == 0) { 
			System.out.println("Buzz");
		}
		else{
			System.out.println(num);
		} 
	}
}
