package hackerrank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Resulta {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    double p=0,n=0,z=0,s=arr.size();
    for(int i =0;i<s;i++){
        if((arr.get(i)>0)&&(arr.get(i)!=0)){
            p = p+1;
        } else if(arr.get(i)==0) {
            z = z+1;
        } else {n = n+1;}
        
    }
        Formatter fm = new Formatter();
        
        fm.format("%.6f", p/s);
        System.out.println(fm);
        fm = new Formatter();
        fm.format("%.6f", n/s);
        System.out.println(fm);
        fm = new Formatter();
        fm.format("%.6f", z/s);
        System.out.println(fm);
    }

}

public class plusminus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Resulta.plusMinus(arr);

        bufferedReader.close();
    }
}
