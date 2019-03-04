package drengineer.jdk5;

import java.util.Set;

import drengineer.Sample;
import drengineer.jdk1.Collection;

public class ForEach {

	final static char[] ABC = {97,98,99};
	
	public static void main(String[] args) {
		for (char string : ABC) {
			System.out.println(string);
		}
		
		Set<Sample> setSample = new Collection().setSampleSet();
		for (Sample string : setSample) {
			System.out.println(string.toString());
		}
	}
	
}
