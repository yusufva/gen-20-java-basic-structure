import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Print Class Variable");
        Variabel variabel = new Variabel();
        variabel.PrintVariabel();
        System.out.println();

        System.out.println("Aritmatika sederhana");
        Arithmetics aritmatika = new Arithmetics();
        Scanner arit1 = new Scanner(System.in);
        System.out.print("masukkan variabel 1 untuk ditambahkan: ");
        int x = arit1.nextInt();
        Scanner arit2 = new Scanner(System.in);
        System.out.print("masukkan variabel 2 untuk ditambahkan: ");
        int y = arit2.nextInt();
        System.out.println("Hasil dari aritmatika pertambahan: " + aritmatika.Addition(x,y));
        System.out.println();

        System.out.println("Membuat Segitiga");
        Triangle segitiga = new Triangle();
        Scanner row = new Scanner(System.in);
        System.out.print("masukkan jumlah baris untuk membuat segitiga: ");
        int rows = row.nextInt();
        segitiga.Create(rows);
        System.out.println();

        System.out.println("Ganjil/Genap");
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan angka pertama: ");
        int intA = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.print("masukkan angka kedua: ");
        int intB = b.nextInt();

        OddEven gangen = new OddEven();
        System.out.print("hasil dari penjumlahan merupakan angka: ");
        System.out.println(gangen.Determine(intA,intB));
    }
}