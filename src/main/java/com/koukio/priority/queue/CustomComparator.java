package com.koukio.priority.queue;

import java.util.Comparator;

public class CustomComparator implements Comparator<Student> {

	public int compare(Student student1, Student student2) {

		if (student1.getCGPA() < student2.getCGPA()) {
			return 1;
		} else if (student1.getCGPA() > student2.getCGPA()) {
			return -1;
		} else {
			if (student1.getName().compareTo(student2.getName()) < 0) {
				return -1;
			} else if (student1.getName().compareTo(student2.getName()) > 0) {
				return 1;
			} else {
				if (student1.getId() < student2.getId()) {
					return 1;
				} else if (student1.getId() > student2.getId()) {
					return -1;
				}
			}
			return 0;
		}
	}

}
