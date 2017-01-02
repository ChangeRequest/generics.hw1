package school.lemon.changerequest.java.generics;

/**
 * Created by lera on 21.12.16.
 */
public class ContainerDemo {

    public static void main(String[] args) {

        Container<Integer> container = new Container<>();
        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);
        container.add(6);
        container.add(7);
        container.add(8);
        container.add(9);
        container.add(10);
        System.out.println("Add element in container: " + container.toString());
        System.out.println();

        container.add(11);
        System.out.println("Add element in index bigger then size: " + container.toString());
        System.out.println();

        System.out.println("Get element by index: " + container.get(0));
        System.out.println("Get element by index bigger then size: " + container.get(15));
        System.out.println();

        container.add(33, 3);
        System.out.println("Add element by index: " + container.toString());
        System.out.println();

        container.remove(3);
        System.out.println("Remove element by index: " + container.toString());
        System.out.println();

        container.clear();
        System.out.println("Clear container: " + container.toString());
        System.out.println("Try to get element after clear container: " + container.get(0));
    }
}
