package hw7;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Hw7_1 {
	

	
	public static void main(String[] args) throws IOException {
		int count = 0 , count1 = 0 , i ;
		String s ; 
		File fis = new File("Sample.txt");
		FileReader fr = new FileReader(fis);
		FileReader fr2 = new FileReader(fis);
		BufferedReader br = new BufferedReader(fr2);
		
		while((i=fr.read())!= -1) {
			count++;
		}
		while((s = br.readLine())!= null) {
			if(s.length()>0) {
				count1++ ;
			}
		}
		System.out.println("共有" + fis.length() +"個位元組");
		System.out.println("共有" +  count + "個字元");
		System.out.println("共有" + count1 +"列資料");
		fr.close();
		fr2.close();
		br.close();
	}
}
