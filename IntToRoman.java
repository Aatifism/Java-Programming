import java.util.Collection;
import java.util.LinkedHashMap;



public class IntToRoman {
    
    public static String intToRoman(int num) {
        
        LinkedHashMap< Integer,String> romanMap = new LinkedHashMap<>();
        romanMap.put( 1000,"M");
        romanMap.put(900,"CM");
        romanMap.put( 500,"D");
        romanMap.put(400,"CD");
        romanMap.put( 100,"C");
        romanMap.put( 90,"XC");
        romanMap.put( 50,"L");
        romanMap.put( 40,"XL");
        romanMap.put( 10,"X");
        romanMap.put(9,"IX");
        romanMap.put( 5,"V");
        romanMap.put( 4,"IV");
        romanMap.put( 1,"I");
        
       
        StringBuilder romanNumeral = new StringBuilder();
        Collection<Integer> values = romanMap.keySet();
       
        for (int entry:values) {
            while (num >= entry) {
                romanNumeral.append(romanMap.get(entry)); 
                num -= entry;             
            }
        }
     
        return romanNumeral.toString();
      

    }

    public static void main(String[] args) {

        int number = 3174;
       System.out.println("Roman numeral for " + number + " is: " + intToRoman(number));
    }
}
