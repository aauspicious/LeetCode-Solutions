class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();   // String ko char array me badla
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (!isVowel(arr[start])) {     // left vowel nahi hai
                start++;
            } else if (!isVowel(arr[end])) { // right vowel nahi hai
                end--;
            } else {                         // dono vowels -> swap
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(arr);  // char array se nayi String banayi
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);  // uppercase handle
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
