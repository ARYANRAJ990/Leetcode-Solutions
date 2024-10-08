class Solution {
    public int minSwaps(String s) {
       Stack<Character> se = new Stack<>();
       for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch == '['){
                se.push(ch);
            }
            else if (se.isEmpty() || se.peek() == ']'){
                se.push(ch);
            }
            else {
                se.pop();
            }
          
       }
              int totalbrackets = se.size();
            int closedbrackets = totalbrackets/2;
            return (closedbrackets+1)/2;
    }
}