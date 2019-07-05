package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.*;
import utility.*;

public class HomePageTest {

	// Log out
	public static void logOut(WebDriver driver) {
		Page.clickLogOut(driver);
	}

	// Delete Post
	public static void deletePost(WebDriver driver, int i) {
		HomePage.clickMore(driver, i);
		HomePage.clickDelete(driver, i);
	}

	// Delete more post
	public static void deletePosts(WebDriver driver, int p) {
		for (int i = 0, j = 0; j < p; j++) {
			deletePost(driver, i);
		}
	}

	// Edit Post using scanner
	public static void editPost(WebDriver driver, int i) {
		Scanner sc = new Scanner(System.in);

		// More options
		HomePage.clickMore(driver, i);

		// Edit
		HomePage.clickEdit(driver, i);

		// Name
		System.out.println("Name: ");
		String naziv = sc.nextLine();
		HomePage.clickEditName(driver);
		HomePage.sendKeysEditName(driver, naziv);

		// Location
		System.out.println("Location: ");
		String lokacija = sc.nextLine();
		HomePage.clickEditLocation(driver);
		HomePage.sendKeysEditLokacija(driver, lokacija);

		// Description
		System.out.println("Description: ");
		String opis = sc.nextLine();
		HomePage.clickEditOpis(driver);
		HomePage.sendKeysEditOpis(driver, opis);

		// Edit Post
		HomePage.clickEditPostButton(driver);
		sc.close();
	}

	// Edit Post using one row in Excel
	public static void editPostExcel(WebDriver driver, int p, int i) throws Exception {
		String data;

		// Excel file
		utility.ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET2);

		// More options
		HomePage.clickMore(driver, i);

		// Edit
		HomePage.clickEdit(driver, i);

		// Name
		data = ExcelUtils.getCellData(i, 1);
		HomePage.clickEditName(driver);
		HomePage.sendKeysEditName(driver, data);

		// Location
		data = ExcelUtils.getCellData(i, 2);
		HomePage.clickEditLocation(driver);
		HomePage.sendKeysEditLokacija(driver, data);

		// Description
		data = ExcelUtils.getCellData(i, 0);
		HomePage.clickEditOpis(driver);
		HomePage.sendKeysEditOpis(driver, data);

		// Edit post
		HomePage.clickEditPostButton(driver);
	}

}