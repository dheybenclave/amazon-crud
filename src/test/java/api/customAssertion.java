package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import io.cucumber.java.Before;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;
import pages.selectors.commonPageSelector;
import pages.selectors.homePageSelector;
import pages.selectors.loginPageSelector;

public class customAssertion extends PageObject {

	String title;
	String currUrl;

	static TreeMap<String, String> _s = new TreeMap<String, String>();
	static HashMap<String, String> commonPageSelector = new commonPageSelector().getSelector();
	static HashMap<String, String> homePageSelector = new homePageSelector().getSelector();
	static HashMap<String, String> loginPageSelector = new loginPageSelector().getSelector();

	@Before
	@WhenPageOpens
	public static void init() {
//
//		Object[] listofSelectors =
//		{
//			commonPageSelector,
//			homePageSelector,
//			loginPageSelector,
//
//		};
//
//		for (Object listOfHashSelector : listofSelectors) {
//			Set<Entry<String, String>> entries = ((HashMap<String, String>) listOfHashSelector).entrySet();
//			for (Map.Entry<String, String> mapEntry : entries) {
//				_s.put(mapEntry.getKey(), mapEntry.getValue());
//			}
//		}
	}

//	public WebElementFacade map(String _currSelector) {
//		System.out.println("WebElementFacade[map]: '" + $(_s.get(_currSelector)) + "'");
//		WebElementFacade input = $(_s.get(_currSelector));
//		input.shouldBeVisible();
//		return input;
//	}

	

}
