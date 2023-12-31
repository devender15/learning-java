package leetcode;

public class RBS {

    static  int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while(s<=e) {
            int mid = s + (e-s) / 2;
            // 4 cases
            if(mid<e && arr[mid] > arr[mid+1]) {
                return mid;
            } if(mid>s && arr[mid] < arr[mid-1]) {
                return  mid - 1;
            }

            if(arr[mid] == arr[s] && arr[mid] == arr[e]) {
                // skip the duplicates
                // CHECK what if the s and e elements are pivot ?
                if(arr[s] > arr[s+1]) {
                    return s;
                }
                s += 1;

                // check whether e is pivot or not
                if(arr[e] < arr[e-1]) {
                    return e-1;
                }
                e -= 1;
            }

            // left side is sorted, so pivot should be in right
            else if(arr[s] < arr[mid] || (arr[s] == arr[mid] && arr[mid] > arr[e])) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return  -1;
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        while(s<e) {
            int mid = s + (e-s) / 2;
            if(target > arr[mid]) {
                s = mid + 1;
            } else if(target < arr[mid]) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
//        System.out.println(findPivot(arr));

        int pivot = findPivot(arr);

        // if did not find the pivot, it means the array is not rotated
        if(pivot == -1) {
            System.out.println(binarySearch(arr, 0, 0, arr.length - 1));
        }

        // if pivot is found then it means we have found 2 asc arrays
        if(arr[pivot] == 0) {
            System.out.println(pivot);
        }

        if(0 >= arr[0]) {
            System.out.println(binarySearch(arr, 0, 0, pivot - 1));
        }

        System.out.println(binarySearch(arr, 0, pivot+1, arr.length-1));
    }
}
