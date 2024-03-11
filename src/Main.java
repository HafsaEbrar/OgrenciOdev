public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci(null, null, 1973, 0.0, "104001");
        Ogrenci ogr2 = new Ogrenci("Gökhan", "Bilgisayar Müh", 1985, 0.0, "104001");
        Ogrenci ogr3 = new Ogrenci("Ayşe", "Makina Müh", 1985, 0.0, "104001");
        Ogrenci ogr4 = new Ogrenci("Elif", "Elektrik Elektronik Müh", 2020, 1.98, "104001");

        int dersSayisi = 6;
        int uzatmaYili = 2;
        double harcOgr3 = ogr3.harcHesapla(dersSayisi);
        double harcOgr4 = ogr4.harcHesapla(dersSayisi, uzatmaYili);

        System.out.println("öğrencilerin bilgileri");
        System.out.println("ogr-1 " + ogr1.getAd() + " " + ogr1.getBolum() + " " + ogr1.getGirisyili() + " " + ogr1.getOgrNo() + " " + ogr1.getGano());
        System.out.println("ogr-2 " + ogr2.getAd() + " " + ogr2.getBolum() + " " + ogr2.getGirisyili() + " " + ogr2.getOgrNo() + " " + ogr2.getGano());
        System.out.println("ogr-3 " + ogr3.getAd() + " " + ogr3.getBolum() + " " + ogr3.getGirisyili() + " " + ogr3.getOgrNo() + " " + ogr3.getGano());
        System.out.println("ogr-4 " + ogr4.getAd() + " " + ogr4.getBolum() + " " + ogr4.getGirisyili() + " " + ogr4.getOgrNo() + " " + ogr4.getGano());
        System.out.println("3. öğrencinin ödeyeceği harç: " + harcOgr3);
        System.out.println("4. öğrencinin ödeyeceği harç: " + harcOgr4);
    }
}