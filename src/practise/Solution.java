package practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

	 public static List<String> extractData(String hierarchicalData, int level) 
	    {
			return null;
	      
	    }

}

public class Solution extends Result {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String[] tokens = input.split("::");
        String content = tokens[0];
        int level = Integer.parseInt(tokens[1]);
        
        
        List<String> lines = Solution.extractData(content.replace("\\n", "\n"), level);
        List<String> finalLines = new ArrayList<>(); 
        for(String line: lines) {
            finalLines.add(line.trim());
        }
                                              
        System.out.print(finalLines);
       
    }

}
