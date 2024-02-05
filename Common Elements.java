/* Common Elements in 2 Arrays */

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Brute-Force Approach or Naive
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for(int i =0; i<v1.length; i++){
        //     int sh = v1[i];
        //     for(int j=0; j<v2.length; j++){
        //         int at = v2[j];
        //         if(sh == at){
        //             arr.add(sh);
        //         }
        //     }
        // }
        // return arr;


        //Two_pointer Approach
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        Arrays.sort(v1);
        Arrays.sort(v2);
        int i=0;
        int j=0;
        
        while(i<v1.length && j<v2.length){
            if(v1[i] == v2[j]){
                arr.add(v1[i]);
                i++;
                j++;
            }else if(v1[i]<v2[j]){
                i++;
            }else{
                j++;
            }
        }
        return arr;
    }
}
