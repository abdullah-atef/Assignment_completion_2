package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;
    HomePage homePage;
    DroppablePage droppablePage;

    By lnkDroppable = By.xpath("//*[@id='sidebar']/aside[1]/ul/li[2]/a");
    By lnkSelectable = By.linkText("Selectable");
    By lnkControlGroup = By.linkText("Controlgroup");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnDroppableLink() {
        driver.findElement(lnkDroppable).click();
    }



    public void clickOnSelectableLink() {
        driver.findElement(lnkSelectable).click();
    }

    public void clickOnControlGroup() {
        driver.findElement(lnkControlGroup).click();
    }


}
