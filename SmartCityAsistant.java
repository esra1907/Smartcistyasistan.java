


import java.util.Scanner;

    public class SmartCityAsistant{
        public static void main(String[] args) {
            String DOGRU_KULLANICI_ADI = "kullanici";
            String DOGRU_PİN = "12345";
            Scanner scanner = new Scanner(System.in);
            System.out.println("LÜTFEN ADINIZI GİRİNİZ: ");
            String kullanılanad = scanner.nextLine();
            System.out.println("PIN KODUNUZU GİRİNİZ");
            String girilenpın = scanner.nextLine();
            if (kullanılanad.equals(DOGRU_KULLANICI_ADI) && girilenpın.equals(DOGRU_PİN)) {

                System.out.println("HOŞGELDİN," + kullanılanad + "!");
                System.out.println("Akıllı şehir asistanı hizmetine hoşgeldiniz");
                System.out.println("---------------------------------------------");
                System.out.println("Bir hizmet seçiniz:");
                System.out.println("1.Taksi ücreti hesaplayıcısı");
                System.out.println("2.Elektrik Faturası Hesaplayıcısı");
                System.out.println("3.Sağlık kontrolü(BMI ve ideal kilo)");
                System.out.println("Seçiminizi giriniz(1-3): ");
                int seçim = scanner.nextInt();
                scanner.nextLine();
                if (seçim == 1) {
                    System.out.println("TAKSİ HESAPLAYICISI BAŞLATILIYOR");//TAKSİ ÜCRET HESAPLAYICISI BAŞLANGIÇ
                    System.out.println("Mesafeyi giriniz(km): ");
                    double mesafe = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Günün zamanını giriniz(Gündüz/Gece):");
                    String zamansecimi = scanner.nextLine();
                    System.out.println("Haftasonu mu(Evet/Hayır):");
                    String haftasonusecimi = scanner.nextLine();
                    double toplamucret = 3.0;
                    if (haftasonusecimi.equalsIgnoreCase("Evet")) {
                        if (zamansecimi.equalsIgnoreCase("Gündüz")) {
                            toplamucret += mesafe * 1.50;
                        } else {
                            toplamucret += mesafe * 2.00;
                        }
                        //Haftasonu ek ücret(%10)
                        toplamucret = toplamucret * 1.10;
                    } else {//hafta içi ise
                        if (zamansecimi.equalsIgnoreCase("Gündüz")) {
                            toplamucret += mesafe * 1.50;
                        } else {
                            toplamucret += mesafe * 2.00;
                        }
                    }
                    System.out.printf("Toplam ücretiniz:$%.2f%n", toplamucret);
                } else if (seçim == 2) {
                    System.out.println("ELEKTRİK HESAPLAYICISI BAŞLATILIYOR");//ELEKTRİK HESAPLAYICISI BAŞLANGIÇ
                    System.out.println("Elektrik birimini giriniz(kWh): ");
                    int birim = scanner.nextInt();
                    double elektrikmaliyeti = 0.0;
                    double vergi = 0.0;
                    double toplamfatura = 0.0;
                    if (birim <= 100) {
                        elektrikmaliyeti = birim * 0.50;
                    } else if (birim <= 200) {
                        elektrikmaliyeti = (100 * 0.50) + ((birim - 100) * 0.75);
                    } else {
                        elektrikmaliyeti = (100 * 0.50) + (100 * 0.75) + ((birim - 200) * 1.20);
                    }

                    if (elektrikmaliyeti > 100) {
                        vergi = elektrikmaliyeti * 0.05;
                    }
                    toplamfatura = elektrikmaliyeti + vergi;
                    System.out.println("------FATURA DETAYLARI-----");
                    System.out.printf("Elektrik maliyeti:$%.2f%n", elektrikmaliyeti);
                    System.out.printf("Vergi(%%5):$%.2f%n", vergi);
                    System.out.printf("Toplam fatura:$%.2f%n", toplamfatura);


                } else if (seçim == 3) {
                    System.out.println("SAĞLIK KONTROLÜ HESAPLAYICISI BAŞLATILIYOR");//SAĞLIK KONTROL HESAPLAYICISI BAŞLANGIÇ
                    System.out.println("Cinsiyetinizi giriniz(Erkek/Kadın): ");
                    String cinsiyetsecimi = scanner.nextLine();
                    System.out.println("Boyunuzu giriniz(metre cinsinden,ör=1.75):");
                    double boy = scanner.nextDouble();
                    System.out.println("Kilonuzu giriniz:");
                    double kilo = scanner.nextDouble();

                    double bmi = kilo / Math.pow(boy, 2);

                    double idealkilo = 0.0;
                    if (cinsiyetsecimi.equalsIgnoreCase("Erkek")) {
                        idealkilo = 22 * Math.pow(boy, 2);
                    } else {
                        idealkilo = 21 * Math.pow(boy, 2);
                    }
                    String bmiSınıfı = "";
                    if (bmi < 18.5) {
                        bmiSınıfı = "Zayıf";
                    } else if (bmi < 24.9) {
                        bmiSınıfı = "Normal";
                    } else if ((bmi < 29.9)) {
                        bmiSınıfı = "Fazla kilolu";
                    } else {
                        bmiSınıfı = "Obez";
                    }
                    System.out.println("------SAĞLIK RAPORUNUZ------");
                    System.out.printf("BMI'niz: %.2f-Durum:%s%n", bmi, bmiSınıfı);
                    System.out.printf("İdeal kilonuz:%.1f kg%n", idealkilo);


                } else {
                    System.out.println("GEÇERSİZ SEÇİM");
                }

                System.out.println("AKILLI ŞEHİR ASİSTANINI KULLANDIĞINIZ İÇİN TEŞEKKÜRLER");
            } else {
                System.out.println("KÖtü kimlik bilgileri.Hatalı kullanıcı adı veya pin");
                System.out.println("Programdan çıkılıyor");

            }
        }
    }










