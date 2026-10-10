class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;

        while(i < word.length() && j < abbr.length()) {
            char c = word.charAt(i);
            char d = abbr.charAt(j);

            if(Character.isDigit(d)) {
                if(d == '0') return false;
                int curr = 0;
                while(j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    curr = curr * 10 + (abbr.charAt(j) - '0');
                    j++;
                }

                i = i + curr;
            } else {
                if(c != d) return false;
                i++;
                j++;
            }
        }

        return i == word.length() && j == abbr.length();
    }
}