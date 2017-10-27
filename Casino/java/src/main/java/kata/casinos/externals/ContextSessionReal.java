package kata.casinos.externals;

import kata.casinos.Casino;

public class ContextSessionReal {

	private static final ContextSessionReal userSession = new ContextSessionReal();
	private ContextSessionReal() {
	}
	
	public static ContextSessionReal getInstance() {
		return userSession;
	}

	private Casino loggedIn;
	
	public Casino getLoggedCasino() {
		return loggedIn;
	}

	public void setLogged(Casino loggedIn) {
		this.loggedIn = loggedIn;
	}

}