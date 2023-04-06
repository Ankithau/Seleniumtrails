import java.util.ArrayList;

import org.testng.annotations.Test;
@Test
public class Stream_methods {
	
	int count;
	public void regular() {

		ArrayList<String>name = new ArrayList<String>();
		name.add("anki");
		name.add("adam");
		name.add("kittu");
		name.add("don");
		
		for(int i=0;i<name.size();i++) {
		String act=name.get(i);
		if(act.startsWith("a")){
			
			count++;
		}
		System.out.println(act);
			
	}
	}
	}
	


