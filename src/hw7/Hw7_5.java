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
		Object i ; 
		ArrayList<Object> list1 = new ArrayList<>();
		while(true) {
			try {
				list1.add(ois.readObject());
			}catch(EOFException e) {
				break;
			}
		}
		for(Object obj: list1) {
			if(obj instanceof Cat) {
				((Cat)obj).speak();
			}else if(obj instanceof Dog) {
				((Dog)obj).speak();
			}			
		}
		//直接讀取輸出會出錯?
//		try {
//			while(true) {					
//				if((i = ois.readObject()) instanceof Dog) {
//					((Dog)i).speak();
//				}
//				else if((i = ois.readObject()) instanceof Cat) {
//					((Cat)i).speak();
//				}
//			}
			
//		}catch(EOFException e ) {
//			System.out.println("已讀取完畢");
//		}
		ois.close();
		fis.close();
	}		
}
