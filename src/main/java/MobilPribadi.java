
import lombok.*;

@Getter@Setter

public class MobilPribadi extends Mobil{
    String pemilik;
    MobilPribadi(String pemilik, String merk,String noPlat, int tahunKeluaran){
        super(merk, noPlat, tahunKeluaran);
        this.pemilik = pemilik;
    }

}
