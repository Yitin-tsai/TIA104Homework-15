package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Hw7_4 {
	public static void main(String[] args) throws IOException {
		Speakable[] obj = new Speakable[4];
		obj[0] = new Cat("tiger");
		obj[1] = new Cat("lion");
		obj[2] = new Dog("chihuahua");
		obj[3] = new Dog("wolf");
			
		File dir = new File("C:\\data\\Object.ser");
		if (!dir.exists()) {
			dir.getParentFile().mkdir();
		}
	
		FileOutputStream fos = new FileOutputStream(dir);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i=0 ; i<obj.length ; i++) {
			oos.writeObject(obj[i]);
			System.out.println(oos.getClass());
		}
		
		oos.close();
		fos.close();
	}
}
