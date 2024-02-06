package corejavaconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestList {

	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4);
	Consumer<Integer> consumer = (t)-> System.out.println(t);
	list.forEach(consumer);

	}

}
