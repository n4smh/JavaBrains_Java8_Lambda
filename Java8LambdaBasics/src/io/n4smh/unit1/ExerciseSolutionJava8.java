package io.n4smh.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 *
 * Solution with Java 7
 * 
 */

public class ExerciseSolutionJava8 {
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Nagesh", "MH", 24),
				new Person("Karthik", "Devaru", 25), new Person("Vijeth", "A", 25),
				new Person("Vasant", "Sakre", 25));

		// Step1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

		// Step2: Create the elements that prints all the elements in the list
		System.out.println("Printing all the person in list");
		printConditionaly(people, p -> true);
		System.out.println();

		// Step3: Create a method all the people whose name starts with V
		System.out.println("Printing persons whose name startswith V");
		printConditionaly(people, person -> person.getFirstname().startsWith("V"));
		System.out.println();

		System.out.println("Printing persons whose name endswith h");
		printConditionaly(people, person -> person.getFirstname().endsWith("h"));
		System.out.println();

	}

	public static void printConditionaly(List<Person> people, Condition condition) {

		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}

	interface Condition {
		boolean test(Person person);
	}
}
