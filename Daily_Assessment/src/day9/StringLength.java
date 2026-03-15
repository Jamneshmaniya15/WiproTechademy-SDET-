package day9;

import java.util.*;

public class StringLength {
    public static int minLength(String S) {
        int result = 0;
        // Write your logic here

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs, Collections.reverseOrder());

        int removeCount = 0;
        for (int i = 0; i < Math.min(2, freqs.size()); i++) {
            removeCount += freqs.get(i);
        }

        result = S.length() - removeCount;

        return result;
    }

    //Non editable starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(minLength(S));
    }
}
//Non editable ends here