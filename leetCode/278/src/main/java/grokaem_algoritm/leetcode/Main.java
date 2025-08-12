package grokaem_algoritm.leetcode;


public class Main {
    public static void main(String[] args) {
    int[] arr = new int[]{1,3,5,6};
        System.out.println("OUTPUT:"+searchInsert(arr,5));
        System.out.println("OUTPUT:"+searchInsert(arr,2));
        System.out.println("OUTPUT:"+searchInsert(arr,7));
    }

    static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index:"+i+" Value:"+nums[i]);
            if (nums[i] == target) {
                return i;
            }else if (nums[i] > target) {
                return i;
            }else if (nums.length == (i+1)){
                return (i+1);
            }

        }
        return 0;
    }
}