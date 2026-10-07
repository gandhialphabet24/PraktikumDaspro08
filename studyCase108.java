import java.util.Scanner;
    public class studyCase108 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int jumlahCup, uangBayar;
            int totalHarga, diskon;
            int totalBayar, kembalian, kurang;
            int hargaPerCup = 18000;

            System.out.print("Input JumlahCup\t: ");
            jumlahCup = input.nextInt();
            System.out.print("Input uangBayar\t: ");
            uangBayar = input.nextInt();

            totalHarga = jumlahCup * hargaPerCup;
            diskon = 0;
            if(totalHarga >= 100000){
                diskon = totalHarga * 10 / 100;
            }

            totalBayar = totalHarga - diskon;

            System.out.println("total harga\t: " + totalHarga);
            System.out.println("diskon\t: " + diskon);
            System.out.println("total bayar\t: " + totalBayar);

            if(uangBayar >= totalBayar){
                kembalian = uangBayar - totalBayar;
                System.out.println("uang kembalian\t : " + kembalian);
            } else {
                kurang = totalBayar - uangBayar;
                System.out.println("Not enoughmoney, short by Rp." + kurang);
            }
        }
    }