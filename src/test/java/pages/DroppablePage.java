package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PropertyManager;

public class DroppablePage {

    WebDriver driver;
    WebDriverWait wait;

    By draggableElement = By.id("draggable");
    By dropTargetElement = By.id("droppable");
    By isDropped = By.xpath("//*[@id='droppable']");

    public DroppablePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    public void dragAndDropElement() {

        new PropertyManager().switchToFrameByClassName(driver, "demo-frame");
        new Actions(driver).dragAndDrop(wait.until(ExpectedConditions.visibilityOfElementLocated(draggableElement)),
                wait.until(ExpectedConditions.visibilityOfElementLocated(dropTargetElement))).build().perform();

    }



    public boolean isDropped() {
        boolean bflg = false;

        try {
            if (driver.findElement(isDropped).getText().equals("Dropped!"))
                bflg = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bflg);

        return bflg;
    }
}
