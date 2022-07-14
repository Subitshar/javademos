
public class o8condition {

	public static void main(String[] args) {
		boolean ismale=false;
		if(ismale) {
			System.out.println("Female");
		}
		if(!ismale) {
			System.out.println("male");
		}
		String name="subi";
		if(name=="subi") {
			System.out.println("correct name");
		}
		boolean x=true;
		boolean y=true;
		
		System.out.println(x && y);
		
		int a=10;
		int b=8;
		int c=20;
		
		System.out.println("a<b && a<c ="+((a<b) && (++a<c)) );
		System.out.println("A value after logical and operation,"+a);
		System.out.println("a<b && a<c ="+((a<b) & (++a<c)) );
		System.out.println("A value after bit and operation,"+a);
		
		
		//pre and post increament
		System.out.println("post increament result ");
		int i=3;
		int z=i++;
		System.out.println(z);
		System.out.println(i);
		System.out.println("pre decreament result ");
		int j=3;
		int k=--j;
		System.out.println(k);
		System.out.println(j);
		
	}

}
