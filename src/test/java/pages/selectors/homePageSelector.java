package pages.selectors;

import java.util.HashMap;


public class homePageSelector{

	/**
	 * This is Key : Value for selector Key : name of Selector Value : Actual ID
	 * Value DOM
	 * 
	 * eg: "view_logo_signIn_btn:nav-link-accountList"
	 ***/

	HashMap<String, String> _s = new HashMap<String, String>();
	public String[] homeSelector =
	{
		"home_email_inpt : //*[@id='email']",
		"home_password_inpt : //*[@id='pass']",
		"home_login_btn : //*[@name='login']"
	};

	public String get(String selector) {
		for (int i = 0; i < homeSelector.length; i++) {
			String name = homeSelector[i].split(":")[0].trim();
			String selectorID = homeSelector[i].split(":")[1].trim();
			if (!_s.containsKey(name)) _s.put(name, selectorID);
		}
		return _s.get(selector);

	};

	public HashMap<String, String> getSelector() {

		for (int i = 0; i < homeSelector.length; i++) {
			String name = homeSelector[i].split(":")[0].trim();
			String selectorID = homeSelector[i].split(":")[1].trim();
			if (!_s.containsKey(name)) _s.put(name, selectorID);
		}
		return _s;

	}
}
