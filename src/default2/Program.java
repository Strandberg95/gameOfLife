package default2;

import java.io.Console;
import java.util.*;

public class Program {
	
	static ArrayList<Person> personer;
	
	static String personName;
    static int personAge;
	
	static int caseSystem = 0;
    static Scanner inputScanner;
	
	static boolean whileTrue = true;
	
	static Console console;
	
	public static void main (String args[]){
		
		personer = new ArrayList<Person>();
		inputScanner = new Scanner(System.in);
		console = System.console();
		
		
	
//		if(caseSystem == 1){
	    while(whileTrue){
		
	
		switch(caseSystem){
		
		case(0):
			int menuAnswer;
		System.out.println("Press 1 to add a new person to the list");
		System.out.println("Press 2 to read the list of people");
		System.out.println("Press 3 to exit");
		menuAnswer = inputScanner.nextInt();
		
		if(menuAnswer == 1){
			caseSystem = 1;
		}
		if(menuAnswer == 2){
			caseSystem = 3;
			
		}
		if(menuAnswer == 3){
			System.exit(caseSystem);
		}
		
			break;
	
		case(1):
				
			System.out.println("Add a name:");
		    personName = inputScanner.next();
		    
		    System.out.println("Add an age:");
		    personAge = inputScanner.nextInt();
		    
//		    inputScanner.close();
		    
		    caseSystem = 2;
		    
		    break;
				
				
			
			case(2):
				
				String answer;
				System.out.println("You entered " + personName + " Who is " + personAge + " Years old. Is that correct? Y/N");
				answer = inputScanner.next();
				
//				System.out.print(answer);
						
				if(answer.startsWith("y")||answer.startsWith("Y")){
//					System.out.print("sup fag");
					personer.add(new Person(personAge, personName));	
					caseSystem = 0;
				}
				else{
					caseSystem = 0;
				}
				
				break;
			
			case(3):
				String case3Answer;
				
				for(int i = 0; i < personer.size(); i++){
					personer.get(i).writeInfo();
//					caseSystem = 0;
				}
			
			
			System.out.println("1: Go Back To Menu");
			System.out.println("2: Exit");
			
			case3Answer = inputScanner.next();
			
			if(case3Answer.contains("1")){
				caseSystem = 0;
//				System.out.
			}
			
			
				
			
			}
			

	}
		    	
//		}
//			System.out.println("fag");
			
			
//		caseSystem = 1;
//		System.out.println(caseSystem);
//		scanner = new Scanner();
		
//		for(int a = 0; a < 1; a++){
//			
//			personer.add(new Person(15,"Adam"));
//			personer.add(new Person(32,"Fredrik"));
//			personer.add(new Person(25,"Nora"));
//			personer.add(new Person(22,"Bobby"));
//			personer.add(new Person(19,"Anders"));
//			
//		}
		

		
//		System.out.println(personer.size());
		
	}

}
