package learnOops;

public class TC001_LoginLogout extends SeleniumBase{

	

	// login
	public void login() {
		launchBrowser("chrome", "https://www.linkedin.com/");
		enterValue();
	}

	public void createLead() {
		launchBrowser("chrome", "http://leaftaps.com/opentaps");
	}




}
