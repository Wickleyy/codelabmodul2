import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihmenu = input.nextInt();

            switch (pilihmenu){
                case 1:
                    System.out.print("Masukkan nama Mahasiswa: ");
                    input.nextLine();
                    String Nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    long NIM = input.nextLong();
                    input.nextLine();
                    while (String.valueOf(NIM).length() != 15){
                        System.out.println("Nim Harus 15 Digit!!!");
                        System.out.print("Masukkan NIM Mahasiswa: ");
                        NIM = input.nextLong();
                        input.nextLine();
                    }
                    System.out.print("Masukkan jurusan Mahasiwa: ");
                    String Jurusan = input.nextLine();
                    Mahasiswa.addDaftarMahasiswa(Nama, NIM, Jurusan);
                    break;
                case 2:
                    Mahasiswa.tampilDataMahasiswa();
                    break;
                case 3:
                    System.out.print("Adios");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak Valid Coba Lagi.");
            }
        }
    }
}