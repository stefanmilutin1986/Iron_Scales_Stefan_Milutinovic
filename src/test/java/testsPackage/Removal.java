package testsPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Removal {

    public static String remove(String string){
        return string.strip();
    }
    @Test
    public void testRemovingEmptySpacesAtStartOfString() {
        String x = remove("          aaaaaaaaaa");
        System.out.println(x);
        Assert.assertTrue(x.startsWith("a"));
    }

    @Test
    public void testRemovingEmptySpacesAtEndOfString() {
        String x = remove("aaaaaaaaaa            ");
        System.out.println(x);
        Assert.assertTrue(x.endsWith("a"));
    }

    @Test
    public void falseTestRemovingEmptySpacesAtStartOfString() {
        String x = remove("          aaaaaaaaaa");
        System.out.println(x);
        Assert.assertFalse(x.contains(" "));
    }

    @Test
    public void falseTestRemovingEmptySpacesAtEndOfString() {
        String x = remove("aaaaaaaaaa        ");
        System.out.println(x);
        Assert.assertFalse(x.contains(" "));
    }
}
