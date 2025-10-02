class Solution {
    public int lengthOfLastWord(String s) {
        
        boolean flag = false;
        int length = 0;
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                length++;
                flag = true;
            }
            else{
                if(flag){
                    break;
                }
            }
        }
        return length;
    }
}