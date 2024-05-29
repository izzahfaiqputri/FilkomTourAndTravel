import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Input data mobil:");

        List<Mobil> mobils = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Pemilik: ");
            String pemilik = scanner.nextLine();

            System.out.print("Merk: ");
            String merk = scanner.nextLine();

            System.out.print("No Plat: ");
            String noPlat = scanner.nextLine();

            System.out.print("Tahun Keluaran: ");
            int tahunKeluaran = scanner.nextInt();

            scanner.nextLine(); // Consume newline character

            MobilPribadi mobilPribadi = new MobilPribadi(pemilik, merk, noPlat, tahunKeluaran);
            mobils.add(mobilPribadi);
        }

        System.out.println("\nData mobil setelah diinputkan:");

        for (Mobil mobil : mobils) {
            MobilPribadi mobilPribadi = (MobilPribadi) mobil;
            System.out.println("Pemilik: " + mobilPribadi.getPemilik());
            System.out.println("Merk: " + mobilPribadi.getMerk());
            System.out.println("No Plat: " + mobilPribadi.getNoPlat());
            System.out.println("Tahun Keluaran: " + mobilPribadi.getTahunKeluaran());
            System.out.println();
        }
    }
}