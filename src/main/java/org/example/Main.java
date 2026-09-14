import java.io.*;

class Main{

    static int sayac = 0;




    static boolean StringVarMi() {
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("orijinal dosya"))) {

            String satir;

            while ((satir = reader.readLine()) != null) {
                String[] kelimelerOrijinal = satir.split("\\s+");


                try (BufferedReader reader2 =
                             new BufferedReader(new FileReader("kopya dosya"))) {

                    String satir2;

                    while ((satir2 = reader.readLine()) != null) {
                        String[] kelimelerKopya = satir.split("\\s+");


                        if(kelimelerKopya == kelimelerOrijinal){
                            sayac++;
                        }

                        int KopyaKelimeSayisi = kelimelerKopya.length;

                        if (KopyaKelimeSayisi == sayac){
                            return true;
                        }


                    }

                } catch (IOException e) {
                    System.out.println("Dosya okunamadı.");
                }

            }
        } catch (IOException e) {
            System.out.println("Dosya okunamadı.");
        }
        return false;
    }
    public static void main(String[] args){

    }
}