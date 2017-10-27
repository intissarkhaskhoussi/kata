package kata.casinos.externals;

import java.util.List;

import kata.casinos.Casino;
import kata.casinos.CollaboratorCallException;
import kata.casinos.LoginFailException;
import kata.casinos.Vip;

public class CasinoDAOReal {

	public static List<Vip> findVipByCasino(Casino user) {
		throw new CollaboratorCallException("CasinoDAO should not be invoked on an unit test.");
	}
	
	public static Casino findCasino(String login, String password) {
		throw new LoginFailException("Not in an unit test.");
	}
	
	public static Casino findCasinoByName(String text) {
		throw new CollaboratorCallException("CasinoDAO should not be invoked on an unit test.");
	}

}