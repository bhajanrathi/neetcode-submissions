class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Hash Table approach
        HashMap<String, List<String>> res = new HashMap<>();
        for(String s : strs) {
            int count[] = new int[26];
            for(int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            String countStr = Arrays.toString(count);
            res.putIfAbsent(countStr, new ArrayList<>());
            res.get(countStr).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
