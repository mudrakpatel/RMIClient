package Mandeep.Singh.asgn1.data;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

import mudrak.patel.asgn1.dto.Course;
import mudrak.patel.asgn1.exceptions.CourseNotFoundException;
import mudrak.patel.asgn1.exceptions.DuplicateCourseException;

//import Mandeep.Singh.asgn1.dto.Course;
//import exceptions.CourseNotFoundException;
//import exceptions.DuplicateCourseException;

public interface CourseCatalog extends Remote
{
	public Course getCourse(String courseCode) throws CourseNotFoundException,RemoteException;
	
	public Course addCourse(Course course) throws DuplicateCourseException,RemoteException;
	
	public Course deleteCourse(String courseCode) throws CourseNotFoundException,RemoteException;
	
	public Course updateCourse(Course course) throws CourseNotFoundException,RemoteException;
	
	//public Collection<Course> getAllCourses();
}
