import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//ArrayList<Integer>[] ls = new ArrayList<Integer>[n]();
		
		//ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>(n);
		
	//	List<Integer> a = new ArrayList<Integer>();
		
		//ls.add(sc.nextInt(), null);
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=50000;j++) {
//				//ls.add(i,j) = sc.nextInt();
//				ls.addAll(i);
//				ls.add();
//				ls.re
//				
//				System.out.println(ls.get(i).get(j));
//			}
			
		
		//Scanner sc = new Scanner((System.in));
        //int n = sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++){
            ls.add(sc.nextInt());
        }
        if(sc.nextLine()=="Delete") {
                ls.remove(sc.nextInt());
            } else if(sc.nextLine()=="Insert"){
                ls.add(sc.nextInt(), sc.nextInt());
            }
        
        for(int i =0;i<n;i++){
            System.out.print(ls.get(i)+" ");
        }
		
	}

}
