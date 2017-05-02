import sort.*;
import java.util.Random;

public class SortingTest {


  private enum SortDirection {
    ASCENDING,
    DESCENDING
  }
  
  public static void main(String[] args) {              
    System.out.println("Average assignments in 10 runs of Bubble sort Ascending for each case:");
    System.out.println("length 10: " + testSorters("Bubble",SortDirection.ASCENDING,10));
    System.out.println("length 100: " + testSorters("Bubble",SortDirection.ASCENDING,100));
    System.out.println("length 1000: " + testSorters("Bubble",SortDirection.ASCENDING,1000));
 

    System.out.println("Average assignments in 10 runs of Bubble sort Descending for each case:");
    System.out.println("length 10: " + testSorters("Bubble",SortDirection.DESCENDING,10));
    System.out.println("length 100: " + testSorters("Bubble",SortDirection.DESCENDING,100));
    System.out.println("length 1000: " + testSorters("Bubble",SortDirection.DESCENDING,1000));  

    System.out.println("Average assignments in 10 runs of Selection sort Ascending for each case:");
    System.out.println("length 10: " + testSorters("Selection",SortDirection.ASCENDING,10));
    System.out.println("length 100: " + testSorters("Selection",SortDirection.ASCENDING,100));
    System.out.println("length 1000: " + testSorters("Selection",SortDirection.ASCENDING,1000));

    System.out.println("Average assignments in 10 runs of Selection sort Descending for each case:");
    System.out.println("length 10: " + testSorters("Selection",SortDirection.DESCENDING,10));
    System.out.println("length 100: " + testSorters("Selection",SortDirection.DESCENDING,100));
    System.out.println("length 1000: " + testSorters("Selection",SortDirection.DESCENDING,1000));     
    
    System.out.println("Average assignments in 10 runs of Insertion sort Ascending for each case:");
    System.out.println("length 10: " + testSorters("Insertion",SortDirection.ASCENDING,10));
    System.out.println("length 100: " + testSorters("Insertion",SortDirection.ASCENDING,100));
    System.out.println("length 1000: " + testSorters("Insertion",SortDirection.ASCENDING,1000));

    
    System.out.println("Average assignments in 10 runs of Insertion sort Descending for each case:");
    System.out.println("length 10: " + testSorters("Insertion",SortDirection.DESCENDING,10));
    System.out.println("length 100: " + testSorters("Insertion",SortDirection.DESCENDING,100));
    System.out.println("length 1000: " + testSorters("Insertion",SortDirection.DESCENDING,1000));    
   }
  
  public static int testSorters(String method, SortDirection direction, int length) {
    Random random = new Random(); 	  
    int countArray[]=new int[10];
    int countTotal = 0;

      
    if(method == "Insertion"){
	 for (int i = 0; i < 10; i++){
           int[] myArray = new int[length];
           for (int y = 0; y < length; y++){
             myArray[y] = random.nextInt();
           }
     
	  if(direction == SortingTest.SortDirection.ASCENDING){
	  Insertion.ascending(myArray);
	  countArray[i] = Insertion.asCounterFinal;
	   }      
	if(direction == SortingTest.SortDirection.DESCENDING){
	  Insertion.descending(myArray);
	  countArray[i] = Insertion.desCounterFinal;
	}
      
        for(int x=0; x < 10; x++){
      countTotal = countArray[x] + countTotal;
    }

    int avg = countTotal/countArray.length;
    countTotal = 0;

    return avg;

     }
     }


    if(method == "Bubble"){

      for (int i = 0; i < 10; i++){
    int[] myArray = new int[length];
    for (int y = 0; y < length; y++){
    myArray[y] = random.nextInt();
     }


      if(direction == SortingTest.SortDirection.ASCENDING){
	  Bubble.ascending(myArray);
	  countArray[i] = Bubble.asCounterFinal;   
	}        
	if(direction == SortingTest.SortDirection.DESCENDING){
	  Bubble.descending(myArray);
	  countArray[i] = Bubble.desCounterFinal;
	}
      
           for(int b=0; b < 10; b++){
      countTotal = countArray[b] + countTotal;
    }

    int avg = countTotal/countArray.length;
    countTotal = 0;

    return avg;


      }
     }


    if(method == "Selection"){
       for (int i = 0; i < 10; i++){
       int[] myArray = new int[length];
        for (int y = 0; y < length; y++){
        myArray[y] = random.nextInt();
    }

      if(direction == SortingTest.SortDirection.ASCENDING){
	  Selection.ascending(myArray);
	  countArray[i] = Selection.asCounterFinal;   
	}  
	if(direction == SortingTest.SortDirection.DESCENDING){
	  Selection.descending(myArray);
	  countArray[i] = Selection.desCounterFinal;
	}

      int avg = countTotal/countArray.length;
    countTotal = 0;

    return avg;
      }
    }
   }

    
}

  
  
