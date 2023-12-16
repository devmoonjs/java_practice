package org.opentutorials.javatutorials.exception;
import java.io.*;

class B{
	void run() throws IOException, FileNotFoundException{
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("out.txt"));
		input = bReader.readLine();
		System.out.println(input);
	}
}
class C{
	void run() throws IOException, FileNotFoundException {
		B b = new B();
		b.run();

	}
}


public class ThrowException {

	public static void main(String[] args) {
		C c = new C();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("찾을 수 없는 파일");

	}

}
