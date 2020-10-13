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

/** ENUM with names, days and seasons of Months */
public enum Months {
	JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28), MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
	MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30), JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 31),
	SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30),
	DECEMBER(Seasons.WINTER, 31);

	Seasons seasons;
	int days;

	/** Contstructor for Months EMUN */
	Months(Seasons seasons, int days) {
		this.seasons = seasons;
		this.days = days;
	}

	/** Method that returns season of month */
	public Seasons getSeason() {
		return seasons;
	}

	/** Method that returns number of days of month */
	public int getDays() {
		return days;
	}
}
