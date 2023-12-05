package DSA;

public class userBinaryTree {
    public static void main(String[] args) {
        BinaryTree b= new BinaryTree();
        b.insert_levelwise(10);
        b.insert_levelwise(20);
        b.insert_levelwise(30);
        b.insert_levelwise(40);
        System.out.println("Root node = "+b.getRoot().getData());
        System.out.print("Level wise traverse = ");
        b.levelwise_traverse();
        System.out.println();
        System.out.println("Level count = "+b.level_count());
    }
}
