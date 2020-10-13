/*
 * Stepan Tehlivets
 * Logos IT Academy homework to lesson 07
 */

package ua.academy.lgs;

import java.util.Scanner;

/**
 * @since java 1.8
 * @author stept
 * @version 1.0
 */

public class Application {
	public static void main(String[] args) throws WrongInputExeption {
		
		/** Array containing ENUM entries */
		Months[] mons = Months.values();
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			/** Entry of Menu class to show possible cases */
			Menu.menu();
			
			/** Scanner to see what user want to do */
			switch (sc.next()) {
			
			/** Case to check if entered month is in list of enums */
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				
				/** String to save entered symbols with uppercase to avoid wrong result */
				String monthSc = sc.next().toUpperCase();

				boolean flag = false;

				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.name().equals(monthSc)) {
						flag = true;
					}

				}
				if (flag) {
					System.out.println("Month is present");
				} else {
					System.out.println("There is no such month");
				}

				break;
			}
			
			/** Case to check if entered season is present */
			case "2": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				
				/** String to save entered symbols with uppercase to avoid wrong result */
				String seasonSc = sc.next().toUpperCase();
				boolean flag = false;

				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.getSeason().name().equals(seasonSc)) {
						flag = true;
						System.out.println(m);
					}
				}
				
				/** Statement that throw exception if entered data has no equality in ENUMs */
				if (!flag) {
					throw new WrongInputExeption("Sorry, input is wrong");
				}

				break;
			}
			
			/** Case to show all month that have same number of days */
			case "3": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				
				/** String that saves intered data */
				String monthSc = sc.next().toUpperCase();
				boolean flag = false;
				
				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.name().equals(monthSc)) {
						flag = true;
						
						/** Integer that saves number of days in entered month */
						int days = m.getDays();
						
						/** Check that prints months with same number of days */
						for (Months months : mons) {
							if (days == months.days) {
								System.out.println(months);
							}
						}
					}
				}
				
				/** Statement that throw exception if entered data has no equality in ENUMs */
				if (!flag) {
					throw new WrongInputExeption("Sorry, input is wrong");
				}

				break;
			}
			
			/** Case to show all month that have minor number of days than entered month */
			case "4": {
				System.out.println("Enter month");
				/** String that saves intered data */
				sc = new Scanner(System.in);
				String monthSc = sc.next().toUpperCase();
				boolean flag = false;
				
				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.name().equals(monthSc)) {
						flag = true;
						
						/** Integer that saves number of days in entered month */
						int days = m.getDays();
						
						/** Check that prints months with minor number of days */
						for (Months months : mons) {
							if (days > months.days) {
								System.out.println(months);
							}
						}

					}

				}
				
				/** Statement that throw exception if entered data has no equality in ENUMs */
				if (!flag) {
					throw new WrongInputExeption("Sorry input is wrong");
				}
				break;
			}
			
			/** Case to show all month that have major number of days than entered month */
			case "5": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				
				/** String that saves intered data */
				String monthSc = sc.next().toUpperCase();
				boolean flag = false;
				
				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.name().equals(monthSc)) {
						flag = true;
						
						/** Integer that saves number of days in entered month */
						int days = m.getDays();
						
						/** Check that prints months with major number of days */
						for (Months months : mons) {
							if (days < months.days) {
								System.out.println(months);
							}

						}
					}
				}
				
				/** Statement that throw exception if entered data has no equality in ENUMs */
				if (!flag) {
					throw new WrongInputExeption("Sorry input is wrong");
				}
				break;
			}
			
			/** Case to show season next to entered */
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				
				/** String that saves intered data */
				String seasonSc = sc.next().toUpperCase();
				boolean flag = false;
				
				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.getSeason().name().equals(seasonSc)) {
						flag = true;
					}
				}
				
				/** if-else statement that checks entered data and print next season */
				if (flag) {
					if (seasonSc.equals("WINTER")) {
						System.out.println("SPRING");
					} else if (seasonSc.equals("SPRING")) {
						System.out.println("SUMMER");
					} else if (seasonSc.equals("SUMMER")) {
						System.out.println("AUTUMN");
					} else if (seasonSc.equals("AUTUMN")) {
						System.out.println("WINTER");
					}

				}
				
				/** Statement that throw exception if entered data has no equality in ENUMs */
				else {
					throw new WrongInputExeption("Sorry input is wrong");
				}

				break;
			}
			
			/** Case to show season prior to entered */
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				
				/** String that saves intered data */
				String seasonSc = sc.next().toUpperCase();
				boolean flag = false;
				
				/**
				 * Check if entered data is present in array of ENUM that make "flag" true if
				 * entered data equals to any entry in array
				 */
				for (Months m : mons) {
					if (m.getSeason().name().equals(seasonSc)) {
						flag = true;
					}
				}
				
				/** if-else statement that checks entered data and print prior season */
				if (flag) {
					if (seasonSc.equals("WINTER")) {
						System.out.println("AUTUMN");
					} else if (seasonSc.equals("SPRING")) {
						System.out.println("WINTER");
					} else if (seasonSc.equals("SUMMER")) {
						System.out.println("SPRING");
					} else if (seasonSc.equals("AUTUMN")) {
						System.out.println("SUMMER");
					}

				}
				/** Statement that throw exception if entered data has no equality in ENUMs */
				else {
					throw new WrongInputExeption("Sorry input is wrong");
				}

				break;
			}

			/** Case to show all months with even number of days */
			case "8": {

				/** Iteration over array of Months */
				for (Months m : mons) {

					/** Check that prints month with even number of days */
					if (m.getDays() % 2 == 0) {
						System.out.println(m.name());
					}
				}

				break;
			}

			/** Case to show all months with odd number of days */
			case "9": {

				/** Iteration over array of Months */
				for (Months m : mons) {

					/** Check that prints month with odd number of days */
					if (m.getDays() % 2 == 1) {
						System.out.println(m.name());
					}
				}

				break;
			}

			/** Case to check if entered month have even or odd number of days */
			case "10": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);

				/** String that saves intered data */
				String monthSc = sc.next().toUpperCase();
				boolean flag = false;
				/** Iteration over array of Months */
				for (Months months : mons) {

					/** Check that prints if month has even number of days */
					if (months.name().equals(monthSc) & months.getDays() % 2 == 0) {
						System.out.println("Month has even number of days");
						flag = true;
					}

					/** Check that prints if month has odd number of days */
					else if (months.name().equals(monthSc) & months.getDays() % 2 == 1) {
						System.out.println("Month has odd number of days");
						flag = true;
					}
				}

				/** Statement that throw exception if entered data has no equality in ENUMs */
				if (!flag) {
					throw new WrongInputExeption("Sorry input is wrong");
				}

				break;
			}
			}

		}

	}
}
