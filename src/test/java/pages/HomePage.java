package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void navigateTo_site(String Url){
        driver.get(Url);
    }

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]")
    private WebElement Sign_In_Url;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement email_txt;

    @FindBy(how = How.XPATH, using = "//input[@id='passwd']")
    private WebElement password_txt;

    @FindBy(how = How.XPATH, using = "//button[contains(@id,'Login')]")
    private WebElement sign_in_btn;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'user_info')]//*[contains(@href,'controller=my-account')]//span")
    private WebElement FullName;


    public void click_sign_in(){
        Sign_In_Url.click();
    }

    public void insert_email(String email_val){
        email_txt.sendKeys(email_val);
    }

    public void insert_password(String password_val){
        password_txt.sendKeys(password_val);
    }

    public void click_sign_in_button(){
        sign_in_btn.click();
    }

    public String getFullName(){
        return FullName.getText();
    }

}
