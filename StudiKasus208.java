import java.util.Scanner;
public class StudiKasus208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String kegiatan = input.nextLine().trim().toUpperCase();
        String status;

        if (kegiatan.equals("BELMAWA") || kegiatan.equals("BAKORMA") || kegiatan.equals("MANDIRI")) {
            // Ketentuan a: kompetisi
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                if (juara >= 1 && juara <= 3) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan (juara " + juara + ").";
                } else {
                    status = "Dokumen lengkap, tetapi bukan juara 1/2/3. Dana penghargaan tidak diberikan.";
                }
            }
        } else if (kegiatan.equals("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = didanai, 0 = tidak didanai) : ");
            int pkm = input.nextInt();

            if (dokumen < 4) {
                status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.";
            } else {
                if (pkm == 1) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan (tim PKM didanai).";
                } else {
                    status = "Dokumen lengkap, tetapi tim PKM tidak didanai. Dana penghargaan tidak diberikan.";
                }
            }
        } else {
            status = "Kegiatan di luar ketentuan (Lainnya). Dana penghargaan tidak diberikan.";
        }

        System.out.println("\nNama mahasiswa : " + nama);
        System.out.println("Jenis kegiatan : " + kegiatan);
        System.out.println("Status : " + status);

        input.close();
    }
}