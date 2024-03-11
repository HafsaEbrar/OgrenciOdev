public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisyili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;
    private static int sequence = 1;

    public Ogrenci() {
        this.ogrNo = calculateOgrNo();
    }

    public Ogrenci(String ad, String bolum, int girisyili, double gano, String bolumKodu) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisyili = girisyili;
        this.gano = gano;
        this.bolumKodu = bolumKodu;
        this.ogrNo = calculateOgrNo();
    }

    // Getter and Setter methods
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisyili() {
        return girisyili;
    }

    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("GANO must be between 0 and 4.");
        }
        this.gano = gano;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }


    private String calculateOgrNo() {
        String strGirisyili = Integer.toString(girisyili);
        String strSequence = String.format("%02d", sequence);
        sequence++;
        return strGirisyili + bolumKodu + strSequence;
    }


    public double harcHesapla(int dersSayisi) {
        return dersSayisi * 100;
    }


    public double harcHesapla(int dersSayisi, int uzatmaYili) {
        return (dersSayisi * 100) + (uzatmaYili * 200);
    }
}
