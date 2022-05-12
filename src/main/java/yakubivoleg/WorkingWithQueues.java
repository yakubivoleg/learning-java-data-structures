package yakubivoleg;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Oleh", 28));
        linkedList.add(new Person("Iryska", 23));
        linkedList.addFirst(new Person("Amigo", 29));
        ListIterator<Person> personListIterator = linkedList.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }

    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<Person>();
        supermarket.add(new Person("Oleg",28));
        supermarket.add(new Person("Iryska",23));
        supermarket.add(new Person("Alex",23));

        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){};
}
