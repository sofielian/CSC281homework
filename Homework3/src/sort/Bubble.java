/**
 * 
 * @author Arianna Liles, Brianna Ngo, Medina Nurmanova
 *
 */
package sort; 

public class Bubble{

	public static int desCounter = 0;
	public static int asCounter = 0;
	public static int asCounterFinal;
	public static int desCounterFinal;
	
  public static int[] descending(int[] intArray) {
    int n = intArray.length;
    int temp = 0;
               
    for(int i=0; i < n; i++){
      for(int j=1; j < (n-i); j++){
        if(intArray[j-1] < intArray[j]){
          temp = intArray[j-1];
	desCounter++;
          intArray[j-1] = intArray[j];
	desCounter++;
          intArray[j] = temp;
	desCounter++;
        }                      
      }
    }

    desCounterFinal = desCounter;
    desCounter = 0;

    return intArray;
      
  }



  public static int[] ascending(int[] intArray) {
	  int n = intArray.length;
	  int temp = 0;
	              
	  for(int i=0; i < n; i++){
	      for(int j=1; j < (n-i); j++){
	        if(intArray[j-1] > intArray[j]){
	          temp = intArray[j];
		  asCounter++;
	          intArray[j] = intArray[j - 1];
		  asCounter++;
	          intArray[j - 1] = temp;
    		  asCounter++;
	        }                      
	      }
	    }
	 	 asCounterFinal = asCounter;
    		 asCounter = 0;

    		 return intArray;
	     
  }
}
 
