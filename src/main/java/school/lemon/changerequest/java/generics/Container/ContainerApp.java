package school.lemon.changerequest.java.generics.Container;


public class ContainerApp {
    public static void main(String[] args) {

        Container<Integer> container = new Container<>();
        container.add("word");
        container.add(234);
        container.add("<some element>");
        container.add(.4432);
        container.add(5);
        container.add(6);
        container.add(7);
        container.add(8);
        container.add(9);
        container.add(10);
        System.out.format("Add element in container: %s \n", container.toString());
        container.add("add");
        System.out.format("Add element in index bigger then size: %s \n", container.toString());
        System.out.format("Get element by index: %s \n", container.get(0));
        System.out.format("Get element by index bigger then size: %s \n", container.get(15));
        container.add(33, 11);
        System.out.format("Add element by index: %s \n", container.toString());
        container.remove(3);
        System.out.format("Remove element by index: %s \n", container.toString());
        container.clear();
        System.out.format("Clear container: %s \n", container.toString());
        System.out.format("Try to get element after clear container: %s \n", container.get(0));
    }
}