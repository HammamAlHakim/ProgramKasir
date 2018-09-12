package program_kasir;

import java.util.Scanner;

public class ProgramKasir {

    public static void main(String[] args) {
        Scanner ini = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI TOKO BUKU DAN ATK 'BERKAH'\n");
        String namaKasir = "Hammam Al-Hakim / XRPL 6 / 27";
        System.out.println("Nama Kasir : " + namaKasir);
        System.out.print("===============================================================\n");
        
        System.out.print("\nKode Barang : ");
        int kodeBarang = ini.nextInt();
        String namaBarang[] = {"Pensil 2b","Buku Tulis (isi 6)","Bulpoin","Penghapus","Jangka"};
        int hargaBarang = 0;
        int diskon[] = {10,20,50};
        switch (kodeBarang) {
            case 1:
                hargaBarang = 2500;
                System.out.println("Nama Barang : " + namaBarang[0]);
                System.out.println("Harga Barang : " + hargaBarang);
                break;
            case 2:
                hargaBarang = 20000;
                System.out.println("Nama Barang : " + namaBarang[1]);
                System.out.println("Harga Barang : " + hargaBarang);
                break;
            case 3:
                hargaBarang = 2500;
                System.out.println("Nama Barang : " + namaBarang[2]);
                System.out.println("Harga Barang : " + hargaBarang);
                break;
            case 4:
                hargaBarang = 1500;
                System.out.println("Nama Barang : " + namaBarang[3]);
                System.out.println("Harga Barang : " + hargaBarang);
                break;
            case 5:
                hargaBarang = 5000;
                System.out.println("Nama Barang : " + namaBarang[4]);
                System.out.println("Harga Barang : " + hargaBarang);
                break;
            default:
                break;
        }
        System.out.print("Jumlah Barang : ");
        int jumlahBarang = ini.nextInt();
        int hargaTotal = hargaBarang * jumlahBarang;
        int total, bayar;
        if(hargaTotal > 500000){
            total = hargaTotal * diskon[2] / 100; //Diskon 10%
            bayar = hargaTotal - total;
            System.out.println("Total Harga : Rp" + bayar);
        }else if(hargaTotal > 200000){
            total = hargaTotal * diskon[1] / 100; //Diskon 20%
            bayar = hargaTotal - total;
            System.out.println("Total Harga : Rp" + bayar);
        }else if(hargaTotal > 100000){
            total = hargaTotal * diskon[0] / 100; //Diskon 50%
            bayar = hargaTotal - total;
            System.out.println("Total Harga : Rp" + bayar);
        }else{
            bayar = hargaTotal - 0;
        System.out.println("Total Harga : Rp" + bayar);
        }
        System.out.println("\n===============================================================\n");
        System.out.print("Pembayaran : Rp");
        int uang = ini.nextInt();
        int kembalian = uang - bayar;
        System.out.println("Kembali : Rp" + kembalian);
        System.out.println("\n===============================================================");
        System.out.println("\t\tTERIMAKASIH");
    }

}
