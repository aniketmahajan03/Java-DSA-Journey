public class ArrayPr {
    public static int linearSearch(String items[], String key) {
        for(int i = 0; i < items.length; i++) {
            if(items[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
        String menu[] = {"kaju curry", "dosa", "masala papad", "roti"};
        String key = "dosa";

        int index = linearSearch(menu, key);
        if(index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
