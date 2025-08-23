import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.print("Enter Generated Numeric Array Col: ");
        Scanner scanner = new Scanner(System.in);
        int genNCol = scanner.nextInt();
        List<Integer> genIArray = generateListN(genNCol);
        System.out.println("**************************");
        System.out.print("Enter Target Numeric: ");
        int targetNCol = scanner.nextInt();
        List<Integer> s = List.of(2,4,6,8,10,12,14,16);
        int resutl = binarySearch(s, targetNCol);

        System.out.println("The target number  idx is " + resutl);


    }

    private static List<Integer> generateListN(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<String> generateList() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");
        list.add("M");
        list.add("N");
        list.add("O");
        list.add("P");
        list.add("Q");
        list.add("R");
        list.add("S");
        list.add("T");
        list.add("U");
        list.add("V");
        list.add("W");
        list.add("X");
        list.add("Y");
        list.add("Z");
        return list;


    }


    private static int binarySearch(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println(low + " " + high +"  "+mid);
            if (list.get(mid) == (target)) {
                return mid;
            } else if (list.get(mid) > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }


        }
        return -1 ;
    }





}
