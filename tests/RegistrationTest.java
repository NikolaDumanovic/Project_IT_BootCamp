package page.tests;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import page.objects.*;
import utility.*;

public class RegistrationTest {

	// Registration through scanner
	public static void RegistrationFirstName(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String str = sc.nextLine();
		Registration.clickFirstName(wb);
		Registration.sendKeysFirstName(wb, str);

	}

	public static void RegistrationLastName(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Surname: ");
		String str = sc.nextLine();
		Registration.clickLastName(wb);
		Registration.sendKeysLastName(wb, str);

	}

	public static void RegistrationUserName(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Name: ");
		String str = sc.nextLine();
		Registration.clickUserName(wb);
		Registration.sendKeysUserName(wb, str);

	}

	public static void RegistrationPassword(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password: ");
		String str = sc.nextLine();
		Registration.clickPassword(wb);
		Registration.sendKeysPassword(wb, str);

	}

	public static void RegistrationEmail(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email: ");
		String str = sc.nextLine();
		Registration.clickEmail(wb);
		Registration.sendKeysEmail(wb, str);
		Registration.clickRegister(wb);
	}

	// Registration using Excel file
	public static void RegistrationNewUser(WebDriver wb, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET1);

		// First name
		data = ExcelUtils.getCellData(i, 0);
		Registration.clickFirstName(wb);
		Registration.sendKeysFirstName(wb, data);

		// Last name
		data = ExcelUtils.getCellData(i, 1);
		Registration.clickLastName(wb);
		Registration.sendKeysLastName(wb, data);

		// UserName
		data = ExcelUtils.getCellData(i, 2);
		Registration.clickUserName(wb);
		Registration.sendKeysUserName(wb, data);

		// E-mail
		data = ExcelUtils.getCellData(i, 3);
		Registration.clickEmail(wb);
		Registration.sendKeysEmail(wb, data);

		// Password
		data = ExcelUtils.getCellData(i, 4);
		Registration.clickPassword(wb);
		Registration.sendKeysPassword(wb, data);

		// Register
		Registration.clickRegister(wb);

	}

	// Registration multiple users using Excel File
	public static void MultiRegistration(WebDriver wb) throws Exception {
		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			RegistrationNewUser(wb, i);

			ExcelUtils.setCellData("RegStatus", 0, 6);
			if (wb.getCurrentUrl().equals(Registration.URL)) {
				System.out.println("Registration is sucessful! ");
				ExcelUtils.setCellData("Pass", i, 6);
			} else {
				System.out.println("Registration is unsucessful!");
				ExcelUtils.setCellData("Fail", i, 6);
			}
		}
	}

	// LogIn UserName
	public static void LogInUserName(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User Name: ");
		String str = sc.nextLine();
		Registration.clickUserName(wb);
		Registration.sendKeysUserName(wb, str);

	}

	// LogIn Password
	public static void LogInPassword(WebDriver wb) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password: ");
		String str = sc.nextLine();
		Registration.clickPassword(wb);
		Registration.sendKeysPassword(wb, str);

	}

	// LogIn using Excel file
	public static void LogIn(WebDriver wb, int i) throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET1);

		data = ExcelUtils.getCellData(i, 2);

		Registration.clickLoginUserName(wb);
		Registration.sendKeysLoginUserName(wb, data);

		data = ExcelUtils.getCellData(i, 4);

		Registration.clickLoginPassword(wb);
		Registration.sendKeysLoginPassword(wb, data);
		Registration.clickLogInButton(wb);

		
	}

	// LogIn multiple users using Excel File
	public static void LogIn(WebDriver wb) throws Exception {
		ExcelUtils.setExcelFile(Constant.FILE_PATH + Constant.FILE_NAME, Constant.SHEET1);
		for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
			LogIn(wb, i);

			//ExcelUtils.setCellData("LogInStatus", 0, 7);
			//if (wb.getCurrentUrl().equals(Registration.URL)) {
			//	System.out.println("LogIn is sucessful! ");
				//ExcelUtils.setCellData("Pass", i, 7);
			//} else {
				//System.out.println("LogIn is unsucessful!");
				//ExcelUtils.setCellData("Fail", i, 7);
			}
			if (wb.getCurrentUrl().equals(Constant.PAGE_URL)) {
				Page.clickLogOut(wb);
			} else

				Registration.navigateToPage(wb);

		}
	}
//}
