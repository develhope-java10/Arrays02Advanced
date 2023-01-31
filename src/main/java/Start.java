import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Start {
    public static void main(String[] args) {
        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};

        System.out.println("Alice == Bob? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Alice == Tim? " + Arrays.equals(aliceToDos, timToDos));

        System.out.println("Alice.length == Bob.length? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Alice.length == Tim.length? " + (aliceToDos.length == timToDos.length));

        System.out.println("Set based comparison");
        setBasedComparison(aliceToDos, bobToDos, timToDos);

        System.out.println("Sort based comparison");
        sortBasedComparison(aliceToDos, bobToDos, timToDos);
    }

    static void sortBasedComparison(String[] aliceToDos, String[] bobToDos, String[] timToDos) {
        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);
        System.out.println("Alice tasks == Bob tasks? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Alice tasks == Tim tasks? " + Arrays.equals(aliceToDos, timToDos));
    }

    static void setBasedComparison(String[] aliceToDos, String[] bobToDos, String[] timToDos) {
        Set<String> aliceSet = new HashSet<>();
        Collections.addAll(aliceSet, aliceToDos);

        Set<String> bobSet = new HashSet<>();
        Collections.addAll(bobSet, bobToDos);

        Set<String> timSet = new HashSet<>();
        Collections.addAll(timSet, timToDos);

        System.out.println("Alice tasks == Bob tasks? " + aliceSet.equals(bobSet));
        System.out.println("Alice tasks == Tim tasks? " + aliceSet.equals(timSet));
    }
}
