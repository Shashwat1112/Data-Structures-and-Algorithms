package DSA;

public class UserofArrayOperations {
    public static void main(String[] args) {
        ArrayOperations a= new ArrayOperations();
        int ch=11;
        do{
            System.out.println("SELECT OPERATON");
            System.out.println("1. Read");
            System.out.println("2. Write");
            System.out.println("3. Left Shift");
            System.out.println("4. Right Shift");
            System.out.println("5. Left rotate");
            System.out.println("6. Right rotate");
            System.out.println("7. Insert on position");
            System.out.println("8. Deletion from position");
            System.out.println("9. Remove duplicate");
            System.out.println("10. Search an element");
            System.out.println("11. Exit");
        }while(ch!=11);
        System.out.println();
        a.ReadArray();
//        a.leftShift();
//        a.printArray();
//        a.rightShift();
//        a.printArray();
//        a.leftRotate();
//        a.printArray();
//        a.insert_by_pos(2,6);
//        a.printArray();
//        a.insert_by_pos(2,6);
//        a.printArray();
//        a.delete_by_pos(3);
//        a.printArray();
        a.remove_duplicate();
        a.printArray();
    }
}
