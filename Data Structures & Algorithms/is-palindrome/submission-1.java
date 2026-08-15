class Solution {
    public boolean isPalindrome(String s) {
        List<Character> ls = new ArrayList<>();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                ls.add(Character.toLowerCase(c));
            }
        }

        int i = 0, j = ls.size()-1;
        while(i < j) {
            if(ls.get(i).equals(ls.get(j))) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
