package com.koukio.priority.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class PrioritiesTest {

	Priorities priorities = new Priorities();

	@Test
	public void testGetStudents() {
		addSouceData();
		List<String> events = createEventList();

		int index = 0;

		System.out.println("Sample Input");
		System.out.println(events.size());

		for (String event : events) {
			if (event.equals("ENTER")) {
				System.out.println(event + " " + priorities.sourceStudentList.get(index));
				index++;
			} else {
				System.out.println(event);
			}

		}

		List<Student> queue = priorities.getStudents(events);

		System.out.println("\nSample Output");

		Iterator<Student> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

	}

	void addSouceData() {
		priorities.addStudent(new Student(50, "John", 3.75));
		priorities.addStudent(new Student(24, "Mark", 3.8));
		priorities.addStudent(new Student(35, "Shafaet", 3.7));
		priorities.addStudent(new Student(36, "Samiha", 3.85));
		priorities.addStudent(new Student(42, "Ashley", 3.9));
		priorities.addStudent(new Student(46, "Maria", 3.6));
		priorities.addStudent(new Student(49, "Anik", 3.95));
		priorities.addStudent(new Student(50, "Dan", 3.95));
	}

	List<String> createEventList() {
		List<String> events = new ArrayList<>();
		events.add("ENTER");
		events.add("ENTER");
		events.add("ENTER");
		events.add("SERVED");
		events.add("SERVED");
		events.add("ENTER");
		events.add("SERVED");
		events.add("ENTER");
		events.add("ENTER");
		events.add("ENTER");
		events.add("ENTER");
		events.add("SERVED");
		return events;

	}
}
