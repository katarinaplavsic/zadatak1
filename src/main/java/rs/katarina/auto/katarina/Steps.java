package rs.katarina.auto.katarina;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class Steps {
    @Given("Navigate to URL {string}")
    public void navigateToURL(String urlPath) {
            WebDriverManager.seleniumServerStandalone().setup();
            Global.driver = new SafariDriver();
            Global.driver.manage().window().maximize();
            Global.driver.navigate().to(urlPath);
    }

    @Then("Wait")
    public void wait1() throws InterruptedException {
        Thread.sleep(3000);
    }

    @Then("Scroll down to the element by text {string}")
    public void scrollDownToTheElementByText(String text) throws InterruptedException {
        WebElement element = Global.driver.findElement(By.xpath("//*[text()='"+text+"']"));
        ((JavascriptExecutor) Global.driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(5000);
    }

    @Then("Click on the X button to dismiss the popup")
    public void clickOnEmptySpace() {
        WebElement element = Global.driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']"));
        element.click();
    }

    @Then("Assert 6 pictures in the Explore Serbia field by class")
    public void assertPicturesByClass() {
        //WebElement element = Global.driver.findElement(By.xpath("//*[@id=\":rb:\"][1]"));
        //WebElement element = Global.driver.findElement(By.xpath("//*[@id=\":r9:\"]"));
        //WebElement element = Global.driver.findElement(By.xpath("//*[@id=\":r7:\"]"));
        WebElement element = Global.driver.findElement(By.cssSelector("[class='d4f3be4ddb cbe6ba4fde cb7e63f7dd']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Click on element right")
    public void clickOnElementRight() throws InterruptedException {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@aria-label='Next'])[3]"));
        element.click();
        Thread.sleep(3000);
    }

    @Then("Click on element left")
    public void clickOnElementLeft() {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@aria-label='Previous'])[3]"));
        element.click();
    }

    @Then("Assert colour of element {string} is {string}")
    public void assertColourOfElemntIs(String text, String color) {
        WebElement element = Global.driver.findElement(By.xpath("//*[text()='"+text+"']"));
        String value = element.getCssValue("color").toString();
        Assert.assertTrue(value.equals(color));
    }

    @Then("Type in {string} into search field by placeholder {string}")
    public void typeInIntoSearchField(String value, String placeholder) {
        WebElement element = Global.driver.findElement(By.xpath("//*[@placeholder='"+placeholder+"']"));
        element.sendKeys(value);
    }

    @Then("Click on calendar button by class {string}")
    public void clickOnButtonByClass (String className) {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@class='"+className+"'])[1]"));
        element.click();
    }

    @Then("Click on start date")
    public void clickOnStartDate() {
        WebElement element = Global.driver.findElement(By.xpath("//*[@aria-label='29 July 2023']"));
        element.click();
    }

    @Then("Click on end date")
    public void clickOnEndDate() {
        WebElement element = Global.driver.findElement(By.xpath("//*[@aria-label='30 August 2023']"));
        element.click();
    }

    @Then("Click on Search button")
    public void clickOnSearchButton() {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[4]"));
        element.click();
    }

    @Then("Assert search results by class")
    public void assertSearchResults() {
        WebElement element = Global.driver.findElement(By.cssSelector("[class='fcab3ed991 d5f78961c3']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Browser quit")
    public void browserQuit() {
        Global.driver.quit();
    }

    @Then("Click on the most popular choices for travellers from Serbia")
    public void clickOnSelectYourDatesField() {
        WebElement element = Global.driver.findElement(By.xpath(("(//*[@class=\"e1f827110f\"])")));
        element.click();
    }

    @Then("Click on occupancy option")
    public void clickOnOccupancyOption() {
        WebElement element = Global.driver.findElement(By.xpath("//*[@data-testid=\"occupancy-config\"]"));
        element.click();
    }

    @Then("Click on plus sign")
    public void clickOnPlusSign() {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@type=\"button\"])[12]"));
        element.click();

    }

    @Then("Click on button Done")
    public void clickOnButtonDone() {
        WebElement element = Global.driver.findElement(By.xpath("(//*[@type=\"button\"])[13]"));
        element.click();
    }

}
