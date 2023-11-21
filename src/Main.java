import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i*10);
        }

        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println("Traverse the element forward");
        // Traverse the element in the list
        while(listIterator.hasNext()) {
            System.out.println("The current element index is " + listIterator.nextIndex());
            System.out.println(listIterator.next());
        }
        System.out.println("Traversing element backward");
        // The Iterator is at the end of the list right now
        while(listIterator.hasPrevious()) {
            System.out.println("The current element index is " + listIterator.previousIndex());
            System.out.println(listIterator.previous());
        }

        // Print the list in the reverse order
        Collections.sort(list, Collections.reverseOrder());
        for (int a : list) {
            System.out.println(a);
        }
    }
}