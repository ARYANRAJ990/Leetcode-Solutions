
public class Solution {
    // Helper function to check if a character is a vowel.
    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    // Function to sort vowels in a string and maintain the original order of non-vowel characters.
    public String sortVowels(String s) {
        StringBuilder t = new StringBuilder();   // Resulting string after sorting vowels.
        StringBuilder temp = new StringBuilder(); // Temporary string to store vowels from the original string.

        // Step 1: Extract and store vowels from the original string in the temporary string 'temp'.
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                temp.append(s.charAt(i));
            }
        }

        // Step 2: Sort the temporary string 'temp' containing vowels.
        char[] tempArray = temp.toString().toCharArray();
        Arrays.sort(tempArray);

        // Step 3: Reconstruct the resulting string 't' by inserting sorted vowels and maintaining the order of non-vowel characters.
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                t.append(tempArray[j]);
                j++;
            } else {
                t.append(s.charAt(i));
            }
        }

        // Step 4: Return the final sorted string.
        return t.toString();
    }
}
