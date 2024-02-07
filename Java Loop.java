/*For a given N, return an arraylist containing the sum of even and odd integers of the first N natural numbers. */

class Solution{
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(N==1){
            ans.add(0);
            ans.add(1);
        }else{
            int a=0;
            int b=0;
            for(int i=1; i<=N; i++){
                if(i%2==0){
                    a +=i;
                }else{
                    b +=i;
                }
            }
            ans.add(a);
            ans.add(b);
        }
        return ans;
    }
}
