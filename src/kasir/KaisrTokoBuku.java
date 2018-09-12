package kasir;

import java.util.Scanner;

public class KaisrTokoBuku {

    public static void main(String[] args) {
        program kasir = new program();
        kasir.pertama();
    }
}

class program {

    public void pertama() {
        int jumlah, harga, kode_brg, total, diskonA, diskonB, diskonC, kembali, totalA, totalB, totalC;
        int diskon = 10;
        String nama;
        Scanner masuk = new Scanner(System.in);
        do {
            System.out.println("~~WELCOME TO STORE~~");
            System.out.print("Masukkan Nama : ");
            nama = masuk.next();
            System.out.print("List kode barang : \n1.001    buku \n2.002    pensil \n3.003    Penggaris \n4.004    Penghapus ");
            System.out.print("\nMasukkan kode barang : ");
            kode_brg = masuk.nextInt();
            System.out.print("Jumlah Barang : ");
            jumlah = masuk.nextInt();
            System.out.print("Harga Barang Satuan : Rp. ");
            harga = masuk.nextInt();
            total = jumlah * harga;
            
            if (total > 500000) {
                diskonC = (int) (total * 0.5);
                totalC = total - diskonC;
                System.out.println("Total : Rp. " + totalC);
                
            }else if (total > 200000) {
                diskonB = (int) (total * 0.2);
                totalB = total - diskonB;
                System.out.println("Total : Rp. " + totalB);
                
            }else if (total > 100000) {
                diskonA = (int) (total * 0.1);
                totalA = total - diskonA;
                System.out.println("Total : Rp. " + totalA);
            }

            System.out.print(nama + ", Ingin membeli barang lain? (y=1, n=2)");
            kembali = masuk.nextInt();

        } while (kembali == 1);
        System.out.print("\n ~~~TERIMA KASIH~~~");
    }
}