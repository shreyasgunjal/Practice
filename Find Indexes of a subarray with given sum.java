/* Find Indexes of a subarray with given sum*/

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0;
        int last = 0;
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        while(last<n){
            
            sum += arr[last];
            
            while(sum>s && start<=last){
                sum -= arr[start];
                start++;
            }
            
            if(sum == s && start<=last){
                res.add(start+1);
                res.add(last+1);
                return res;
            }
            
            last++;
        }
        res.add(-1);
        return res;
    }
}
