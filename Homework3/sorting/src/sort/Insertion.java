package sort;

public class Insertion{

	public static int desCounter = 0;
	public static int asCounter = 0;
	public static int asCounterFinal;
	public static int desCounterFinal;

  
  public static int[] descending(int[] array){
    int itemsSorted;
    int currentNum;
    int i;  

    for (itemsSorted = 1; itemsSorted < array.length; itemsSorted++){  //iterate through array
      currentNum = array[itemsSorted]; //sets the number we are sorting with next index
      desCounter++;
	for(i = itemsSorted - 1; (i >= 0) && (array[i] < currentNum); i--){
        array[ i+1 ] = array[i];
      desCounter++;
      }
    array[ i+1 ] = currentNum;
      desCounter++;
    }
     desCounterFinal = desCounter;
     desCounter = 0;
 
    return array;
  }

public static int[] ascending(int[] array){
  int i, j, newValue;
  for (i = 1; i < array.length; i++) {
    newValue = array[i];
   asCounter++;
    j = i;
   asCounter++;
    while (j > 0 && array[j - 1] > newValue) {
      array[j] = array[j - 1];
    asCounter++;
      j--;
    }
    array[j] = newValue;
  }

  asCounterFinal = asCounter;
  asCounter = 0;
  return array;

}
}
