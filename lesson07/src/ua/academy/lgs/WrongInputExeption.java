/*
 * Stepan Tehlivets
 * Logos IT Academy homework to lesson 07
 */

package ua.academy.lgs;

/**
 * @since java 1.8
 * @author stept
 * @version 1.0
 */

/** Exception that throws when entered input do not equals to anything in array */
public class WrongInputExeption extends Exception {
	private String itsWrong;

	WrongInputExeption(String itsWrong) {
		super(itsWrong);
		this.itsWrong = itsWrong;

	}

	public String getItsWrong() {
		return itsWrong;
	}

}
