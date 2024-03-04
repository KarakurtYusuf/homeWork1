public class Main {

    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("Kadir", 341),
                new Ogrenci("Gökhan", 273),
                new Ogrenci("Hakan", 278),
                new Ogrenci("Suzan", 329),
                new Ogrenci("Pınar", 445),
                new Ogrenci("Mehmet", 402),
                new Ogrenci("Ali", 388),
                new Ogrenci("Emel",270 ),
                new Ogrenci("Fırat",243),
                new Ogrenci("James",334),
                new Ogrenci("Jale",412),
                new Ogrenci("Ersin",393),
                new Ogrenci("Deniz",299),
                new Ogrenci("Gözde",343),
                new Ogrenci("Anıl",317),
                new Ogrenci("Burak",265)
        };


        System.out.println("İlk üç dereceyi alan öğrenciler:");

        Ogrenci temp;
        for (int i = 0; i < ogrenciler.length; i++) {
            for (int j = 0; j < ogrenciler.length-1; j++) {
                if (ogrenciler[j].getDerece() > ogrenciler[j+1].getDerece()){
                    temp = ogrenciler[j];
                    ogrenciler[j] = ogrenciler[j+1];
                    ogrenciler[j+1] = temp;
                }
            }
        }

        System.out.println("Birinci: " + ogrenciler[0]);
        System.out.println("İkinci: " + ogrenciler[1]);
        System.out.println("Üçüncü: " + ogrenciler[2]);


        System.out.println("\nSınıflandırma:");
        siniflandirmaYap(ogrenciler);
    }

    // Sınıflandırma metodu
    public static void siniflandirmaYap(Ogrenci[] ogrenciler) {
        int[] siniflandirma = new int[3];
        for (Ogrenci ogrenci : ogrenciler) {
            if (ogrenci.getDerece() >= 200 && ogrenci.getDerece() < 300) {
                siniflandirma[0]++;
            } else if (ogrenci.getDerece() >= 300 && ogrenci.getDerece() < 400) {
                siniflandirma[1]++;
            } else if (ogrenci.getDerece() >= 400) {
                siniflandirma[2]++;
            }
        }
        System.out.println("A -> " + siniflandirma[0]);
        System.out.println("B -> " + siniflandirma[1]);
        System.out.println("C -> " + siniflandirma[2]);
    }
}

