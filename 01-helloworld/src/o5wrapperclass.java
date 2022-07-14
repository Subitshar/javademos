
public class o5wrapperclass {

	public static void main(String[] args) {
		int x=2;
		Integer z=5;
		x=z;
		int myint=z.intValue();
		System.out.println(x);
		z=x;
		System.out.println(myint);
	}

}
