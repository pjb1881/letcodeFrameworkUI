/**
 * 
 */
package com.web.letcode.tests;

import org.testng.annotations.Test;

import com.web.letcode.base.BaseClass;
import com.web.letcode.keys.Keys;
import com.web.letcode.pages.InputLetcodePage;
import com.web.letcode.utilities.ExcelReader;

/**
 * @author jparimi
 *
 */

public class LetcodeInputTest extends BaseClass {
	Keys k = new Keys();
	InputLetcodePage inputLetcodePage = new InputLetcodePage();
	String path1 = ".\\src\\test\\resources\\utilities\\env\\links.xlsx";
	ExcelReader linkRead = new ExcelReader(path1);

	@Test(priority = 1, enabled = true)
	public void validatesendInputKeyToInputField_TC001() {
		///ExtentTest test = extent.createTest("validate send Input Key To Input Field TC001");

		try {
			driver.get().get(linkRead.getCellValue("INPUTLINK", "linksdata", "LINK"));
			//test.info("driver launched and navigated to url :: "+ linkRead.getCellValue("INPUTLINK", "linksdata", "LINK"));

			inputLetcodePage.waitUntilLoad();
			inputLetcodePage.sendInputKeyToInputField(k.FullNameKey);
			//test.info("keys sent from keys.xlsx file successfully");
			//test.pass("user sent full name into the input field successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//test.fail(e);
			System.out.println(e);
		}
	}

	/**
	 * 
	 */

}
