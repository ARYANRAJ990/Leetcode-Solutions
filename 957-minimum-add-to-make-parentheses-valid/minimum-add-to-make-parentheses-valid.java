class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> se= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
                if(se.isEmpty()){
                    se.push(ch);
                }
                else if(se.peek()== '(' && ch == ')'){
                    se.pop();
                }
                else{
                    se.push(ch);
                }
        }
        return se.size();
    }
}