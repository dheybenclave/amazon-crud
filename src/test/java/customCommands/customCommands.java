package customCommands;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;

import com.ea.async.Async;

import io.cucumber.java.Before;
import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.junit.annotations.Concurrent;
import pages.selectors.commonPageSelector;
import pages.selectors.homePageSelector;
import pages.selectors.loginPageSelector;

public class customCommands extends PageObject {

	String title;
	String currUrl;

	static TreeMap<String, String> _s = new TreeMap<String, String>();
	static HashMap<String, String> homePageSelector = new homePageSelector().getSelector();
	static HashMap<String, String> loginPageSelector = new loginPageSelector().getSelector();
	static HashMap<String, String> commonPageSelector = new commonPageSelector().getSelector();

	@Before
	@WhenPageOpens
	public static void init() {

		Object[] listofSelectors =
		{
			homePageSelector,
			loginPageSelector,
			commonPageSelector,
		};

		for (Object listOfHashSelector : listofSelectors) {
			Set<Entry<String, String>> entries = ((HashMap<String, String>) listOfHashSelector).entrySet();
			for (Map.Entry<String, String> mapEntry : entries) {
				_s.put(mapEntry.getKey(), mapEntry.getValue());
			}
		}

		for (String i : _s.keySet()) {
			System.out.println("selector: " + i + " value: " + _s.get(i));
		}

	}

	public WebElementFacade map(String _currSelector) {
		WebElementFacade input = $(_s.get(_currSelector));
		System.out.println("WebElementFacade - map : '" + input + "'");
		input.shouldBeVisible();
		return input;
	}

	/**
	 * @param url : "String" | URL Value
	 **/
	public Object verifyApplication(String url) {

		System.out.println("verifyApplication: '" + url + "' ");

		waitABit(1000);
		title = getDriver().getTitle();

		currUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currUrl.contains(url));
		return this;
	}

	/**
	 * @param selector : "String" | Name of Selector
	 * @param value    : "String" | Set of Value
	 **/
	public Object setText(String selector, String value) {

		System.out.println("setText: '" + selector + "' - '" + value + "' ");

		map(selector).waitUntilVisible();// findBy(map(selector)).waitUntilVisible();
		typeInto(map(selector), value);
		return this;
	}

	public Object selectItemDropdown(String selector, String item) {

		System.out.println("selectItemDropdown: '" + selector + "' - '" + item + "' ");
		map(selector).waitUntilVisible(); // findBy(map(selector)).waitUntilVisible();
		typeInto(map(selector), item);
		waitForAnyTextToAppear(item);
		clickOn(map("commonContainerItem" + "commonContainerItem"));

		return this;

	}

}
