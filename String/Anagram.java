class Solution {
public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) { //check length
        return false;
    }

    int[] arr = new int[26]; // create the single for balancing

    for (int i = 0; i < s.length(); i++) {
        arr[s.charAt(i) - 'a']++; //adding 
    }

    for (int i = 0; i < t.length(); i++) {
        arr[t.charAt(i) - 'a']--; //sub 
    }

    for (int i = 0; i < 26; i++) {
        if (arr[i] != 0) { //entire array if not zero
            return false;
        }
    }

    return true;
}
