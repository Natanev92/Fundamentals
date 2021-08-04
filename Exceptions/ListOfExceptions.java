import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye world");

        for (int i=0; i<myList.size(); i++) {
            try {
                Integer casted = (Integer) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println(e);
                System.out.println("The error occurred at index "+i);
                System.out.println("The error was triggered by "+myList.get(i));
            }
        }
    }
}