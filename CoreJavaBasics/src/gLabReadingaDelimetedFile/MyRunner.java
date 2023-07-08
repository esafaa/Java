package gLabReadingaDelimetedFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyRunner {

	public static void main(String[] args) {
		String path="C:\\Users\\safaa\\Downloads\\cars.csv";
		
	try {
		File file= new File(path);
		Scanner input= new Scanner(file);
		ArrayList<Course> data= new ArrayList<Course>();
		while(input.hasNext()) {
		String line= input.nextLine();
		String[] splitedLine= line.split(",");
		Course cObj= new Course();
		cObj.setCode(splitedLine[0]);
		cObj.setCourse_name( splitedLine[1]);
		cObj.setInstructor_name(splitedLine[2]);
         data.add(cObj);
		}
		for (Course c : data) {
			System.out.println(c.getCode() + " | " + c.getCourse_name() + "|"
			+ c.getInstructor_name());
			System.out.println("===============================");
		}
		
	}catch (FileNotFoundException e) {
		System.out.println("File not found!");
		e.printStackTrace();
	}

	}
}
