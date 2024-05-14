import lombok.*;
@Setter@Getter

public class Mobil {
    String merk;
    String noPlat;
    String warna;
    int tahunKeluaran;

    Mobil(){}

    Mobil(String merk, String noPlat, int tahunKeluaran, String warna) {
        this.merk = merk;
        this.noPlat = noPlat;
        this.tahunKeluaran = tahunKeluaran;
        this.warna = warna;
    }
}
