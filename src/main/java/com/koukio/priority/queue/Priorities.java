package com.koukio.priority.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorities {
	
	Queue<Student> studentQueue = new PriorityQueue<>(new CustomComparator());
	List<Student> sourceStudentList = new ArrayList<>();
	
	void addStudent(Student student){
		sourceStudentList.add(student);
	}
	
	
	List<Student> getStudents(List<String> events){
		for(String event : events) {
			if(event.equals("ENTER")) {
				studentQueue.add(sourceStudentList.get(0));
				sourceStudentList.remove(0);
			}
			if(event.equals("SERVED") && !studentQueue.isEmpty()) {
				studentQueue.poll();
			}
			
		}
		return new ArrayList<Student>(studentQueue);
	}
}
