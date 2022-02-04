package firsttest;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class SecondTest {
    @Before
    public void openSearch() {
        Selenide.open("https://google.com/ncr");
    }
    @Test
    public void shouldSearch() {
        $(byName("q")).setValue("maven selenium java").pressEnter();
        $(byCssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
        System.out.println("Page was opened !");
    }
}
