package projectEuler;

public class Problem4 {
	
	String str = "0";
	String first_num = "0001";
	String second_num = "1000";
	
	int number;
	
	public void action(){
//		while(!first_num.equals(second_num)){
			for(int i = 1000; i < 10000; i++){
				for(int j = 1000; j < 10000; j++){
					str = Integer.toString((j*i));
					first_num = str.substring(0,str.length() / 2);
					if(first_num.length() <= 1)
						first_num = "0" + first_num;
					second_num = reverse(str.substring(str.length() / 2, str.length()));
					System.out.println(first_num + " " + second_num);
				}
			}
//		}
		System.out.println(first_num + second_num);
	}
//	
	public String reverse(String str){
		String tmp = "";
		
		for(int i = 0; i < str.length(); i++){
			tmp += str.charAt(str.length()-i-1);
		}
		
		return tmp;
	}
	
	public static void main(String[] args){
		new Problem4().action();
		String str = "9000";

//		System.out.println(tmp);
	}
}
