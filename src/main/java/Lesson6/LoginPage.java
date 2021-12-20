package Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    //определение локатора поля ввода логина
    @FindBy(id = "user")
    private WebElement loginField;

    //определение локатора поля ввода пароля
    @FindBy(id = "lj_loginwidget_password")
    private WebElement passwordField;

    //определение локатора кнопки входа в аккаунт
    @FindBy(name = "action:login")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public LoginPage inputLogin(String login) {
        this.loginField.sendKeys(login);
       return this;
    }
    //  метод для ввода пароля
    public LoginPage inputPassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
        return this;
    }
    //  метод для осуществления нажатия кнопки входа в аккаунт
    public LoginPage clickSubmit() {
        submit.click();
        return this;
    }

}



