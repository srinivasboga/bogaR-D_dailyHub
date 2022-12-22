package Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0, N = 15;
		//System.out.print(fs+" ");	
		for(int i =0;i<A.length;i++) {
			
			sum = sum +A[i];
			if(sum==N) {
				System.out.println(A[0]+" "+A[i]);
				break;}
		}
		
		System.out.println("========INteger==========");
		
		int x = 1203452330;
		int n,rev=0,res = x;
        if(x<0){
                   x = x*(-1);
           } 
           while(x%10==0) {
               x = x/10;
           }
       do { 
           n = x % 10;
           rev = rev*10 + n;
           x=x/10;
       } while(n>1);

       if(res<0) {
              System.out.println(-rev); 
       }  else {
           System.out.println(rev);
       }
		
	}

}
