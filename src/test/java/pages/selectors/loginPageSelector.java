package pages.selectors;

import java.util.HashMap;

public class loginPageSelector {

	/**
	 * This is Key : Value for selector Key : name of Selector Value : Actual ID
	 * Value DOM
	 * 
	 * eg: "view_logo_signIn_btn:nav-link-accountList"
	 ***/

	public HashMap<String, String> getSelector() {

		String[] loginSelector =
		{
			"login_signIn_btn : //span[@id='auth-signin-button' or @id='continue']",
			"login_email_inpt : //input[@id='ap_email']",
			"login_password_inpt : //input[@id='ap_password']",
		};

		HashMap<String, String> _s = new HashMap<String, String>();
		for (int i = 0; i < loginSelector.length; i++) {
			String name = loginSelector[i].split(":")[0].trim();
			String selectorID = loginSelector[i].split(":")[1].trim();
			if (!_s.containsKey(name)) _s.put(name, selectorID);
		}

		return _s;
	}
}
