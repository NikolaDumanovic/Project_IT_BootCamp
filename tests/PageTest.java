package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.*;

import utility.Constant;
import utility.ExcelUtils;

public class PageTest {

	// Input through scanner
	public static void makePost(WebDriver wb) {
		Scanner sc = new Scanner(System.in);

		// Post
		Page.clickMakePost(wb);

		// Post Name
		System.out.println("Name: ");
		String naziv = sc.nextLine();
		Page.clickName(wb);
		Page.sendKeysName(wb, naziv);

		// Location
		System.out.println("Location: ");
		String lokacija = sc.nextLine();
		Page.clickLocation(wb);
		Page.sendKeysLocation(wb, lokacija);

		// Description
		System.out.println("Description: ");
		String opis = sc.nextLine();
		Page.clickDescription(wb);
		Page.sendKeysDescription(wb, opis);

		// Post
		Page.clickPost(wb);
		sc.close();
	}

	// Post using one row in Excel
	public static void makePostExcel(WebDriver driver, int i) throws Exception {
		String data;

		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET2);
		Page.clickMakePost(driver);

		data = ExcelUtils.getCellData(i, 1);

		Page.clickName(driver);
		Page.sendKeysName(driver, data);

		data = ExcelUtils.getCellData(i, 2);

		Page.clickLocation(driver);
		Page.sendKeysLocation(driver, data);

		data = ExcelUtils.getCellData(i, 0);

		Page.clickDescription(driver);
		Page.sendKeysDescription(driver, data);

		Page.clickPost(driver);
	}

	// Post more posts using Excel file
	public static void makePosts(WebDriver driver) throws Exception {

		// Setting Excel File
		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET2);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			makePostExcel(driver, i);
		}
	}
}