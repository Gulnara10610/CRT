package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.Result;
import pages.TestBase;


public class CheckMainPage extends TestBase {
    MainPage mainPage = new MainPage();
    Result result = new Result();

    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://www.speechpro.ru/";
        Configuration.browserSize = "1920x1080";
    }
    @DisplayName("Проверка перехода на страницу 'Государственные структуры'")
    @Test
    void goToStateStructuresPage(){
        mainPage.openMainPage()
                .clickDecisions()
                .clickStateStructures();
        result.checkResult();
    }
    @DisplayName("Проверка перехода на Страницу 'Контакты'")
    @Test
    void goToContacts(){
        mainPage.openMainPage()
                .clickContact();
        result.checkResultContact()
                .checkPageContact("Телефон:","+7 (812) 325-88-48")
                .checkPageContact("E-mail:","stc-spb@speechpro.com")
                .checkPageContact("Факс:","+7 (812) 327-92-97")
                .checkPageContact("Отдел продаж:","+7 (812) 325-88-48 доб.1")
                .checkPageContact("Отдел техподдержки:","+7 (812) 325-88-48 доб.2");
    }

    @Test
    @DisplayName("Проверка формы обратной связи(телефон, ввод букв), негативный")
    void checkPhoneForm(){
        mainPage.openMainPage()
                .clickPhoneForm()
                .fillPhoneForm();
        result.invalidFillForm();
    }
    @Test
    @DisplayName("Проверка ошибок в консоли")
    void consoleShouldNotHaveErrorsTest(){
        mainPage.openMainPage()
                .consoleShouldNotHaveErrors();
    }


}
