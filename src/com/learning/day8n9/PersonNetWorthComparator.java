package com.learning.day8n9;

import java.util.Comparator;

public class PersonNetWorthComparator implements Comparator<Person> {
	@Override
	public int compare(Person person1, Person person2) {
		// TODO Auto-generated method stub
		return (int) (person1.netWorth - person2.netWorth);
	}

}
