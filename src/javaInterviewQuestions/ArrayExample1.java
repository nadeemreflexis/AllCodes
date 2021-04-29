package javaInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ArrayExample1 {

	public static void main(String[] args) 
	{
		String[] movies= {"Spiderman","Ironman","Hulk","Avengers","Antman"};
		System.out.println(Arrays.toString(movies));
		List<String> myMovies = Arrays.asList(movies);
		System.out.println(myMovies);
	   

    }
}
