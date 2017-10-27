package kata.casinos;

public class LoginFailException extends RuntimeException  {

	private static final long serialVersionUID = 8626356835973918973L;

	public LoginFailException(String string) {
		super(string);
	}

}
