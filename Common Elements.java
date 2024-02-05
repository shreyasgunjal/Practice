/* Common Elements in 2 Arrays */

class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i =0; i<v1.length; i++){
            int sh = v1[i];
            for(int j=0; j<v2.length; j++){
                int at = v2[j];
                if(sh == at){
                    arr.add(sh);
                }
            }
        }
        return arr;
    }
}
