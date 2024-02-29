import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print Class Variable");
        Variabel.PrintVariabel();
        System.out.println();

        System.out.println("Aritmatika sederhana");
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan variabel 1 untuk ditambahkan: ");
        int x = s.nextInt();
        System.out.print("masukkan variabel 2 untuk ditambahkan: ");
        int y = s.nextInt();
        Arithmetics aritmatika = new Arithmetics(x,y);
        System.out.println("Hasil dari aritmatika pertambahan: " + aritmatika.getResult());
        System.out.println();

        System.out.println("Membuat Segitiga");
        System.out.print("masukkan jumlah baris untuk membuat segitiga: ");
        int rows = s.nextInt();
        Triangle segitiga = new Triangle(rows);
        System.out.println();

        System.out.println("Ganjil/Genap");
        System.out.print("masukkan angka pertama: ");
        int intA = s.nextInt();

        System.out.print("masukkan angka kedua: ");
        int intB = s.nextInt();

        OddEven gangen = new OddEven();
        System.out.print("hasil dari penjumlahan merupakan angka: ");
        System.out.println(gangen.Determine(intA,intB));
    }
}