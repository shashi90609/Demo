package Selenium.excel;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReadText {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\temp\\shashi.txt");
		BufferedReader bf= new BufferedReader(fr);
		String line=null;
		String s= "shashi";
		int count=0;
		int totalWords=0;
		line = bf.readLine();
		while(line != null)
		{
			String tmp[] =line.split(" ");
			for(int i=0;i<tmp.length;i++)
			{
				if(s.equals(tmp[i]))
				{
					count++;
				}
			}
			
			line = bf.readLine();
			totalWords = totalWords+tmp.length;
			
		}
		System.out.println(count);
		System.out.println(totalWords);
		
		
		/*String s= "shashi jhjkhj fjgj fjfj"
		for(int i=0;i<)
			Arraylist al= new Arrylist[];*/

	}

}
