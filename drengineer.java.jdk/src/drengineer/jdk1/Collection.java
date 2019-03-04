package drengineer.jdk1;

import java.util.HashSet;
import java.util.Set;

import drengineer.Sample;;

public class Collection {
	// Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList,
	// LinkedList, Vector, Collections, Arrays, AbstractCollection


	Set<Sample> sampleSet = new HashSet<>();
	
	public Set<Sample> setSampleSet() {
		
		sampleSet.add(new Sample(1, "apple"));
		sampleSet.add(new Sample(2, "banana"));
	
		return sampleSet;
	}
	
	

}
