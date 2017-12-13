import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVist = new LinkedList<String>();
        addInOrder(placesToVist, "Sydney");
        addInOrder(placesToVist, "Melbourne");
        addInOrder(placesToVist, "Taipei");
        addInOrder(placesToVist, "Dallas");
        addInOrder(placesToVist, "Austin");
        addInOrder(placesToVist, "Alice Spring");
        visit(placesToVist);
    }

    public static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("++++++++++++++++++++");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0 ) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destionation");
                return false;
            } else if(comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparision < 0) {
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                     } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Action: \n");
        System.out.println("0: quit \n");
        System.out.println("1: next \n");
        System.out.println("2: previous \n");
        System.out.println("3: menu \n");
    }
}
