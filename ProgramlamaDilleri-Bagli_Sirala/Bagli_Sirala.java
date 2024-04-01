import java.io.*;
import java.util.Scanner;

public class Bagli_Sirala {
    private static final int diziBoyut = 100;

    public static void main(String[] args) {

        node[] dizi = new node[diziBoyut];
        node[] siralanmamisDizi = new node[dizi.length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisteme Okunacak Txt Dosyasının Adını Giriniz : (Sistemde var olan txt dosyası : dosya.txt )");
        String fileName = scanner.nextLine();

        dosyaOku(fileName, dizi, siralanmamisDizi);
        nodeSirala(dizi);
        System.out.println("Sıralanmamış Dizi:\tSıralanmış Dizi:");
        nodeYazdir(dizi, siralanmamisDizi);
    }

    public static void dosyaOku(String fileName, node[] dizi, node[] siralanmamisDizi) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String satir;
            int index = 0;
            while ((satir = br.readLine()) != null) {
                int veri = Integer.parseInt(satir.trim());
                dizi[index] = new node(veri, index);
                siralanmamisDizi[index] = dizi[index];
                index++;
            }
        } catch (IOException e) {
            System.out.println("I/O isleminde hata gerceklesti : " + e.getMessage());
        }
    }

    public static void nodeSirala(node[] dizi) {
        int i = 0;
        int diziLength = dizi.length;
        while (i < diziLength) {
            int j = i + 1;
            while (j < diziLength) {
                if (dizi[i] != null && dizi[j] != null) {
                    if (dizi[i].getVeri() > dizi[j].getVeri()) {
                        node temp = dizi[i];
                        dizi[i] = dizi[j];
                        dizi[j] = temp;
                    }
                }
                j++;
            }
            i++;
        }
    }

    public static void nodeYazdir(node[] dizi, node[] siralanmamisDizi) {
        int index = 0;
        for (node node : siralanmamisDizi) {
            if (node != null) {
                System.out.print("Veri: " + node.getVeri() + " Adres: " + index);
            }
            System.out.print("\t");
            if (index < dizi.length && dizi[index] != null) {
                System.out.println("Veri: " + dizi[index].getVeri() + " Adres: " + dizi[index].getAdres());
            }
            index++;
        }
    }
}