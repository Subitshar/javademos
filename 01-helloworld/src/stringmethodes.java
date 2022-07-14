
public class stringmethodes {

	public static void main(String[] args) {
		String s="hai hello how are you";
		System.out.println(s.length());
		System.out.println("Index of l "+s.indexOf('l'));
		System.out.println(s.charAt(20));
		System.out.println(s.isBlank());
		System.out.println("sub string :"+s.substring(3));
		System.out.println("sub string :"+s.substring(7,7+5));
		System.out.println("Index of :"+s.indexOf('l'));		
		System.out.println("Index of :"+s.indexOf('l', 4));
		
		
		//split string by space
		String[] s2=s.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		
		//index of space:
		System.out.println("index space : "+ s.indexOf(" "));
		
		//replace
		System.out.println("replace the l by e :"+ s.replace('l', 'e'));
		
		//to lower to upper
		System.out.println("change to upper case :"+ s.toUpperCase());
		System.out.println("change to lower case :"+ s.toLowerCase());


	}
	
}