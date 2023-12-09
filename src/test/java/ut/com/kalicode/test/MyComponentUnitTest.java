package ut.com.kalicode.test;

import org.junit.Test;
import com.kalicode.test.api.MyPluginComponent;
import com.kalicode.test.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}