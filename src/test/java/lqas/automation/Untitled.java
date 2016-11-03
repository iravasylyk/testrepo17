package lqas.automation;

import java.util.regex.Pattern;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import com.google.common.base.Function;

import static org.testng.Assert.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Untitled {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
   
    baseUrl = "https://www.google.com.ua/";
    
  }

  @Test
  public void testUntitled1() throws Exception {
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl + "/");
	Set<Cookie> cookes = driver.manage().getCookies();
	
    WebElement serchfield = driver.findElement(By.id("lst-ib"));
    
    serchfield.clear();
    serchfield.sendKeys("погода львів");

    driver.findElement(By.id("lst-ib"));
    driver.findElement(By.name("btnG")).click();
    //driver.findElement(By.linkText("SINOPTIK: Погода во Львове. Прогноз погоды Львов на неделю ...")).click();
    //h1 - імя тегу шукалось ше на попередній сторінці тому вейт не чекав, бо елемент вже існував,
    // унікальний локатор є вирішенням
    
    cookes = driver.manage().getCookies();
    explicitWait(driver,By.cssSelector(".cityName h1"));
    assertEquals(driver.findElement(By.tagName("h1")).getText(), "Погода во Львове");
    driver.quit();
  }
  
  @Test
  public void testUntitled2() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/");
    WebElement serchfield = driver.findElement(By.id("lst-ib"));

    serchfield.clear();
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 // Now you can do whatever you need to do with it, for example copy somewhere
    FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));;
 
    serchfield.sendKeys("погода львів");

    driver.findElement(By.id("lst-ib"));
    driver.findElement(By.name("btnG")).click();
    driver.findElement(By.linkText("SINOPTIK: Погода во Львове. Прогноз погоды Львов на неделю ...")).click();
    //h1 - імя тегу шукалось ше на попередній сторінці тому вейт не чекав, бо елемент вже існував,
    // унікальний локатор є вирішенням
    explicitWait(driver,By.cssSelector(".cityName h1"));
    assertEquals(driver.findElement(By.tagName("h1")).getText(), "Погода во Львове");
    driver.quit();
  }
  
  @Test
  public void testUntitled3() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/");
    WebElement serchfield = driver.findElement(By.id("lst-ib"));

    serchfield.clear();
    serchfield.sendKeys("погода львів");

    driver.findElement(By.id("lst-ib"));
    driver.findElement(By.name("btnG")).click();
    driver.findElement(By.linkText("SINOPTIK: Погода во Львове. Прогноз погоды Львов на неделю ...")).click();
    //h1 - імя тегу шукалось ше на попередній сторінці тому вейт не чекав, бо елемент вже існував,
    // унікальний локатор є вирішенням
    explicitWait(driver,By.cssSelector(".cityName h1"));
    assertEquals(driver.findElement(By.tagName("h1")).getText(), "Погода во Львове");
    driver.quit();
  }
  
  @Test
  public void testUntitled4() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/");
    WebElement serchfield = driver.findElement(By.id("lst-ib"));

    serchfield.clear();
    serchfield.sendKeys("погода львів");

    driver.findElement(By.id("lst-ib"));
    driver.findElement(By.name("btnG")).click();
    driver.findElement(By.linkText("SINOPTIK: Погода во Львове. Прогноз погоды Львов на неделю ...")).click();
    //h1 - імя тегу шукалось ше на попередній сторінці тому вейт не чекав, бо елемент вже існував,
    // унікальний локатор є вирішенням
    explicitWait(driver,By.cssSelector(".cityName h1"));
    assertEquals(driver.findElement(By.tagName("h1")).getText(), "Погода во Львове");
    driver.quit();
  }
  
  @Test
  public void testUntitled5() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/");
    WebElement serchfield = driver.findElement(By.id("lst-ib"));

    serchfield.clear();
    serchfield.sendKeys("погода львів");

    driver.findElement(By.id("lst-ib"));
    driver.findElement(By.name("btnG")).click();
    driver.findElement(By.linkText("SINOPTIK: Погода во Львове. Прогноз погоды Львов на неделю ...")).click();
    //h1 - імя тегу шукалось ше на попередній сторінці тому вейт не чекав, бо елемент вже існував,
    // унікальний локатор є вирішенням
    explicitWait(driver,By.cssSelector(".cityName h1"));
    assertEquals(driver.findElement(By.tagName("h1")).getText(), "Погода во Львове");
    driver.quit();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
	  driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public static WebElement explicitWait(WebDriver driver,final By locator)  
  {  
             
     WebDriverWait wait = new WebDriverWait(driver, 30);  
     return wait.until(ExpectedConditions.presenceOfElementLocated(locator));          
    
  }
  
  public static WebElement explicitFluentWait(WebDriver driver,By by)  
  {  
      Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)  
               .withTimeout(20, TimeUnit.SECONDS)  
               .pollingEvery(2, TimeUnit.SECONDS)  
               .ignoring(NoSuchElementException.class); 
   
       WebElement element= wait.until(new Function<WebDriver, WebElement>() {  
             public WebElement apply(WebDriver driver) {  
               return driver.findElement(By.id("foo"));  
              }  
        });  
    return element;
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
