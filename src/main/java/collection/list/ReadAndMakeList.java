package collection.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadAndMakeList {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		
		try {
			File file = new File("D:\\one piece\\Akshay.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader buff = new BufferedReader(filereader);
			
			String line;
			while((line = buff.readLine())!=null) {
				list.add(line);
			}
			buff.close();
			filereader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		list.stream().filter(s->s.startsWith("A")).forEach(s->System.out.println(s));
	}

}
