import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ages = {12, 7, 2, 1, 0, 78, 65, 95};
        InsertionSort urutan = new InsertionSort();

        System.out.print("Acak : ");
        for (int umur : ages) {
            System.out.print(umur + " ");
        }

        urutan.setData(ages);
        urutan.InsertionSort();

        System.out.print("\nUrut : ");
        for (int umur: ages) {
            System.out.print(umur + " ");
        }

        System.out.print("\nTekan apa saja untuk keluar...");
        Scanner exit = new Scanner(System.in);
        exit.nextLine();
    }
}