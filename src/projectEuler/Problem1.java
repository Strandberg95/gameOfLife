package projectEuler;

public class Problem1 {
	float value1 = 1;
	float value2 = 1;
	float sum = 0;
	
	public void action(){
		for(float i = 1; i < 10; i++){
			if(i % 3 == 0 || i % 5 == 0){
				sum += i;
			}
		}
		System.out.println();

		System.out.println(sum);
	}
	
	public static void main(String[] args){
		Problem1 ex = new Problem1();
		ex.action();
	}

}
