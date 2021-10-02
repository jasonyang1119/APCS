/*
Jason Yang
APCS
HW08 -- Refactor Freshie Zero/ Personalized greeting using a function call
2020-9-30
*/

/*
DISCOVERIES: The "main" method is the code that gets run. The "main" method code below calls the "Greet" method.
QUESTIONS: How would you change the code so it can take user input instead of hardcoded names?
*/



public class GreetFxnCall {
	public static void main(String [] args) {
		Greet("Jason");
		Greet("David");
		Greet("Jaylen");
	}

	public static void Greet(String name) {
		System.out.printf("Why, hello there, %s. How do you do?" , name);
		System.out.println(" ");
	}
}

