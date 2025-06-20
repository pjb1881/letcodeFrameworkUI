/**
 * 
 */
package com.web.letcode.keys;

import org.openqa.selenium.WebDriver;

import com.web.letcode.base.BaseClass;
import com.web.letcode.utilities.ExcelReader;

/**
 * @author jparimi
 *
 */
public class Keys extends BaseClass {

	/**
	 * 
	 */
//	static WebDriver driver;
//
//	public Keys(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//	}

	String path = ".\\src\\test\\resources\\utilities\\keys\\keydata.xlsx";
	ExcelReader keyRead = new ExcelReader(path);

	// keys
	public String FullNameKey = keyRead.getCellValue("FullNameKey", "keydatasheet", "key Value");
	public String AppendATextAndPresskeyboardTabFieldKey = keyRead
			.getCellValue("AppendATextAndPresskeyboardTabFieldKey", "keydatasheet", "key Value");
	public String WhatIsInsideTheTextBoxFieldKey = keyRead.getCellValue("WhatIsInsideTheTextBoxFieldKey",
			"keydatasheet", "key Value");
	public String verifyClearTheTextKey = keyRead.getCellValue("verifyClearTheTextKey", "keydatasheet", "key Value");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keys n = new Keys();
		System.out.println(n.FullNameKey);
//		String path1 =".\\utilities\\env\\links.xlsx";
//		ExcelReader linkRead = new ExcelReader(path1);
		System.out.println(n.AppendATextAndPresskeyboardTabFieldKey);

	}

}
