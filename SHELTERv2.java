package shelterv2;

import java.util.Scanner;

public class SHELTERv2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nama : ADITYA IRVAN KURNIAWAN");
        System.out.println("NIM  : 165150200111122");
        //Shelter A
        Shelter A = new Shelter("Shelter A", 12);
        String[] Penduduk = {"A", "B", "C", "D"};
        A.setNamaPenduduk(Penduduk);
        //Shelter B
        Shelter B = new Shelter();
        B.setJumlahPenduduk(10);
        B.setNamaShelter("Shelter B");
        String[] PendudukB = {"AX", "BY", "CX", "DY"};
        B.setNamaPenduduk(PendudukB);
        

        //Shelter C
        Shelter C = new Shelter();
        C.setJumlahPenduduk(10);
        String[] PendudukC = {"AA", "BC", "CC", "DD"};
        C.setNamaShelter("Shelter C");
        C.setNamaPenduduk(PendudukC);

        System.out.println("=======SHELTER==========");
        System.out.println("0. Berhenti");
        System.out.println("1. Jumlah Penduduk berdasarkan Shelter");
        System.out.println("2. Menampilkan Nama-nama Penduduk di semua Shelter");
        System.out.println("3. Nama-nama Penduduk suatu Shelter");
        System.out.println("4. Menampilkan Nama Penduduk dari Index pada Salah Sastu Shelter");
        System.out.println("5. Menambah Nama Penduduk pada Salah Satu Shelter");
        int pil;
        do {
            System.out.print("OPSI:");
            pil = in.nextInt();
            switch (pil) {
                case 0:
                    System.out.println("Anda Telah Keluar...\nTerima Kasih...");
                    break;
                case 1:
                    System.out.println(A.getNamaShelter() + " " + A.getJumlahPenduduk());
                    System.out.println(B.getNamaShelter() + " " + B.getJumlahPenduduk());
                    System.out.println(C.getNamaShelter() + " " + C.getJumlahPenduduk());
                    break;
                case 2:
                    A.tampilPenduduk(A.getNamaShelter());
                    B.tampilPenduduk(B.getNamaShelter());
                    C.tampilPenduduk(C.getNamaShelter());
                    break;
                case 3:
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    int h = in.nextInt();
                    switch (h) {
                        case 1:
                            A.tampilPenduduk(A.getNamaShelter());
                            break;
                        case 2:
                            B.tampilPenduduk(B.getNamaShelter());
                            break;
                        case 3:
                            C.tampilPenduduk(C.getNamaShelter());
                            break;
                    }
                    break;
                case 4:
                    int index;
                    System.out.println("Pilih Shelter: ");
                    System.out.println("1. A");
                    System.out.println("2. B");
                    System.out.println("3. C");
                    int D = in.nextInt();

                    switch (D) {
                        case 1:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + A.getPendudukbyIndex(index));
                            break;
                        case 2:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + B.getPendudukbyIndex(index));
                            break;
                        case 3:
                            System.out.print("input index:");
                            index = in.nextInt();
                            System.out.println("No." + index + " " + C.getPendudukbyIndex(index));
                            break;
                        default:
                            System.out.print("input index:");

                    }
                    break;
                case 5:
                    String nama;
                    int k = in.nextInt();
                    switch (k) {
                        case 1:
                            System.out.print("input nama:");
                            nama = in.next();
                            A.addPenduduk(nama);
                            break;
                        case 2:
                            System.out.print("input nama:");
                            nama = in.next();
                            B.addPenduduk(nama);
                            break;
                        case 3:
                            System.out.print("input nama:");
                            nama = in.next();
                            C.addPenduduk(nama);
                            break;
                    }
                default:
                    System.out.println("Salah");
                    break;
            }
        } while (pil != 0);
    }

}
