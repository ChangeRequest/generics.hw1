package school.lemon.changerequest.java.generics.container;

public class GenericContainerDemo {
    public static void main(String[] args) {
        intDemonstration();
        stringDemonstration();
    }

    public static void intDemonstration() {
        System.out.println("Usage of int container");
        GenericContainer<Integer> intContainer = new GenericContainer<Integer>();
        System.out.println(String.format("Empty container:\nSize: %d\n%s", intContainer.size(), intContainer));

        for (int i = 0; i < 10; i++)
            intContainer.add(i);
        System.out.println(String.format("Add 10 elements:\nSize: %d\n%s", intContainer.size(), intContainer));

        intContainer.add(10, 2);
        System.out.println(String.format("Add by index 2:\nSize: %d\n%s", intContainer.size(), intContainer));

        boolean removingResult = intContainer.remove(1);
        if (removingResult)
            System.out.println("Removed successful");
        System.out.println(String.format("Remove by index 1:\nSize: %d\n%s", intContainer.size(), intContainer));
        removingResult = intContainer.remove(15);
        if (!removingResult)
            System.out.println("Incorrect index");
        removingResult = intContainer.remove(-1);
        if (!removingResult)
            System.out.println("Incorrect index");

        System.out.println("Get all elements by their indexes");
        for (int i = 0; i < intContainer.size(); i++)
            System.out.print(intContainer.get(i) + " ");
        System.out.println();

        Integer getResult = intContainer.get(20);
        if (getResult == null)
            System.out.println("Incorrect index");
        getResult = intContainer.get(-1);
        if (getResult == null)
            System.out.println("Incorrect index");

        intContainer.clear();
        System.out.println(String.format("Cleared container:\nSize: %d\n%s", intContainer.size(), intContainer));
    }

    public static void stringDemonstration() {
        System.out.println("Usage of String container");
        GenericContainer<String> stringContainer = new GenericContainer<String>();
        System.out.println(String.format("Empty container:\nSize: %d\n%s", stringContainer.size(), stringContainer));

        String[] buf = {"one", "two", "three", "four", "five", "six", "seven"};
        for (int i = 0; i < buf.length; i++)
            stringContainer.add(buf[i]);
        System.out.println(String.format("Add 7 elements:\nSize: %d\n%s", stringContainer.size(), stringContainer));

        stringContainer.add("ADDED", 3);
        System.out.println(String.format("Add by index 3:\nSize: %d\n%s", stringContainer.size(), stringContainer));

        stringContainer.remove(0);
        System.out.println(String.format("Remove by index 0:\nSize: %d\n%s", stringContainer.size(), stringContainer));

        System.out.println("Get all elements by their indexes");
        for (int i = 0; i < stringContainer.size(); i++)
            System.out.print(stringContainer.get(i) + " ");
        System.out.println();

        stringContainer.clear();
        System.out.println(String.format("Cleared container:\nSize: %d\n%s", stringContainer.size(), stringContainer));
    }
}
