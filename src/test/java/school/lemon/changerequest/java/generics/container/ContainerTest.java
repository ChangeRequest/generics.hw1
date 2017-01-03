package school.lemon.changerequest.java.generics.container;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by User on 03.01.2017.
 */
public class ContainerTest {
    Container container = new Container();

    @Test
    public void testSizeWhenNothingAdded() {
        int expected = 0;
        int result = container.size(container);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSizeWhenSomethingAdded() {
        container.add(1);
        container.add(1);
        int expected = 2;
        int result = container.size(container);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testSizeWhenContainerIsnotCreated() {
        Container containerNotCreated = null;
        containerNotCreated.size(containerNotCreated);

    }

    @Test
    public void testClearShouldNotThrowExeption() {
        container.clear(container);
    }

    @Test(expected = NullPointerException.class)
    public void testClearShouldThrowExeption() {
        container = null;
        container.clear(container);
    }

    @Test
    public void testAddShouldAddNumberGiven() {
        container.add(1);
        int expected = 1;
        int result = (int) container.get(0);
        Assert.assertEquals(expected, result);


    }

    @Test
    public void testAddShouldAddStringGiven() {
        container.add("WHAY?");
        String expected = "WHAY?";
        String result = (String) container.get(0);
        Assert.assertEquals(expected, result);

    }

    @Test
    public void testGetShouldGetNumberGiven() {
        container.add(1);
        int expected = 1;
        int result = (int) container.get(0);
        Assert.assertEquals(expected, result);


    }

    @Test
    public void testGetShouldGetStringGiven() {
        container.add("WHAY?");
        String expected = "WHAY?";
        String result = (String) container.get(0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void removeTestShouldRemoveObjectByIndex() {
        container.add("WHAY?");
        container.remove(0);
        int expected = 0;
        int result = container.size(container);
        Assert.assertEquals(expected, result);
    }
}
