public class bitmanipulations{
    // getIthBIt
    public static int getIthBit (int n , int i) {
int bitMask = 1<<i;
if ((n & bitMask) == 0) {
    return 0 ;
} else {
    return 1;
}
}

// setIthBit code 

public static int setIthBit (int n , int i) {
    int bitMask = 1<<i;
    return n | bitMask ;

}

// clearIthBit
 public static int clearIthBit (int n , int i) {
    int bitMask = ~ (1<<i);
    return n & bitMask ;
 }
 // clearBitsInRange
 public static int clearBitsInRange (int n , int i , int j) {
    int a = ((~0)<<(j+1));
    int b = (1<<i)-1;
    int bitMask = a | b;
    return n & bitMask;
 }

 //Google interview question 

 public static int countSetBits (int n) {
    int count = 0;
    while(n>0) {
        if((n & 1) != 0) {
           count ++;

        }
         n = n>>1;
    }
    return count;


 }
public static void main (String[] args) {
    System.out.println(countSetBits(16));
}
}

