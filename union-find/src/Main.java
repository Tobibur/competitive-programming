import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        quickFind(N);

        quickUnion(N);

        //TODO weighted and weighted path compression

    }

    private static void quickUnion(int n) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(n);

        quickUnionUF.union(0, 5);
        quickUnionUF.union(1, 5);
        quickUnionUF.union(1, 6);
        quickUnionUF.union(5, 9);

        System.out.println("Connected (0, 9): "+ quickUnionUF.connected(0, 9));
    }

    private static void quickFind(int N) {
        QuickFindUF quickFindUF = new QuickFindUF(N);

        quickFindUF.union(0, 5);
        quickFindUF.union(1, 5);
        quickFindUF.union(1, 6);
        quickFindUF.union(5, 9);

        System.out.println("Connected (0, 9): "+ quickFindUF.connected(0, 9));
    }
}
