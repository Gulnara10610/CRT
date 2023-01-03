package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
public class Result {
    String stateStructure = "Государственные структуры",
            contact = "Контакты",
            subTitleH2 = "Группа компаний ЦРТ",
            subTitleH3 = "Санкт-Петербург";

    private SelenideElement
    subTitle = $("p.mp-main_p");

    public Result checkResult(){
       subTitle.shouldHave(text(stateStructure));
        return this;
    }
    public Result checkResultContact(){
        $(".contact_h1").shouldHave(text(contact));
        $(".contact_h2").shouldHave(text(subTitleH2));
        $(".contact_h3").shouldHave(text(subTitleH3));
        return this;
    }
    public Result checkPageContact(String key, String value){
        $("ul.contact-data_list").$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }
    public Result invalidFillForm(){
        $(".fancybox-skin").shouldNotBe(visible);
        return this;
    }


}
