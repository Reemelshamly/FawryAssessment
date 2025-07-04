package FawryAssesment;

import java.util.ArrayList;

public class shipmentservice {

	    public void ship(ArrayList<ship> items) {
	        System.out.println("** Shipment notice **");
	        
	        ArrayList<String> print = new ArrayList<>();
	        double totalWeight = 0;

	        for (int i = 0; i < items.size(); i++) {
	            ship current = items.get(i);
	            String currentName = current.getName();

	         
	            if (!print.contains(currentName)) {
	                int count = 0;
	                for (int j = 0; j < items.size(); j++) {
	                    if (items.get(j).getName().equals(currentName)) {
	                        count++;
	                    }
	                }
	                System.out.println(count + "x " + currentName);
	                print.add(currentName);
	            }

	            totalWeight += current.getWeight();
	        }

	        System.out.printf("total package weight %.1fkg\n", totalWeight);
	    }
	}


