package leetcode;

public class ContainerMostWater {

    static int maxWater(int[] arr) {
        int water=0;
        int i=0, j=arr.length-1;
        while(i<j){
            int minHeight=Math.min(arr[i], arr[j]);
            int tempWater=minHeight*(j-i);
            if(tempWater>water) water=tempWater;
            if(arr[i]<arr[j]) i+=1;
            else j-=1;
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,18,17,6};
        System.out.println(maxWater(arr));
    }
}
