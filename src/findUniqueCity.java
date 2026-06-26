import java.util.*;

public class findUniqueCity {

   static  List<String> findDuplicates(String[] str) {
        Map<String, Integer> cities = new HashMap<>();
        List<String> uniqueCities = new ArrayList<>();
       for(String city : str) {
           cities.put(city,cities.getOrDefault(city,0)+1);

       }
       for(Map.Entry<String,Integer> c: cities.entrySet()) {
           if(c.getValue() == 1){
               uniqueCities.add(c.getKey());
           }


       }
       return uniqueCities;


    }

    public static void main(String[] args) {
        String [] cityNames = {"vadodara","delhi","mumbai","patna","vadodara","delhi"};
        List<String> cities = findDuplicates(cityNames);
        System.out.println(cities);



    }
}

