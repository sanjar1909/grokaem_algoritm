package grokaem_algoritm.leetcode;


public class Main {
    public static void main(String[] args) {
        System.out.println("OUTPUT:"+firstBadVersion(5));
        System.out.println("OUTPUT:"+firstBadVersion(1));
        System.out.println("OUTPUT:"+firstBadVersion(2126753390));

    }

    static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
           int mid = left + (right - left) / 2;
           if (isBadVersion(mid)) {
               right = mid;
           }else {
               left = mid + 1;
           }

        }
        return left;
    }

    static boolean isBadVersion(int version) {

         if (version == 1702766719) {
            return true;
        }
        return false;
    }

}