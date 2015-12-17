package example;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author chinawym@gmail.com
 * @since 2015-12-17
 */
public final class ExampleTest {
    @Test
    public void run() throws Exception {
        ParentBean parent = new ParentBean();
        parent.setPropertyA("a value");

        ChildBean child = new ChildBean();
        child.setPropertyB("b value");
        child.setPropertyC("c value");

        GrandsonBean grandson = new GrandsonBean();
        grandson.setPropertyD("d value");
        grandson.setPropertyE("e value");
        grandson.setPropertyF("f value");

        Assert.assertTrue(true);
    }
}
