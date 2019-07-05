package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {

	public static final String LOGOUT = "//a[@id='logoutBtn']";
	public static final String INPUT_POST = "//a[contains(text(),'Make a post')]";
	public static final String NAME = "//input[@placeholder='Naziv']";
	public static final String LOCATION = "//input[@placeholder='Lokacija']";
	public static final String TRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	public static final String DESCRIPTION = "//textarea[@placeholder='Opis']";
	public static final String POST = "//div[@class='popupPost']//input[@name='postSubmit']";

	// LogOut
	public static WebElement getLogOut(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

	// NewPost
	public static WebElement getMakePost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(INPUT_POST));
		return wb;
	}

	public static void clickMakePost(WebDriver driver) {
		getMakePost(driver).click();
	}

	// Name
	public static WebElement getName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(NAME));
		return wb;
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	public static void sendKeysName(WebDriver driver, String str) {
		getName(driver).sendKeys(str);
	}

	// Location
	public static WebElement getLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOCATION));
		return wb;
	}

	public static void clickLocation(WebDriver driver) {
		getLocation(driver).click();
	}

	public static void sendKeysLocation(WebDriver driver, String str) {
		getLocation(driver).sendKeys(str);
	}

	// Transport
	public static void ChooseTransport(WebDriver driver) {
		driver.findElement(By.xpath(TRANSPORT)).click();
	}

	// Description
	public static WebElement getDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(DESCRIPTION));
		return wb;
	}

	public static void clickDescription(WebDriver driver) {
		getDescription(driver).click();
	}

	public static void sendKeysDescription(WebDriver driver, String str) {
		getDescription(driver).sendKeys(str);
	}

	// Input Post
	public static WebElement getPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST));
		return wb;
	}

	public static void clickPost(WebDriver driver) {
		getPost(driver).click();
	}
}