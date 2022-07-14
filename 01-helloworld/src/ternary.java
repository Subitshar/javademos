
public class ternary {

	public static void main(String[] args) {
		int age=19;
		boolean haslisence=true;
		
		boolean candrive =(age>18) ? true: false;
		boolean canrentacar= candrive? haslisence?true:false:false;
		System.out.println("Age :"+ age);
		System.out.println("has lisence :"+ haslisence);
		System.out.println("can drive :"+ candrive);
		System.out.println("can rent a car :"+ canrentacar);
		
	}

}
