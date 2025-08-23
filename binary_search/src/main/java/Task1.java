import java.util.*;

public class Task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************* BINARY SEARCH TASK 1 *******************************");
        System.out.print("Enter Target Name: ");
        String targetName = scanner.next();
        binarySearch(nameList(), targetName);
    }


    private static List<String> nameList(){
       return List.of(
                "Adam", "Alex", "Alice", "Amanda", "Amir", "Andrew", "Angela", "Anna",
                "Anthony", "Aria", "Arthur", "Ashley", "Aurora", "Ava", "Barbara", "Bella",
                "Benjamin", "Bethany", "Blake", "Brandon", "Brianna", "Bruce", "Bryan", "Caleb",
                "Cameron", "Carla", "Carmen", "Caroline", "Catherine", "Charles", "Charlotte", "Chloe",
                "Chris", "Christian", "Christina", "Christopher", "Clara", "Cole", "Colin", "Connor",
                "Courtney", "Craig", "Daniel", "Daria", "David", "Diana", "Diego", "Dominic",
                "Donna", "Dylan", "Edward", "Eleanor", "Elena", "Elias", "Elijah", "Elizabeth",
                "Ella", "Emily", "Emma", "Eric", "Ethan", "Eva", "Evelyn", "Faith",
                "Felix", "Fiona", "Frank", "Gabriel", "Gavin", "George", "Grace", "Hannah",
                "Harold", "Harry", "Heather", "Helen", "Henry", "Holly", "Hunter", "Ian",
                "Irene", "Isaac", "Isabella", "Jack", "Jackson", "Jacob", "Jade", "James",
                "Jasmine", "Jason", "Jeffrey", "Jennifer", "Jessica", "Joan", "John", "Johnny",
                "Jonathan", "Jordan", "Joseph", "Joshua", "Julia", "Julie", "Justin", "Karen",
                "Katherine", "Kathryn", "Kayla", "Keith", "Kelly", "Kevin", "Kimberly", "Kyle",
                "Laura", "Lauren", "Leo", "Leonard", "Liam", "Lily", "Logan", "Lucas",
                "Lucy", "Luis", "Luke", "Madeline", "Madison", "Margaret", "Maria", "Mark",
                "Martha", "Mary", "Mason", "Matthew", "Megan", "Melanie", "Melissa", "Michael"
        );
    }



    private static void binarySearch(List<String> nameList, String target){
        // сортируем список (обязательно!)
        List<String> sortedList = new ArrayList<>(nameList);
        Collections.sort(sortedList);
        int low = 0;
        int high = sortedList.size()-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(sortedList.get(mid).equals(target)){
                System.out.println("The target "+target+ " Array index is: "+ mid);
                return;
            }else if(target.compareTo(sortedList.get(mid))<0){
                high = mid - 1;
            }else {
                low = mid + 1;
            }

        }

        System.out.println("The target "+target+ " Not exist in Array");

    }
}
