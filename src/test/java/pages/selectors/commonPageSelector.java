package pages.selectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class commonPageSelector {

	public HashMap<String, String> getSelector() {
		String[] commonContainer =
		{
			"drpdwn_navCoreFlyout : //div[@class='nav-coreFlyout nav-flyout' and @style and not(contains(@style,'display: none'))] ",
		};
		String[] commonContainerItem =
		{
			"drpdwn_navItem : //a[contains(@class,'nav-item')] ",
		};

		String[] commonSelector =
		{
			"common_region_dropdwn : //a[@id='icp-nav-flyout']",
			"common_account_dropdwn : //a[@id='nav-link-accountList']",

		};

		String[][] listofCommonSelectors =
		{
			commonContainer,
			commonContainerItem,
			commonSelector,
		};

		HashMap<String, String> _s = new HashMap<String, String>();
		List<String> ddd = new ArrayList<String>();

	
		for (String[] strings : listofCommonSelectors) {
			for (String strings2 : strings) {
				ddd.addAll(Arrays.asList(strings));
			}
		}

	
		for (int i = 0; i < ddd.size(); i++) {

			String name = ddd.get(i).split(":")[0].trim();
			String selectorID = ddd.get(i).split(":")[1].trim();
			if (!_s.containsKey(name)) _s.put(name, selectorID);
		}
		
		return _s;
	}
}
