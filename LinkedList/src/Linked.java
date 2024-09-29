import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        int numElements = 30000;

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(0, i);
        }
        long arrayListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.get(i);
        }
        long arrayListGetTime = System.nanoTime() - startTime;

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(0, i);
        }
        long linkedListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.get(i);
        }
        long linkedListGetTime = System.nanoTime() - startTime;

        System.out.println("ArrayList add(0, element) time: " + arrayListAddTime / 1e6 + " ms");
        System.out.println("LinkedList add(0, element) time: " + linkedListAddTime / 1e6 + " ms");
        System.out.println("ArrayList get(index) time: " + arrayListGetTime / 1e6 + " ms");
        System.out.println("LinkedList get(index) time: " + linkedListGetTime / 1e6 + " ms");
    }
}