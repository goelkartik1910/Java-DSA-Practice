package Arrays_ArrayListss;

public class FindIndexInInfiniteArray {
    public static void main(String[] args) {

    }

    public static int[] ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return new int[]{searchRange(arr, target, start, end)};
    }

    public static int searchRange(int[] nums, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]) {
                end = mid - 1;
            }else if (target > nums[mid]) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
