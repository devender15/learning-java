package leetcode.binarySearch;

public class Koko {
    static int minEatingSpeed(int[] piles, int h) {
        int k = 2;
        boolean c = true;
        while(c) {
            int totalTime = 0;
            for (int pile : piles) {
                totalTime += Math.ceil((double) pile / k);
                System.out.println(totalTime);
            }
            if(totalTime > h) {
                k += 1;
            } else {
                c = false;
            }
        }

        return k;
    }
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
}
