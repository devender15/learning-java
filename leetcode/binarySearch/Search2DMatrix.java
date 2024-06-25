package leetcode.binarySearch;

public class Search2DMatrix {
    static boolean solution(int[][] matrix, int target) {
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e) {
            int m=s+(e-s)/2;
//            System.out.println(matrix[0][m]);
            if(matrix[0][m]==target) {
                return true;
            }
            if(matrix[0][m]>target) {
                e=m-1;
            }
            if(matrix[0][m]<target){
                int l=m;
                int h=matrix.length-1;
                while(l<=h && l<matrix[0].length) {
                    int mid=l+(h-l)/2;
                    System.out.println("l: "+ l);
                    System.out.println("h: "+ h);
                    System.out.println("mid: "+mid);
                    System.out.println(matrix[mid][l]);
                    if(matrix[mid][l]==target && l<=matrix[mid].length-1) {
                        return true;
                    }
                    if(matrix[mid][l]>target && l<=matrix[mid].length-1) {
                        h=mid-1;
                    } else {
                        l=mid+1;
                    }

                    System.out.println("lll: " + l);
                }
                System.out.println(m);
                System.out.println("s after inner bs: " + s);
                s=m+1;
                System.out.println("s after inner bs: " + s);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{5}, {6}};

        System.out.println(solution(arr, 6));
    }
}
