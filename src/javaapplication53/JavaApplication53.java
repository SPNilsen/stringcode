/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seannils1
 */
public class JavaApplication53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> strings = new ArrayList();

                  String myString = null;
        strings.add(myString);
        
        strings.add("There");
        

        
        strings.add("are");
        


        strings.add("four");
              
        
        
        Boolean result = doesListHaveGaps(strings);

        System.out.println("There result :" + result);
    }

    /**
     *
     * @param modifierCodeList
     * @return FALSE if there are Gaps; TRUE if there are not
     */
    public static Boolean doesListHaveGaps(List<String> modifierCodeList) {

        //Set to TRUE when a NULL is encountered, but only if a previous value had been a Not Null
        Boolean previousValue = Boolean.FALSE;
        Boolean nextValue = Boolean.FALSE;

        //check for no nulls in the middle; nulls are ok at the front and back
        //Start at index 1 and go to index -1 to skip the first and last since we don't care
        for (int i = 0; i < modifierCodeList.size(); i++) {
            if (previousValue && modifierCodeList.get(i) == null) {
                //if the previous pass was a null value and this value is a null value check the remainder of the List
                
                //Build SubString List
                List<String> subStrings = new ArrayList();
                for(int s = i; s < modifierCodeList.size(); s++){
                    subStrings.add(modifierCodeList.get(s));
                }
                
                //Check for only Null Values - since we know that the previous value was a String and the current value is null, then if all the rest are null, then return TRUE
                for (int j = 0; j < subStrings.size(); j++){
                    System.out.println("Is Null Check");
                    if(subStrings.get(j) != null){
                        return Boolean.FALSE;
                    } else {
                        System.out.println("Is Null");
                    }
                }
                
            } else {
                //if this current value has been evaluated to be a valid String, set the 'previousValue' to TRUE; this allows the IF check to test both conditions
                previousValue = Boolean.TRUE;
            }
        }
        return Boolean.TRUE;
    }
}
