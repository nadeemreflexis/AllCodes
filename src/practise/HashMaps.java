package practise;

import java.util.HashMap;
import java.util.Map;

public class HashMaps 
{
	static HashMap<String, String> map = new HashMap<String, String>();
	
	static {
		map.put("sun", "yellow");
		map.put("moon", "white");
		map.put("sun", "hot");
		map.put("moon", "cold");
		map.put("banana", "yellow");
		}

	public static void main(String[] args) 
	{
		for (Map.Entry<String, String> mapEntry: map.entrySet()) {
			System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());
			}
			}

	}


