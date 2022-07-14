
public class o3string {

	public static void main(String[] args) {
		
		// declare the string:
		//method 1
		String name="subitsha";
		
		//method 2
		char[] c= {'h','e','l','l','o'};
		String s=new String(c);
		
		//method 3
		String s1=new String("Somu");
		
		//method 4
		byte[] b= {65,66,67,68,69};
		String s2=new String(b);
		
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
