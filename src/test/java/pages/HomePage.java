package pages;

import net.thucydides.core.annotations.Step;

public class HomePage {

	HomePage_commands home;
	@Step("open applicaiton")
	public void openApp() {
		
		home.open();		
	}

}
