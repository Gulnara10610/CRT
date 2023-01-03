package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byText;
import static org.assertj.core.api.Assertions.assertThat;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class MainPage {
    private final static String TITLE_TEXT = "Группа ЦРТ",
    SUB_TITLE_TEXT = "Распознавание голоса, синтез речи, запись и анализ, идентификация лица и голоса.",
    stateStructure = "Государственные структуры",
    invalidNumber = "qwertyuyuihg",
    phoneFom = "Наш сотрудник перезвонит Вам. Это быстро и бесплатно!";


    private SelenideElement
    title = $("h1.theme-h1"),
    subTitle = $("p.mp-main_p");

    public MainPage openMainPage(){
        open("https://www.speechpro.ru/");
        title.shouldHave(text(TITLE_TEXT));
        subTitle.shouldHave(text(SUB_TITLE_TEXT));
        return this;
    }
    public MainPage clickDecisions(){
        $("a.top-menu_link",1).click();
        return this;
    }
    public MainPage clickStateStructures(){
        $(".top-submenu_link").shouldHave(text(stateStructure)).click();
        return this;
    }

    public MainPage clickContact(){
        $("a[href='/contacts']").click();
        return this;
    }
    public String getConsoleLogs() { // todo refactor
        return String.join("\n", Selenide.getWebDriverLogs(BROWSER));
    }
    public MainPage consoleShouldNotHaveErrors(){
        String consoleLogs = getConsoleLogs();
        String errorText = "SEVERE";

        assertThat(consoleLogs).doesNotContain(errorText);
        return this;
    }
    public MainPage clickPhoneForm(){
        $(".call-me_button.fancybox").click();
        return this;
    }
    public MainPage fillPhoneForm(){
        $(".popup_text",3).shouldHave(text(phoneFom));
        $(".popup_input.required.inputphone7").setValue(invalidNumber);
        $(byText("Жду звонка!")).click();
        return this;
    }




}
