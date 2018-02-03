package school.lemon.changerequest.java.generics.container;

public class GenericContainerDemo {
    public static void main(String[] args) {
        intDemonstration();
        stringDemonstration();
    }

    public static void intDemonstration() {
        System.out.println("Usage of int container");
        GenericContainer<Integer> intContainer = new GenericContainer<Integer>();
        System.out.println("Empty container:\n" + "Size: " + intContainer.size() + "\n" + intContainer);

        for (int i = 0; i < 10; i++)
            intContainer.add(i);
        System.out.println("Add 10 elements:\n" + "Size: " + intContainer.size() + "\n" + intContainer);

        intContainer.add(10, 2);
        System.out.println("Add by index 2:\n" + "Size: " + intContainer.size() + "\n" + intContainer);

        boolean removingResult = intContainer.remove(1);
        if (removingResult)
            System.out.println("Removed successful");
        System.out.println("Remove by index 1:\n" + "Size: " + intContainer.size() + "\n" + intContainer);
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
        System.out.println("Cleared container:\n" + "Size: " + intContainer.size() + "\n" + intContainer);
    }

    public static void stringDemonstration() {
        System.out.println("Usage of String container");
        GenericContainer<String> stringContainer = new GenericContainer<String>();
        System.out.println("Empty container:\n" + "Size: " + stringContainer.size() + "\n" + stringContainer);

        String[] buf = {"one", "two", "three", "four", "five", "six", "seven"};
        for (int i = 0; i < buf.length; i++)
            stringContainer.add(buf[i]);
        System.out.println("Add 7 elements:\n" + "Size: " + stringContainer.size() + "\n" + stringContainer);

        stringContainer.add("ADDED", 3);
        System.out.println("Add by index 3:\n" + "Size: " + stringContainer.size() + "\n" + stringContainer);

        stringContainer.remove(0);
        System.out.println("Remove by index 0:\n" + "Size: " + stringContainer.size() + "\n" + stringContainer);

        System.out.println("Get all elements by their indexes");
        for (int i = 0; i < stringContainer.size(); i++)
            System.out.print(stringContainer.get(i) + " ");
        System.out.println();

        stringContainer.clear();
        System.out.println("Cleared container:\n" + "Size: " + stringContainer.size() + "\n" + stringContainer);
    }
}
