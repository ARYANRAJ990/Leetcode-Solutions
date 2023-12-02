class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int pointer1 = 0;  // Pointer for word1
        int pointer2 = 0;  // Pointer for word2        
        int idx1 = 0;      // Index for the current word in word1
        int idx2 = 0;      // Index for the current word in word2

        while (pointer1 < word1.length && pointer2 < word2.length) {
            // Get the current characters from both words
            char char1 = word1[pointer1].charAt(idx1);
            char char2 = word2[pointer2].charAt(idx2);

            // Compare characters
            if (char1 != char2) {
                return false;
            }

            // Move to the next character in the current word
            idx1++;
            idx2++;

            // Move to the next word if the end of the current word is reached
            if (idx1 == word1[pointer1].length()) {
                idx1 = 0;  // Move to the next word in word1
                pointer1++;
            }

            if (idx2 == word2[pointer2].length()) {
                idx2 = 0;  // Move to the next word in word2
                pointer2++;
            }
        }

        // Check if both pointers have reached the end of their respective arrays
        return pointer1 == word1.length && pointer2 == word2.length;        
    }
}