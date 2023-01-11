package Integer;

public class Int {

	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
		int x = -1203452330;
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
       
       System.out.println(System.currentTimeMillis());
	}

}
