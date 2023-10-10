package org.koreait;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q7 {
    public static void main(String[] args) {
        int[] ranks = getRanks(new int[] {44, 1, 0, 0, 31, 25}, getWinNums());
        System.out.println(Arrays.toString(ranks));

        int[] ranks2 = getRanks(new int[] {0, 0, 0, 0, 0, 0}, getWinNums());
        System.out.println(Arrays.toString(ranks2));

        int[] ranks3 = getRanks(new int[] {45, 4, 35, 20, 3, 9}, getWinNums());
        System.out.println(Arrays.toString(ranks3));

    }

    public static int[] getRanks(int[] lottos, int[] winNums) {
        int hidden = 0; // 0으로 표기된 감춰진 번호 갯수
        int match = 0; // 로또 번호 일치 갯수

        for (int lotto: lottos) {
            if (lotto == 0) hidden++;
            else {
                boolean result = Arrays.stream(winNums).anyMatch(x -> x == lotto);
                if (result) match++;
            }
        }
        int maxRank = 7 - match - hidden;
        int minRank = 7 - match;

        return new int[] { maxRank, minRank > 6 ? 6 : minRank};
    }

    public static int[] getWinNums() {
        Set<Integer> winNums = new HashSet<>();
        while(winNums.size() < 6) {
            int num = (int)Math.ceil(Math.random() * 46); // 1~46
            winNums.add(num);
        }

        int[] nums = winNums.stream().mapToInt(x -> x).toArray();
        return nums;
    }
}
