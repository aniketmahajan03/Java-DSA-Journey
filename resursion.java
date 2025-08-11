//decreasing order
public class resursion {
    public static void printDec (int n){
       if (n == 1) {
        System.out.println(n);
        return ;
      }
       System.out.print(n+" ");
       printDec(n-1);
    }

    //increasing order
    public static void printInc (int a) {
      if (a == 1){
        System.out.println(a+" ");
        return;
      }
      printInc (a-1);
      System.out.println(a+" ");
    }

    // factorial code
    public static int fact(int n) {
      if (n==0) {
        return 1;
      }
      int fnm1 = fact(n-1);
      int fn = n * fact(n-1);
      return fn;
    } 

    // natural numbers code
    public static int calcSum(int n) {
      if (n==1) {
        return 1;
      }
      int snm1 = calcSum(n-1);
      int sn = n + snm1;
      return sn;
    }
     
    // fibnFibonacci code
    public static int fib(int n) {
      if (n == 0 || n == 1) {
        return n;
      }
      int fnm1 = fib(n-1);
      int fnm2 = fib(n-2);
      int fn = fnm1 + fnm2;
      return fn;
    }
     //issorted array code
    public static boolean isSorted (int arr[] , int i) {
      if(i == arr.length-1) {
        return true;
      }
      if(arr[i] > arr[i+1]) {
        return false;
      }
      return isSorted(arr,i+1);
      }

      // First occurence code
      public static int firstOccurence(int arr[] , int key , int i) {
      if(i == arr.length) {
        return -1;
      }
      if(arr[i] == key) {
        return i;
      }
      return firstOccurence(arr,key,i+1);
    }
    
     //last Occurence
    public static int lastOccurence(int arr[] , int key , int i) {
      if(i == arr.length){
        return -1;
      }
      int isFound = lastOccurence(arr,key,i+1);
      if (isFound == -1 && arr[i] == key){
        return i;
      }
      return isFound;
    }
        // removeduplicate code 
        public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
          if (idx == str.length()) {
              System.out.println(newStr.toString());  // Print the string version of StringBuilder
              return;
          }
          
          char currChar = str.charAt(idx);
          if (map[currChar - 'a'] == true) {
              // Skip the current character if it's already in the map
              removeDuplicates(str, idx + 1, newStr, map);
          } else {
              // Mark the current character and add it to newStr
              map[currChar - 'a'] = true;
              removeDuplicates(str, idx + 1, newStr.append(currChar), map);
          }
      }
        // without consicative 1s code asked in paytm interview 
      public static void printBinStrings(int n, int lastplace, String str){
        if(n==0){
          System.out.println(str);
          return;
        }
        printBinStrings(n-1, 0, str+"0");  
        if(lastplace==0){
          printBinStrings(n-1, 1 , str+"1");
        }
      }
  
      public static void main(String args[]) {
        printBinStrings(5, 0, new String(""));
          // String str = "aniketmahajan";
          // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
      }
  }
  
