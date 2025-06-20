/**
 * 
 */
package com.web.letcode.pagelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.letcode.base.BaseClass;
import com.web.letcode.utilities.ExcelReader;

/**
 * @author jparimi
 *
 */
public class Locators extends BaseClass {
//	static WebDriver driver;
//
//	/**
//	 * 
//	 */
//	public Locators(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//	}

	String path = ".\\src\\test\\resources\\utilities\\locators\\locators.xlsx";
	ExcelReader locRead = new ExcelReader(path);
	// locators starts
	// ->> 1) input page locators
	public By EnteryourfullNameField = By
			.xpath(locRead.getCellValue("EnteryourfullNameField", "selectors", "locatorPath"));
	public By AppendATextAndPresskeyboardTabField = By
			.xpath(locRead.getCellValue("AppendATextAndPresskeyboardTabField", "selectors", "locatorPath"));
	public By WhatIsInsideTheTextBoxField = By
			.cssSelector(locRead.getCellValue("WhatIsInsideTheTextBoxField", "selectors", "locatorPath"));
	public By ClearTheText = By.cssSelector(locRead.getCellValue("ClearTheText", "selectors", "locatorPath"));
	public By ConfirmEditFieldIsDisabled = By
			.cssSelector(locRead.getCellValue("ConfirmEditFieldIsDisabled", "selectors", "locatorPath"));
	public By ConfirmTextIsReadonly = By
			.cssSelector(locRead.getCellValue("ConfirmTextIsReadonly", "selectors", "locatorPath"));
	// ->>2)

//	public static void main(String[]args){
//		
//		Locators loc =new Locators(driver);
//		System.out.println(loc.ok);
//		
//	}

}
