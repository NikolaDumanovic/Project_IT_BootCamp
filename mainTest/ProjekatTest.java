package mainTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.*;
import page.tests.*;

public class ProjekatTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\asus-zenbook-ux301l\\Desktop\\FinalProject\\Projekat 2019\\libs\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.manage().window().maximize();

		try {
			Registration.openPage(wb);
			RegistrationTest.RegistrationFirstName(wb);
			RegistrationTest.RegistrationLastName(wb);
			RegistrationTest.RegistrationUserName(wb);
			RegistrationTest.RegistrationEmail(wb);
			RegistrationTest.RegistrationPassword(wb);
			
			RegistrationTest.LogInUserName(wb);
			RegistrationTest.LogInPassword(wb);
			
			
			Thread.sleep(2000);
			RegistrationTest.MultiRegistration(wb);
			RegistrationTest.LogIn(wb, 13);
			PageTest.makePosts(wb);
			HomePageTest.deletePosts(wb, 2);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			wb.quit();
		}
	}
}
