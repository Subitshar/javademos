
public class o11looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=22;i<99;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
			
		}
		int sum=0;
		int count=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				count++;
				sum=sum+i;
				if(count==5) {
					break;
				}
			}
		}
		System.out.println(sum);
		System.out.println(count);

	}

}
