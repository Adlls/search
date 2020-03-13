public class main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

       System.out.println(BinarySearch(arr, 6));
       System.out.println(LinearSearch(arr, 122));
       System.out.println(InterpolationSearch(arr, 11));

    }

    public static int InterpolationSearch(int arr[], int target) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = min + (max - min)*(target - arr[min]) / (arr[max] - arr[min]);

            if (target > arr[arr.length - 1]) return -1;

            if (arr[mid] > target) max = mid - 1;
            else if (arr[mid] < target) min = mid + 1;
            else return mid;
        }

        return -1;
    }

    //return -1 or 1
    public static int LinearSearch(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) return -1;
            if (arr[i] == target) return 1;
        }
        return -1;
    }

    //return index
    public static int BinarySearch(int arr[], int target) {

        int max = arr.length - 1;
        int min = 0;


        while (min <= max) {
            int mid = (max + min) / 2;
            if (target > arr[mid]) min = mid + 1;
            else if (target < arr[mid]) max = mid - 1;
            else return mid;
        }

        return -1;
    }
}
