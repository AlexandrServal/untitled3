package todosmvc;
import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

public class TodoMvc {
    @Test
    public void todos_search() {
        Configuration.holdBrowserOpen = true;
        Selenide.open("http://todomvc.com/examples/emberjs/");
        $("#new-todo").setValue("a").pressEnter(); // .shouldBe(visible)
        $("#new-todo").setValue("b").pressEnter();
        $("#new-todo").setValue("c").pressEnter();
        $$("#todo-list>li").shouldHave(exactTexts("a", "b", "c"));
        $$("#todo-list>li").findBy(exactText("b")).find(".toggle").click();
        $$("#todo-list>li").filterBy(cssClass("completed"))
                .shouldHave(exactTexts("b"));
        $$("#todo-list>li").filterBy(not(cssClass("completed")))
                .shouldHave(exactTexts("a", "c"));
    }
}
