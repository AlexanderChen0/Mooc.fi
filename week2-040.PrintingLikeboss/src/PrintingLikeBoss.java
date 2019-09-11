public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        int i = 0;
        while(i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int count = 0;
        int whiteSpace = size - 1;
        int stars = 1;
        while(count < size){
            printWhitespaces(whiteSpace);
            printStars(stars);
            whiteSpace--;
            stars++;
            count++;
        }
    }

    public static void xmasTree(int height) {
        int count = 0;
        int i = height - 1;
        int j = 1;
        while(count < height){
            printWhitespaces(i);
            printStars(j);
            i--;
            j = j + 2;
            count++;
        }
        printWhitespaces(height - 2);
        printStars(3);
        printWhitespaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(3);
        System.out.println("---");
        xmasTree(4);
    }
}
