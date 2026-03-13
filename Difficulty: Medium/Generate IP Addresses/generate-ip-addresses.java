import java.util.ArrayList;

class Solution {
    public ArrayList<String> generateIp(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) {
            return result;
        }
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, ArrayList<String> current, ArrayList<String> result) {
        if (current.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) {
                break;
            }
            String part = s.substring(index, index + i);
            if (isValid(part)) {
                current.add(part);
                backtrack(s, index + i, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isValid(String part) {
        if (part.length() > 1 && part.charAt(0) == '0') {
            return false;
        }
        int val = Integer.parseInt(part);
        return val >= 0 && val <= 255;
    }
}