/* 
*   I go through all Java array aspects I can think of
*/

//Ways to start an array:

int[] numbers = {12, 15, 32, 12, 02, 33, 123, 445, 120, 32}; //Declare and add known value
String[] names; // I create an array but dont start it. 
String[] cars = new String[n] //n is the set length of the array.
boolean[][] xx = {{true, false, true},{false, true, false}}; // multi dim. array...
int grid[][] = {{1253, 1232, 1543},
                {12554, 1254, 3254},
                {3542, 12554, 32566}};

/* DEFAULT INITIAL VALUE=
*   numbers are 0, booleans are false and objects like Strings are null...
*/
int temp = 0;
for (int i : numbers){
  temp += i;
}
System.out.println(temp);

for (int i = 0; i < cars.length; i++){
  cars[i] = "CAR";
}

int sum = grid.length;
while (0 != sum){
  sum--;
  System.out.print(grid[sum][0];
  System.out.print(grid[sum][1];
  System.out.print(grid[sum][2];
}

                   
// import java.util.Arrays;
                   
public int[] removeArray(int n, int[] arr){
  int pos = 0;
  int[] temp = new int[arr.length-1]; 
  for ( int i = 0; i < temp.length; i++) {
    if (i != n){
     temp[i] = arr[pos];
    } else {
      pos++;
    }
    return temp[];
  }
  
}
  public int[] switch(int[] temp){
    int[] temp2 = new int[temp.length];
    
    for ( int i : temp ){
      temp2[i] = temp[temp.length-i];
      
    }
    return temp2;
  
  }
                   
                   
