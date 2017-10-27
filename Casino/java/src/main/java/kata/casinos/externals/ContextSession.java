package kata.casinos.externals;

import kata.casinos.Casino;

public class ContextSession {

	private static final ContextSession userSession = new ContextSession();
	private ContextSession() {
	}
	
	public static ContextSession getInstance() {
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