package page.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	public static final String URL = "http://localhost/izlet/";
	private static final String MORE = "fas fa-ellipsis-v";
	private static final String EDIT = "fas fa-edit";
	private static final String DELETE = "fas fa-trash-alt";
	private static final String EDIT_NAME = "//input[@id='title']";
	private static final String EDIT_LOCATION = "//input[@id='location']";
	private static final String EDIT_DESCRIPTION = "//textarea[@id='description']";
	private static final String EDIT_POST = "//div[@class='popupEdit']//input[@name='postSubmit']";

	// More button
	public static WebElement getMore(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(MORE));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickMore(WebDriver dr, int i) {
		getMore(dr, i).click();
	}

	// Delete a post
	public static WebElement getDelete(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(DELETE));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickDelete(WebDriver dr, int i) {
		getDelete(dr, i).click();
	}

	// Edit a post
	public static WebElement getEdit(WebDriver dr, int i) {
		List<WebElement> list = dr.findElements(By.className(EDIT));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickEdit(WebDriver dr, int i) {
		getEdit(dr, i).click();
	}

	// Edit name in post
	public static WebElement getEditName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_NAME));
		return wb;
	}

	public static void clickEditName(WebDriver driver) {
		getEditName(driver).click();
	}

	public static void sendKeysEditName(WebDriver driver, String str) {
		getEditName(driver).clear();
		getEditName(driver).sendKeys(str);
	}

	// Edit location in post
	public static WebElement getEditLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_LOCATION));
		return wb;
	}

	public static void clickEditLocation(WebDriver driver) {
		getEditLocation(driver).click();
	}

	public static void sendKeysEditLokacija(WebDriver driver, String str) {
		getEditLocation(driver).clear();
		getEditLocation(driver).sendKeys(str);
	}

	// Edit description in post
	public static WebElement getEditDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_DESCRIPTION));
		return wb;
	}

	public static void clickEditOpis(WebDriver driver) {
		getEditDescription(driver).click();
	}

	public static void sendKeysEditOpis(WebDriver driver, String str) {
		getEditDescription(driver).clear();
		getEditDescription(driver).sendKeys(str);
	}

	// Post button
	public static WebElement getEditPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDIT_POST));
		return wb;
	}

	public static void clickEditPostButton(WebDriver driver) {
		getEditPostButton(driver).click();
	}

	// Open Page
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}

	// Navigate to Page
	public static void navigateTo(WebDriver driver) {
		driver.navigate().to(URL);
	}
}