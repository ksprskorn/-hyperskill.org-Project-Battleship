import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void transferAllElements(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        ArrayList<String> tempArrayList = new ArrayList<>(arrayList);

        arrayList.clear();
        arrayList.addAll(linkedList);

        linkedList.clear();
        linkedList.addAll(tempArrayList);
    }
}