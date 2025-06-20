package com.web.letcode.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.web.letcode.base.BaseClass;
import com.web.letcode.pagelocators.Locators;

public class InputLetcodePage extends BaseClass {
	WebDriver driver;
	Locators loc = new Locators();
	Logger logger = Logger.getLogger(InputLetcodePage.class);
	//Actions act = new Actions(driver);

	// Assert ast = new Assert();

//	public InputLetcodePage(WebDriver driver) {
//		// TODO Auto-generated constructor stub
//		this.driver = driver;
//		loc = new Locators();
//		act = new Actions(driver);
//
//		logger = Logger.getLogger(InputLetcodePage.class);
//	}

	public void waitUntilLoad() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		if (j.executeScript("return document.readyState").toString().equals("complete")) {
			System.out.println("Page has loaded");
		}
	}

	public void sendInputKeyToInputField(String Key1) {

		driver.findElement(loc.EnteryourfullNameField).clear();
		driver.findElement(loc.EnteryourfullNameField).sendKeys(Key1);
		// driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		boolean inField = driver.findElement(loc.EnteryourfullNameField).isEnabled();
		if (inField == true) {
			logger.info("Element is enabled :: " + inField);

		} else {
			logger.error("element is dissabled");

		}
		String inGetAttribute = driver.findElement(loc.EnteryourfullNameField).getAttribute("value");
		logger.info("inputted value is:" + inGetAttribute);
		System.out.println("inputted value is:" + inGetAttribute);

	}

	public void verifyAppendATextAndPresskeyboardTab(String Key1) {

		String inGetAttribute1 = driver.findElement(loc.AppendATextAndPresskeyboardTabField).getAttribute("value");
		logger.info(inGetAttribute1);
		System.out.println("inputted value is:" + inGetAttribute1);

		driver.findElement(loc.AppendATextAndPresskeyboardTabField).clear();
		driver.findElement(loc.AppendATextAndPresskeyboardTabField).sendKeys(Key1);
		// driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		boolean inField = driver.findElement(loc.AppendATextAndPresskeyboardTabField).isEnabled();
		if (inField == true) {
			logger.info("Element is enabled :: " + inField);
		} else {
			logger.error("element is dissabled");
		}
		String inGetAttribute2 = driver.findElement(loc.AppendATextAndPresskeyboardTabField).getAttribute("value");
		logger.info("inputted value is:" + inGetAttribute2);
		System.out.println("inputted value is:" + inGetAttribute2);
		driver.findElement(loc.AppendATextAndPresskeyboardTabField).sendKeys(Keys.TAB);
	}

	public void verifyWhatIsInsideTheTextBoxField(String Key1) {
		String inGetAttribute1 = driver.findElement(loc.WhatIsInsideTheTextBoxField).getAttribute("value");
		logger.info("inputted value is before clearing text:" + inGetAttribute1);
		System.out.println("inputted value is before clearing text:" + inGetAttribute1);

		driver.findElement(loc.WhatIsInsideTheTextBoxField).clear();
		driver.findElement(loc.WhatIsInsideTheTextBoxField).sendKeys(Key1);
		// driver.manage().timeouts().pageLoadTimeout(100, SECONDS);
		boolean inField = driver.findElement(loc.WhatIsInsideTheTextBoxField).isEnabled();
		if (inField == true) {
			logger.info("Element is enabled :: " + inField);
		} else {
			logger.error("element is dissabled");
		}
		String inGetAttribute2 = driver.findElement(loc.WhatIsInsideTheTextBoxField).getAttribute("value");
		logger.info("inputted value is inputted value is before copying:" + inGetAttribute2);
		System.out.println("inputted value is before copying:" + inGetAttribute2);
//		// code for "ctrl+A" function
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("a");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
//		// code for "ctrl+C" function
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("c");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
		String inGetAttribute3 = driver.findElement(loc.WhatIsInsideTheTextBoxField).getAttribute("value");
		logger.info("inputted value is inputted value is After copying:" + inGetAttribute3);
		System.out.println("inputted value is After copying:" + inGetAttribute3);
		if (!inGetAttribute1.equals(inGetAttribute2)) {
			logger.info("inputted value is changed from < " + inGetAttribute1 + " > to < " + inGetAttribute2 + " >");
			System.out.println(
					"inputted value is changed from < " + inGetAttribute1 + " > to < " + inGetAttribute2 + " >");
		} else if (inGetAttribute1.equals(inGetAttribute2)) {
			System.out.println(
					"inputted value is changed from < " + inGetAttribute1 + " > to < " + inGetAttribute2 + " >");
		}

	}

	public void verifyClearTheText(String key1) {
		String inGetAttribute1 = driver.findElement(loc.ClearTheText).getAttribute("value");
		logger.info("inputted value is before clearing text :" + inGetAttribute1);
		System.out.println("inputted value is before clearing text :" + inGetAttribute1);

		// clear the text
		driver.findElement(loc.ClearTheText).clear();
		// send data
		driver.findElement(loc.ClearTheText).sendKeys(key1);
//		// logic to perform "ctrl+V"
//		act.keyDown(Keys.CONTROL);
//		act.sendKeys("v");
//		act.keyUp(Keys.CONTROL);
//		act.build().perform();
		String inGetAttribute2 = driver.findElement(loc.ClearTheText).getAttribute("value");
		logger.info("inputted value is after sending keys:" + inGetAttribute2);
		System.out.println("inputted value is after sending keys:" + inGetAttribute2);
		if (!inGetAttribute1.equals(inGetAttribute2)) {
			logger.info("Text changed from" + inGetAttribute1 + " to " + inGetAttribute2);
		} else if (inGetAttribute1.equals(inGetAttribute2)) {
			logger.error("OMG!! there is an errorr dude check your code ..!");
		}

	}

	public void verifyConfirmEditFieldIsDisabled() {
		String getAttribute1 = driver.findElement(loc.ConfirmEditFieldIsDisabled).getAttribute("placeholder");
		logger.info("placeholder value of the disabled input field is :: " + getAttribute1);
		System.out.println("placeholder value of the disabled input field is :: " + getAttribute1);
		boolean findEleIsEnabledOrNot = driver.findElement(loc.ConfirmEditFieldIsDisabled).isEnabled();
		if (findEleIsEnabledOrNot == false) {
			logger.info("element is disabled and the boolean value for isenabled tag is :: " + findEleIsEnabledOrNot);
			System.out.println(
					"element is disabled and the boolean value for isenabled tag is :: " + findEleIsEnabledOrNot);
		} else if (findEleIsEnabledOrNot == true) {
			logger.error(
					"OMG!! there is an error dude:: check in < (InputLetcodePage.java)->verifyConfirmEditFieldIsDisabled > method for error rectification");
			;
		}
	}

	public void verifyConfirmTextIsReadonly() {
		String getAttribute1 = driver.findElement(loc.ConfirmTextIsReadonly).getAttribute("value");
		logger.info("value of the readOnly input field is :: " + getAttribute1);
		System.out.println("value of the readOnly input field is :: " + getAttribute1);
		WebElement ok = driver.findElement(loc.ConfirmTextIsReadonly);

		String findEleIsEnabledOrNot = driver.findElement(loc.ConfirmTextIsReadonly).getAttribute("class");
		if (findEleIsEnabledOrNot == "readonly") {
			logger.info(
					"element is in readonly and the boolean value for isenabled tag is :: " + findEleIsEnabledOrNot);
			System.out.println(
					"element is readonly and the boolean value for isenabled tag is :: " + findEleIsEnabledOrNot);
		} else if (findEleIsEnabledOrNot != "readonly") {
			logger.error(
					"OMG!! there is an error dude:: check in < (InputLetcodePage.java)->verifyConfirmEditFieldIsDisabled > method for error rectification");
			;
		}
	}

}
