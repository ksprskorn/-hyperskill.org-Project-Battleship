import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void changeHeadsAndTails(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        String strTemp = linkedList.getFirst();
        linkedList.set(0, arrayList.get(0));
        arrayList.set(0, strTemp);

        strTemp = linkedList.getLast();
        linkedList.set(linkedList.size() - 1, arrayList.get(arrayList.size() - 1));
        arrayList.set(arrayList.size() - 1, strTemp);


    }
}