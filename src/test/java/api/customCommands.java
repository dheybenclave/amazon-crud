package api;

import java.util.TreeMap;

import junit.framework.Assert;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import api.customSelectors.*;;

public class customCommands extends PageObject {

	String title;
	String currUrl;

	TreeMap<String, String> _s = customSelectors.getSelector();

	public WebElementFacade map(String _currSelector) {

		System.out.println("WebElementFacade[map]: '" + $(_s.get(_currSelector)) + "'");
		WebElementFacade input = $(_s.get(_currSelector));
		waitABit(1000);
		input.shouldBeVisible();
		return input;
	}

	/**
	 * @param selector : "String" | XpathorSelector 
	 * @param value : "String" | value
	 **/
	public WebElementFacade SeText(String selector, String value) {
		// TODO Auto-generated constructor stub
		System.out.println("setText: '" + selector + "' - '" + value + "' ");

		// findBy(map(selector)).waitUntilVisible();
		map(selector).waitUntilVisible();
		typeInto(map(selector), value);
		return map(selector).waitUntilVisible();
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

}
