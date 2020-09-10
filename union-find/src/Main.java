import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scanner.nextInt();

        quickFind(N);

        quickUnion(N);

        weightedQuickUnion(N);

        weightedPathCompression(N);

    }

    private static void weightedPathCompression(int n) {
        WeightedPathCompressionUF weightedPathCompressionUF = new WeightedPathCompressionUF(n);

        weightedPathCompressionUF.union(0, 5);
        weightedPathCompressionUF.union(2, 5);
        weightedPathCompressionUF.union(3, 6);
        weightedPathCompressionUF.union(8, 9);

        System.out.println("Main.weightedPathCompression");
        System.out.println("Connected (3, 9): " + weightedPathCompressionUF.connected(3, 9));
    }

    private static void weightedQuickUnion(int n) {
        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(n);

        weightedQuickUnionUF.union(0, 5);
        weightedQuickUnionUF.union(2, 5);
        weightedQuickUnionUF.union(3, 6);
        weightedQuickUnionUF.union(8, 9);

        System.out.println("Main.weightedQuickUnion");
        System.out.println("Connected (3, 9): " + weightedQuickUnionUF.connected(3, 9));
    }

    private static void quickUnion(int n) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(n);

        quickUnionUF.union(0, 5);
        quickUnionUF.union(1, 5);
        quickUnionUF.union(1, 6);
        quickUnionUF.union(5, 9);

        System.out.println("Main.quickUnion");
        System.out.println("Connected (0, 9): " + quickUnionUF.connected(0, 9));
    }

    private static void quickFind(int N) {
        QuickFindUF quickFindUF = new QuickFindUF(N);

        quickFindUF.union(0, 5);
        quickFindUF.union(1, 5);
        quickFindUF.union(1, 6);
        quickFindUF.union(5, 9);

        System.out.println("Main.quickFind");
        System.out.println("Connected (0, 9): " + quickFindUF.connected(0, 9));
    }
}
