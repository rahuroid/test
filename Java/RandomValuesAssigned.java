import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomValues {
	
	public static void main(String a[]){
		System.out.println("RandomValues");
		
		int value = 999;   
		ArrayList<String> names = new ArrayList<>();
		names.add("r");
		names.add("a");
		names.add("h");
		names.add("u");		
		names.add("r1");
		names.add("a2");
		names.add("h3");
		names.add("u");		
		
		HashMap<String, Integer> values = new HashMap<>();
		for(int j =0; j <= names.size()-1; j++){
			 values.put(names.get(j), 0);
		}	 
		
		Random randomGenerator = new Random();
		for(int i =values.size()-1; i >= 0; i--){
			int random = randomGenerator.nextInt(value);  
					
			if(0 == i){  
				values.put(names.get(i), value);				
			}else{
				value = value-random;	
				System.out.println(random+"---------random");
				values.put(names.get(i), random);				 
			}
		}
		
		int justTest = 0;
		for(int j =0; j <= values.size()-1; j++){
			System.out.println(j+" - data "+values.get(names.get(j)));
			justTest += values.get(names.get(j));			
		}
		System.out.println("Total Score: "+justTest);
	}

}
