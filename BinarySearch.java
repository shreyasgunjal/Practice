


class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int left = 0;
        int right = n-1;
        int mid;
        while(left<=right){
            mid = (left + right)/2;
            
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                left = mid +1;
            }else{
                right = mid -1;
            }
        }
        return -1;
    }
}
