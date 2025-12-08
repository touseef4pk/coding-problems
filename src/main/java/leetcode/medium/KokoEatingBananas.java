package main.java.leetcode.medium;

//https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 8;

        int res = minEatingSpeed(piles, h);
        System.out.println(res);
    }

    //we shall use binary search appraoch
    public static int minEatingSpeed(int[] piles, int h){

        int minSpeed = 1; //left
        int maxSpeed = 0; //right

        //get the max speed
        for (int i = 0; i < piles.length; i++) {
            maxSpeed = Math.max(maxSpeed, piles[i]);
        }

        while (minSpeed < maxSpeed) {

            // we get the mid, mid is here the speed at which koko eat banana, for example first time it is 6 for the give array
            int mid = (minSpeed + maxSpeed) / 2;
            int hours = 0;

            for ( int pile: piles) {
                hours += (pile + mid -1) / mid;  //ceiling
            }

            if (hours <= h)
                maxSpeed = mid;
             else
               minSpeed = mid + 1;
        }
      return minSpeed;
    }
}
