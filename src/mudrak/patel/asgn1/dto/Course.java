package mudrak.patel.asgn1.dto;

import java.io.Serializable;

import mudrak.patel.asgn1.dto.Professor;
import mudrak.patel.asgn1.exceptions.ImproperInputException;

public class Course implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String courseCode;
	private String courseTitle;
	private Professor professor;

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) throws ImproperInputException {
		if ( courseCode == null || courseCode.isEmpty() ) {
			throw new ImproperInputException("Course must have a course code");
		}
		courseCode.toUpperCase();
		if ( ! courseCode.matches("[A-Z]{3,4} ?[0-9]{3,4}" ) ) {
			throw new ImproperInputException(
				"Course code must be 3 or 4 letters followed by 3 or 4 digits" );
		}
		this.courseCode = courseCode;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		// assume a course can have an empty or null title
		this.courseTitle = courseTitle;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		// professor can be null when professor not assigned
		this.professor = professor;
	}

	public Course( String courseCode) throws ImproperInputException {
		super();
		setCourseCode(courseCode);
	}
	
	public Course(String courseCode, String courseTitle) throws ImproperInputException  {
		this( courseCode );
		setCourseTitle(courseTitle);
	}
	
	public Course(String code, String title, Professor professor) throws ImproperInputException   {
		this(code,title);
		this.professor = professor;
}	
	/*
	 * equals(Course course): boolean
	 * */
	public boolean equals( Course course) {
		if(courseCode.equals(course.courseCode)
				&& courseTitle.equals(course.courseTitle)
				&& professor.getFirstName().equals(course.getProfessor().getFirstName())
				&& professor.getLastName().equals(course.getProfessor().getLastName())
				&& professor.getmiddleName().equals(course.getProfessor().getmiddleName())) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * toString(): String
	 * */
	public String toString() {
		System.out.println("Course code: " + getCourseCode());
		System.out.println("Course Title: " + getCourseTitle());
		System.out.println("Professor: " + getProfessor().getFirstName() + " " + getProfessor().getLastName());
		return getCourseCode() + " " + getCourseTitle() + " " + getProfessor().getFirstName() + " " 
		+ getProfessor().getmiddleName() + " " + getProfessor().getLastName() +"\n";
	}
}
