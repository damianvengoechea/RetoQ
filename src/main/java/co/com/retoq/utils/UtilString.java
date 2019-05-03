package co.com.retoq.utils;

import java.util.List;

public class UtilString {
	
	   public int splitString(String priceHotel){
	        String[] partString = priceHotel.split("\\$");
	        String part2 = partString[1];
	        return Integer.parseInt(part2);
	    }

	    public int splitNightSleep(String nightsNumber){
	        String[] partString = nightsNumber.split(" night");
	        String part1 = partString[0];
	        return Integer.parseInt(part1);
	    }

	    public String valueInList(List<Integer> priceHotels){
	        int value = priceHotels.get(0);
	        int position = 0;
	        for(int i = 0; i < priceHotels.size(); i++){
	            if(value < priceHotels.get(i)){
	            	value = value;
	            }else{
	                value = priceHotels.get(i);
	                position = i;
	            }
	        }
	        return value+" "+position;
	    }
}
