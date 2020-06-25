import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListImplementation {
    public static void main(String[] args) throws IOException {
        LinkedList<String> originalList = new LinkedList<String>();
        originalList.add("one");
        originalList.add("two");
        originalList.add("three");
        System.out.println("Original List: "+ originalList);
        LinkedList<String> addList = new LinkedList<String>();
        addList.add("one");
        addList.add("two");
        addList.add("five");
        addList.add("six");
        System.out.println("Add List: "+ addList);
        originalList.addAll(addList); //adding list
        System.out.println("List after addition: "+ originalList);
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if(s.equals(t1)){
                    return 0;
                }else if(s.length() > t1.length()){
                    return -1;
                }else if(s.length() == t1.length()){
                    return Integer.compare(0, s.compareTo(t1));
                }else{
                    return 1;
                }
            }
        });
        ts.addAll(originalList);
        System.out.println("List after sorting : "+ ts);
        LinkedList<String> deleteList = new LinkedList<String>();
        deleteList.add("two");
        deleteList.add("five");
        System.out.println("Delete List: "+ deleteList);
        ts.removeAll(deleteList);
        System.out.println("List after Deletion: "+ ts);
        System.out.println("Final Result List : "+ ts);

    }
}
