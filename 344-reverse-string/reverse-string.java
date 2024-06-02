class Solution {
    public void reverseString(char[] s) {
       int start=0;
       int end= s.length-1;
       //int n= s.length();
       while(start < end){
        char temp= s[end];
        s[end] = s[start];
        s[start] = temp;
        start++;
        end--;
       } 
    }
}