package pr;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class list {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(10);
		list.add(23);
		
		Scanner sc =new Scanner(System.in);
//		try {
//		while(sc.hasNext()) {		
//		list.add(sc.nextInt());
//		}
//		sc.close();
//		}
//		catch(InputMismatchException e) {
//			System.out.print("\n");
//		}
		System.out.println(list);
		
		for(int i : list)
			System.out.print(" "+i);
		
		List<List<Integer>> ls= new ArrayList<List<Integer>>();
		ls.add(0, list);
		ls.add(1, list);
		ls.add(2,list);
		//ls.add(n, sc.nextInt());
		for(List<Integer> i: ls)
			for(int j : i)
			System.out.println(j);
	}

}
