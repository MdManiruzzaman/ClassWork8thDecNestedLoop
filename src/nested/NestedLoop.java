package nested;

public class NestedLoop {
    public static void main(String[] args) {
        System.out.println("Answer following 7 multiple choice questions");
        for(int i = 1; i<=7; i++ ){
            System.out.print(i);
            for(int j = 0; j<1; j++){

                System.out.print(" A");
                System.out.print(" B");
                System.out.print(" B");
                System.out.print(" D");
            }
            System.out.println();
        }
    }
}
