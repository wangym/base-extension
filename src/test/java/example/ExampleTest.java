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
        ChildBean child = new ChildBean();
        child.setParent("child's parent");
        child.setChild("i'm child");
        GrandsonBean grandson = new GrandsonBean();
        grandson.setParent("grandson's grandparent");
        grandson.setChild("grandson's parent");
        grandson.setGrandson("i'm grandson");

        FamilyService familyService = new FamilyService();
        familyService.println(child);

        Assert.assertTrue(true);
    }
}
