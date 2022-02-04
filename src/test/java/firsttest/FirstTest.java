package firsttest;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class FirstTest {
    @Before
    public void openSearch() {
        Selenide.open("https://google.com/ncr");
    }
    @Test
    public void shouldSearch() {
        element(byName("q")).setValue("maven selenium java").pressEnter();
        element(byCssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        System.out.println("Page was opened !");
    }
    // @After
    // public void closeSearch() {
    //
   // }
}