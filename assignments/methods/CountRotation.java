package assignments.methods;

public class CountRotation {
    static int countRotation(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

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

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 12, 15, 18};
        System.out.println(countRotation(arr));
    }
}
