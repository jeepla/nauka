import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();

        while (true) {
            System.out.println("Please input what you want to do");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input == 1) {
                System.out.println("Type in list of items you want to add, comma delimited");
                String listItem = scanner.nextLine();
                String[] items = listItem.split(",");
                for (String i : items){
                    if (groceryList.contains(i)){
                        System.out.println("already on the list");
                    }else {
                        String trimmed = i.trim();
                        groceryList.add(trimmed);
                    }
                }
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            }
            if (input == 2) {
                System.out.println(groceryList);
                System.out.println("Type in list of items you want to remove, comma delimited");
                String listItem = scanner.nextLine();
                String[] items = listItem.split(",");
                for (String i : items) {
                    groceryList.remove(i);
                }
                groceryList.sort(Comparator.naturalOrder());
                System.out.println(groceryList);
            }
        }
    }
}
