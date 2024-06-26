import java.util.*;

class LetterCombinationsOfPhoneNumber {

    private static Map<Character, List<Character>> map;

    static
    {
        map = new HashMap<>();
        map.put('2', Arrays.asList(new Character[] {'a', 'b', 'c'}));
        map.put('3', Arrays.asList(new Character[] {'d', 'e', 'f'}));
        map.put('4', Arrays.asList(new Character[] {'g', 'h', 'i'}));
        map.put('5', Arrays.asList(new Character[] {'j', 'k', 'l'}));
        map.put('6', Arrays.asList(new Character[] {'m', 'n', 'o'}));
        map.put('7', Arrays.asList(new Character[] {'p', 'q', 'r', 's'}));
        map.put('8', Arrays.asList(new Character[] {'t', 'u', 'v'}));
        map.put('9', Arrays.asList(new Character[] {'w', 'x', 'y', 'z'}));
    }
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        letterCombinations(digits, 0, "", result);
        return result;
    }

    private void letterCombinations(String digits, int len, String cur, List<String> result) {
        if (len == digits.length()) {
            result.add(cur);
            return;
        }

        List<Character> letters = map.get(digits.charAt(len));
        letters.forEach(c -> letterCombinations(digits, len + 1, cur + c, result));

    }

    
}