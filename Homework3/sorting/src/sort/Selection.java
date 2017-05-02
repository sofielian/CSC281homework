package sort; 

public class Selection { 

	public static int desCounter = 0;
	public static int asCounter = 0;
	public static int asCounterFinal;
	public static int desCounterFinal;

  public static int[] ascending(int a[]) {
    int n = a.length;
    for (int i = 0; i < n-1; i++) {
      int q = i;
     asCounter++;  
      for (int j = i+1; j < n; j++) {
        if (a[j] < a[q]) {
          q = j; 
     asCounter++;
        } 
      }
    int temp = a[i]; 
    asCounter++;
    a[i] = a[q];
    asCounter++; 
    a[q] = temp; 
    asCounter++; 
    } 

 asCounterFinal = asCounter;
  asCounter = 0;
   return a; 
 } 
  
  public static int[] descending(int a[]) {
	    int n = a.length;
	    for (int i = 0; i < n-1; i++) {
	      int q = i;
	      desCounter++;  
	      for (int j = i+1; j < n; j++) {
	        if (a[j] > a[q]) {
	          q = j; 
	          desCounter++;
	        } 
	      }
	    int temp = a[i]; 
	    desCounter++;
	    a[i] = a[q]; 
	    desCounter++;
	    a[q] = temp;  
	    desCounter++;
	    } 
	 desCounterFinal = desCounter;
     desCounter = 0;
	   return a; 
	 } 
  
} 

//Group 1: Rebecca, Alex, Anna, Layla

