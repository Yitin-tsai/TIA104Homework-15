package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Hw7_5 {
	public static void main(String[] args ) throws IOException, ClassNotFoundException {
		File dir = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(dir);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while(true) {
				((Speakable)ois.readObject()).speak();
			}
		}catch(EOFException e ) {
			System.out.println("資料讀取完畢!");
		}
		
		
//		Object i ; 
//		ArrayList<Object> list1 = new ArrayList<>();
//		while(true) {
//			try {
//				list1.add(ois.readObject());
//			}catch(EOFException e) {
//				break;
//			}
//		}
//		for(Object obj: list1) {
//			if(obj instanceof Cat) {
//				((Cat)obj).speak();
//			}else if(obj instanceof Dog) {
//				((Dog)obj).speak();
//			}			
//		}
	
		ois.close();
		fis.close();
	}		
}
