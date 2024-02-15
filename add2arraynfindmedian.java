import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] cars = {1,2,3,41,51};
    int[] sarc = {6,7,8,9,10};
    int a = cars.length;
    int b = sarc.length;
    int[] rex= new int[a+b];
    int k=0;
    for(int i=0;i<cars.length; i++){
    	rex[k++] = cars[i];
    }
    for(int i=0;i<sarc.length; i++){
    	rex[k++] = sarc[i];
    }
    Arrays.sort(rex);
    for(int j=0; j<rex.length; j++){
    System.out.print(rex[j] + " " );
    }
    
    int sum = a+b;
    int median=0;
    int c =0;
    if(sum%2==1){
    	median = sum/2;
        c= rex[median];
        System.out.println("");
        System.out.println("Median is " + c);
    }else{
    	System.out.println("");
    	System.out.println("Array is even");
        int left = sum/2 - 1;
        int right = sum/2;
        int l = (left+right)/2 +1;
        c = rex[l];
        System.out.println("Median is " + c);
    }
    
    
  }
}
