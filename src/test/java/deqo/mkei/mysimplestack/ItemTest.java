package deqo.mkei.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.sameInstance;
/**
 * Created by KTM1047A on 24/10/2017.
 */
public class ItemTest {

    private Item item;
    private Object obj1,obj2;

    @Before
    public void setUp()
    {
        obj1 = new String("This is a test string");
        obj2 = new Integer(2017);
    }

    @Test

public void testGetSet()
    {

        item = new Item(obj1);
        assertThat(item.getObject(),sameInstance(obj1));
        item.setObject(obj2);
        assertThat(item.getObject(),sameInstance(obj2));
    }
}