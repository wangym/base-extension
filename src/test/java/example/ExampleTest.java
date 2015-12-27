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
        parent.setPropertyA("a");

        ChildBean child = new ChildBean();
        child.setPropertyB("b");
        child.setPropertyC("c");

        GrandsonBean grandson = new GrandsonBean();
        grandson.setPropertyD("d");
        grandson.setPropertyE("e");
        grandson.setPropertyF("f");

        FamilyService familyService = new FamilyService();
        familyService.printlnParent(parent);
        Assert.assertTrue(true);
    }
}
