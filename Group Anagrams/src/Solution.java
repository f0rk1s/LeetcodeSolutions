import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, ArrayList<String>> categorizedWithLengthList = new HashMap<>();

        List<List<String>> answer = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            //categorize words with respect to their length
            int length = strs[i].length();
            if (!categorizedWithLengthList.containsKey(length)) {
                categorizedWithLengthList.put(length, new ArrayList<String>());
            }
            categorizedWithLengthList.get(length).add(strs[i]);
        }
        //group by anagram
        for (ArrayList<String> wordList : categorizedWithLengthList.values()) {
            List<ArrayList<String>> x = categorizeList(wordList);
            for (ArrayList y : x) {
                answer.add(y);
            }
        }
        return answer;
    }

    static boolean checkAnagramForSameLength(String s, String t) {
        int[] lettersUsed = new int[26];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int x = c - 97;
            lettersUsed[x]++;
            char c1 = t.charAt(i);
            x = c1 - 97;
            lettersUsed[x]--;
        }
        for (int n : lettersUsed) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    static List<ArrayList<String>> categorizeList (ArrayList<String> wordList) { //wooh
        List<ArrayList<String>> categorized = new ArrayList<>();
        int numberOfCategories = 0;
        while (wordList.size() > 0) { //loop for i
            int j = 1;
            categorized.add(new ArrayList<>());
            numberOfCategories++;
            categorized.get(numberOfCategories - 1).add(wordList.get(0));
            //loop for j
            while (j <= wordList.size() - 1) {
                if (checkAnagramForSameLength(wordList.get(0), wordList.get(j))) {
                    categorized.get(numberOfCategories - 1).add(wordList.get(j));
                    wordList.remove(j); //remove it from the list
                    continue;
                }
                j++;
            }
            wordList.remove(0); //change i
        }
        return categorized;
    }
}
