/* Finding Duplicate No.*/


import java.util.*;

class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> rex = new ArrayList<Integer>();
        int[] arr1 = new int[n];
        
        for(int i=0; i<n; i++){
            arr1[arr[i]] += 1;
        }
        
        for(int j=0; j<n; j++){
            if(arr1[j]>1){
                rex.add(j);
            }
        }
        
        if(rex.size()==0){
            rex.add(-1);
        }
        return rex;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Solution rp = new Solution();
        ArrayList<Integer> ans = rp.duplicates(arr, n);
        System.out.println(ans);
    }
}
