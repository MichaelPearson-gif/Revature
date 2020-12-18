package eg1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo1 {

	public static void main(String[] args) {
		
		// Remove all K,V pairs whose value is null or whose key is divisible by 10
		
		Map<Integer, String> hm = new HashMap<>();
		hm.put(100, "Java"); //insert
		hm.put(100, "openjdk"); //update
		hm.put(199, "Java");
		hm.put(300, "Java");
		hm.put(900, null);
		hm.put(1000, null);
		hm.put(22, "Java");
//		hm.put(null, "driver");
		hm.put(45, null);
		hm.put(800, "Jee");
		hm.put(500, "Jse");
		hm.put(400, "Jee");
		System.out.println("Map before deletion");
		System.out.println("hm = " + hm);
		
//		for (Entry<Integer, String> e : hm.entrySet()) {
//			if(e.getValue() == null || e.getKey() % 10 == 0) {
//				hm.remove(e.getKey());
//			}
//		}
		
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator(); // list.iterator() set.iterator() queue.iterator()
		while(i.hasNext()) {
				Entry<Integer, String> e = i.next(); // read and increment so use it only once in your loop
				if(e.getValue() == null || e.getKey() % 10 == 0) {
					i.remove();
				}
		}
		
		System.out.println("Map after deletion");
		System.out.println("hm = " + hm);

	}
/*
 *  Enumerator - read operation from top to bottom
 *  Iterator - read and remove operation from top to bottom (any collection)
 *  ListIterator - read, remove, add from any direction it is only used with List interface.
 */
}
