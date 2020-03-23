import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.junit.Assert;
import org.junit.Test;
import sun.lwawt.macosx.CSystemTray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchTest {

    //:, @, ^, *, %

    //Find a single word, then a colon, then a word
    @Test
    public void regTest1() {
        String str = "naMe:Milk";
        //Pattern p = Pattern.compile("\\w[:]\\w");
        //Pattern p = Pattern.compile("[....][:][....]");
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then a colon, then another separator, then another word
    @Test
    public void regTest2() {
        String str = "naMe:;price";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then an @, then another word
    @Test
    public void regTest3() {
        String str = "Food@expiration";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then an ^, then another word
    @Test
    public void regTest4() {
        String str = "Food^expiration";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then an *, then another word
    @Test
    public void regTest5() {
        String str = "Food*expiration";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then a %, then another word
    @Test
    public void regTest6() {
        String str = "Food%expiration";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find two pound signs to know that you've reached the end of a key-value pair
    @Test
    public void regTest7() {
        String str = "2016##";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

    //Find a word, then a separator, but no value
    @Test
    public void regTest8() {
        String str = "type:;";
        Pattern p = Pattern.compile("");
        Matcher m = p.matcher(str);

        System.out.println(m.matches());
    }

}
