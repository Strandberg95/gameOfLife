package projectEuler;

public class Problem2 {
	int sum = 0;
	
	boolean going = true;
	
	int[] tal = {1,2};
	
	public void action(){
		
		while(going){
			getSum(tal[0],tal[1]);
		}
		System.out.println(sum);
	}
	public void getSum(int tal1, int tal2){

		int tmp = tal1 + tal2;
		
		if(tal1 <= 4000000){
			if(tal1 % 2 == 0){
				System.out.println("tal1: " + tal1 + " tal2: " + tal2);
				sum += tal1;	
			}
			tal[0] = tal2;
			tal[1] = tmp;
		}
		else
			going = false;	
	}
	
	public static void main(String[] args){
		new Problem2().action();
	}

}
