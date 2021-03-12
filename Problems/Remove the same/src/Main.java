import java.util.ArrayList;
import java.util.LinkedList;

class ListOperations {
    public static void removeTheSame(LinkedList<String> linkedList, ArrayList<String> arrayList) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(arrayList.get(i))) {
                linkedList.remove(i);
                arrayList.remove(i);
                i--;
            }
        }
    }
}