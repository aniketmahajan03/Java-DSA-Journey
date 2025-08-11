public class Solutions{
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
public static void main (String[] args) {
    System.out.println(clearIthBit(10,1)) ;
}
}

