package api;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import pages.selectors.commonPageSelector;
import pages.selectors.homePageSelector;
import pages.selectors.loginPageSelector;

public class customSelectors extends PageObject {

	static TreeMap<String, String> _s = new TreeMap<String, String>();

	public static TreeMap<String, String> getSelector() {

		HashMap<String, String> commonPageSelector = new commonPageSelector().getSelector();
		HashMap<String, String> homePageSelector = new homePageSelector().getSelector();
		HashMap<String, String> loginPageSelector = new loginPageSelector().getSelector();
		
		

		Object[] listofSelectors =
		{
			commonPageSelector,
			homePageSelector,
			loginPageSelector,
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
		return _s;
	}

}
