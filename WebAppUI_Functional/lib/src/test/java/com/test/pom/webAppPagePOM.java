package com.test.pom;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.base.JavaSeleniumBase;
import com.test.utils.SeleniumUtilities;

public class webAppPagePOM extends JavaSeleniumBase {

	WebDriver driver = browserWebdriverLocal;
	SeleniumUtilities seleniumUtil = new SeleniumUtilities();

	@FindBy(how = How.ID, using = "")
	static WebElement element1;

	@FindBy(how = How.CLASS_NAME, using = "")
	static WebElement element2;

	@FindBy(how = How.TAG_NAME, using = "")
	static WebElement element3;

	@FindBy(how = How.NAME, using = "")
	static WebElement element4;

	@FindBy(how = How.XPATH, using = "")
	static WebElement element5;

	@FindBy(how = How.CSS, using = "")
	static WebElement element6;

	@FindBy(how = How.ID, using = "")
	static WebElement elementSelect;

	@FindBy(how = How.ID, using = "")
	static WebElement elementCheckRadio;

	public webAppPagePOM(final WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions for elements.

	public static void selectElements(Set<String> selectText) {

		Select toSelect = new Select(elementSelect);
		boolean isMultiple = toSelect.isMultiple();

		if (isMultiple == true) {
			selectText.forEach(text -> toSelect.selectByVisibleText(text));
		} else {
			selectText.forEach(text -> toSelect.selectByVisibleText(text));
		}
	}

	public static void deselectElements(Set<String> selectText) {

		Select toSelect = new Select(elementSelect);
		selectText.forEach(text -> toSelect.deselectByVisibleText(text));
	}

	public static void tableElements(String tagName, Set<String> rowsValueExpected) {

		Set<WebElement> rowsValueActual = new HashSet<WebElement>(browserWebdriverLocal.findElements(By.id(tagName)));

		for (String value : rowsValueExpected) {
			rowsValueActual.forEach(text -> System.out.println("Expected: " + value + ", " + "Actual: " + text));
		}

	}

	public static void checkRadioElements(String selectState) {

		switch (selectState) {
		case "select":
			if (elementCheckRadio.isSelected() == false) {
				elementCheckRadio.click();
			} else {
				System.out.println(elementCheckRadio.isSelected() + "Element is selected.");
			}
			break;
		case "deselect":
			if (elementCheckRadio.isSelected() == true) {
				elementCheckRadio.click();
			} else {
				System.out.println(elementCheckRadio.isSelected() + "Element is not selected.");
			}
			break;
		default:
			System.out.println("Give \"selectState\" as - select / deselect.");
		}
	}

	public static void element1Function() {

		element1.sendKeys("");
		element1.clear();
	}

	public static void element2Function() {

		String elementText = element2.getText();
		System.out.println(elementText);
		System.out.println(element2.getAccessibleName());
	}

	public static void element3Function() {

		Rectangle rect = element3.getRect();
		System.out.println("x: " + rect.getX() + ", " + "Y: " + rect.getY() + ", " + "Height: " + rect.getHeight()
				+ ", " + "Width: " + rect.getWidth());

	}

	public static void element4Function() {

		element4.getCssValue("color");
		element4.getDomAttribute("fontColor");
		element4.getDomProperty("Id");
	}

	public static void element5Function() {

		element5.isEnabled();
		element5.click();
		element5.submit();

		element5.sendKeys("Input value");
		element5.sendKeys(Keys.RETURN);
	}

	public static void element6Function() throws IOException {

		File ss = element6.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File(""));

		System.out.println(element6.equals(element5));

		element6.getTagName();
		element6.isDisplayed();
	}
}
