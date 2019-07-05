package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class Registration {
	public static final String URL = "http://localhost/izlet/";
	private static final String LOGIN_USERNAME = "//input[@placeholder='username']";
	private static final String LOGIN_PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@name='login']";
	private static final String FIRST_NAME = "//input[@name='firstname']";
	private static final String LAST_NAME = "//input[@name='lastname']";
	private static final String USERNAME = "//div[@class='register_form']//input[@name='username']";
	private static final String EMAIL_ADRESS = "//input[@name='email']";
	private static final String PASSWORD = "//div[@class='register_form']//input[@name='password']";
	private static final String REGISTRATION = "//input[@id='blue_btn']";

	// LogIn UserName
	public static WebElement getLoginUserName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_USERNAME));
		return wb;
	}

	public static void clickLoginUserName(WebDriver driver) {
		getLoginUserName(driver).click();
	}

	public static void sendKeysLoginUserName(WebDriver driver, String str) {
		getLoginUserName(driver).sendKeys(str);
	}

	// LogIn Password
	public static WebElement getLoginPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_PASSWORD));
		return wb;
	}

	public static void clickLoginPassword(WebDriver driver) {
		getLoginPassword(driver).click();
	}

	public static void sendKeysLoginPassword(WebDriver driver, String str) {
		getLoginPassword(driver).sendKeys(str);
	}

	// LogIn
	public static WebElement getLogInButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN));
		return wb;
	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	// First Name
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(FIRST_NAME));
		return wb;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	// Last Name
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LAST_NAME));
		return wb;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	// UserName
	public static WebElement getUserName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(USERNAME));
		return wb;
	}

	public static void clickUserName(WebDriver driver) {
		getUserName(driver).click();
	}

	public static void sendKeysUserName(WebDriver driver, String str) {
		getUserName(driver).sendKeys(str);
	}

	// E-mail address
	public static WebElement getEmail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EMAIL_ADRESS));
		return wb;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}

	// Password
	public static WebElement getPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PASSWORD));
		return wb;
	}

	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	public static void sendKeysPassword(WebDriver driver, String str) {
		getPassword(driver).sendKeys(str);
	}

	// Registration
	public static WebElement getRegistration(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REGISTRATION));
		return wb;
	}

	public static void clickRegister(WebDriver driver) {
		getRegistration(driver).click();
	}

	// Open Page
	public static void openPage(WebDriver driver) {
		driver.get(Constant.PAGE_URL);
	}

	// Navigate to Page
	public static void navigateToPage(WebDriver driver) {
		driver.navigate().to(Constant.PAGE_URL);
	}

}