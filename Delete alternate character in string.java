class Solution {
    static String delAlternate(String S) {
        // code here
        String rex = "";
        for(int i=0 ; i<S.length(); i++){
            if(i%2==0){
                rex += S.valueOf(S.charAt(i));
            }
        }
        return rex;
    }
}
