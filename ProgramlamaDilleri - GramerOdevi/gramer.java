import java.util.Scanner;

public class gramer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisteme Gramer Analizi Yapilacak Olan Cumleyi Giriniz : ");
        String cumle = scanner.nextLine();

        if (gramerKontrol(cumle)) {
            System.out.println("Cümle Gramer kurallarına uyuyor...");
        } else {
            System.out.println("Cümle Gramer kurallarına uymamakta...");
        }
    }

    public static boolean gramerKontrol(String cumle) {
        String[] kelimeler = cumle.trim().split("\\s+");

        if (kelimeler.length == 3) {
            String kelime1 = kelimeler[0];
            String kelime2 = kelimeler[1];
            String kelime3 = kelimeler[2];

            return (elemanKontrol("Ben", kelime1) || elemanKontrol("Sen", kelime1) ||
                    elemanKontrol("Hasan", kelime1) || elemanKontrol("Nurşah", kelime1) ||
                    elemanKontrol("Elif", kelime1) || elemanKontrol("Abdulrezzak", kelime1) ||
                    elemanKontrol("Şehribanu", kelime1) || elemanKontrol("Zeynelabidin", kelime1) ||
                    elemanKontrol("Naki", kelime1)) &&

                    (elemanKontrol("Bahçe", kelime2) || elemanKontrol("Okul", kelime2) ||
                            elemanKontrol("Park", kelime2) || elemanKontrol("Sınıf", kelime2) ||
                            elemanKontrol("Yarın", kelime2) || elemanKontrol("Pazartesi", kelime2) ||
                            elemanKontrol("Salı", kelime2) || elemanKontrol("Çarşamba", kelime2) ||
                            elemanKontrol("Perşembe", kelime2) || elemanKontrol("Cuma", kelime2) ||
                            elemanKontrol("Cumartesi", kelime2) || elemanKontrol("Pazar", kelime2) ||
                            elemanKontrol("Merkez", kelime2) || elemanKontrol("Ev", kelime2) ||
                            elemanKontrol("Kitap", kelime2) || elemanKontrol("Defter", kelime2) ||
                            elemanKontrol("Güneş", kelime2) || elemanKontrol("Beydağı", kelime2)) &&

                    (elemanKontrol("Gitmek", kelime3) || elemanKontrol("Gelmek", kelime3) ||
                            elemanKontrol("Okumak", kelime3) || elemanKontrol("Yazmak", kelime3) ||
                            elemanKontrol("Yürümek", kelime3) || elemanKontrol("Görmek", kelime3));
        } else {
            return false;
        }
    }

    public static boolean elemanKontrol(String kelime, String kontrolEdilecekKelime) {
        return kelime.equals(kontrolEdilecekKelime);
    }
}
