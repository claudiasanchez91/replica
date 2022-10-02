package pages;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

    static {//BLOQUE ESTATICO
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webDriver/chromedriver.exe");//DONDE SE ENCUENTRA EL WEBDRIVER
        ChromeOptions chromeOptios = new ChromeOptions();
        driver = new ChromeDriver(chromeOptios);
        wait = new WebDriverWait(driver, 10);
    }
    public BasePage (WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);//VA ESPERAR 10 SEGUNDOS
    }
    //FUNCION
    public static void navigateTo(String url){
        driver.get(url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    private WebElement find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){//DADO XPATH VA Y SI LOCALIZA DARA CLICK
        find(locator).click();
    }
    public void write(String locator, String txt){
        find(locator).clear();
        find(locator).sendKeys(txt);
    }
    public void selectFromDropsownByValue(String locator, String valueToSelect){
        Select dropdown = new Select(find(locator));
        dropdown.selectByValue(valueToSelect);
    }
    public void selectFromDropsownByIndex(String locator, Integer index){
        Select dropdown = new Select(find(locator));
        dropdown.selectByIndex(index);
    }
    public void selectFromDropsownByText(String locator, String text){
        Select dropdown = new Select(find(locator));
        dropdown.selectByVisibleText(text);
    }
     //PASAR EL MOUSE POR ENCIMA
    public void hoverOverElement(String locator){
        action.moveToElement(find(locator));
    }
    public void doubleClick(String locator){
        action.doubleClick(find(locator));
    }
    public void rightClick(String locator){
        action.contextClick(find(locator));
    }
    public void goToLinkText(String linkText){ //VA A BUSCAR Y HACER CLCIK EN UN LINK
        driver.findElement(By.linkText(linkText)).click();
    }
    public WebElement Find(String locator){
        return driver.findElement(By.xpath(locator));
    }
    public void submitElement(String locator){
        Find(locator).submit();
    }
    public String textFromElement(String locator){
        return Find(locator).getText();
    }
    public List<WebElement> bringMeAllElements(String locator){
      return driver.findElements(By.className(locator));
    }
    public void selectTheElement(String locator, int index){
        List<WebElement> results = driver.findElements(By.xpath(locator));
        results.get(index).click();
    }
    public void getScreenshot(String locator, String nameOfFile)throws IOException{
        File file = Find(locator).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File(nameOfFile+".png"));
    }
    public void selectFromDropsownByIndex(String locator,int valueToSelect){
     Select dropdown = new Select(Find(locator));
     dropdown.selectByIndex(valueToSelect);
    }
}
