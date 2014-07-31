package objektfailijatagasi2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class start {

	public static void startimine() throws Exception {
		

		
		String failiaadress=(System.getProperty("user.home")+"\\Desktop\\"+"tudengifail.txt");	
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(failiaadress));
// write a date
objectOutputStream.writeObject(new Date());
// write a boolean
objectOutputStream.writeBoolean(true);
// write a float
objectOutputStream.writeFloat(1.0f);
// the other primitive types and objects can be saved as well
 
// create two students objects and add them in a list. create a course
// object and add the list of students to a list
Student student1 = new Student();
student1.setAge(30);
student1.setName("Student1");
 
Student student2 = new Student();
student2.setAge(31);
student2.setName("Student2");
 
Course course = new Course();
course.setName("Java IO");
List<Student> students = new ArrayList<>();
students.add(student1);
students.add(student2);
course.setStudents(students);
 
// write the course object to the objectoutputstream. This writes the
// object as well all objects that it referes to.
// it writes only those objects that implement serializable
 
objectOutputStream.writeObject(course);
objectOutputStream.flush();
objectOutputStream.close();
 
// the object input stream reads the objects back from the file and
// creates java objects out of them. It recreates all
// references that were present when the objects were written
ObjectInputStream objectInputStream = new ObjectInputStream(
        new FileInputStream(failiaadress));
 
// start getting the objects out in the order in which they were written
Date date = (Date) objectInputStream.readObject();
System.out.println("kuupäev      :"+date);
System.out.println("boolean      :"+objectInputStream.readBoolean());
System.out.println("float        :"+objectInputStream.readFloat());
 
// get the course object
Course readCourse = (Course) objectInputStream.readObject();
System.out.println("kursus       :"+readCourse.getName());
Student student1Read = readCourse.getStudents().get(0);
System.out.println("tudeng1 vanus: "+student1Read.getAge());
System.out.println("tudeng1 nimi : "+student1Read.getName());
Student student2Read = readCourse.getStudents().get(1);
System.out.println("tudeng2 vanus: "+student2Read.getAge());
System.out.println("tudeng2 nimi : "+student2Read.getName());
objectInputStream.close();
		
		
		
		
		
	}

}
