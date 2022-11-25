package questions.book_project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
        static Integer counter=0;
        Test(){
            SchoolLibrary.counter++;
            System.out.println("Test Constructor: "+bookList);
        }
        static HashMap<String, String> bookList= new HashMap<>();
        public static void main(String[] args) {
            /** ==================== PROJE==============================
             * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
             * baslayinca menu isminde bir method calissin
             * 1-kitap ekle
             * 2-numara ile kitap goruntule
             * 3-bilgi ile kitap goruntule
             * 4-numara ile kitap sil
             * 5-tum kitaplari listele
             * 6-cikis
             **
             * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
             * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
             * olmali yani bir list'te tutmamiz gerek
             * 2-kitap numarasi 1000'den
             * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
             * count=1000; menu isminde bir method olusturmaliyim,
             * 3-kitap ekle diye bir
             * method olusturmliyim,bu method farkli bir classda
             * 4-kullanicidn kitap adi
             * yazar adi ve fiyat bilgileri istenmeli
             Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();*/

            addBook();

        }


        static void addBook(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Kitap Adı: ");
            String bookName= scan.next();
            System.out.println("Bilim Kurgu: 1   Korku-gerilim: 2   polisiye: 3");
            System.out.println("Kitap içeriği seç: ");
            Date simdikiZaman = new Date();
            System.out.println(simdikiZaman);
            DateFormat df = new SimpleDateFormat("hhmm");
            System.out.println(df.format(simdikiZaman));
            questions.book_project.Test scl= new questions.book_project.Test();
            String allInfoOfBook= df.format(simdikiZaman)+"-"+bookName.substring(0,3)+counter;
            System.out.println();
            System.out.print("Kitap için bir seri no: ");
            System.out.println(allInfoOfBook);
            bookList.put(bookName,allInfoOfBook);
            System.out.println("addbookMethod "+bookList.put(bookName, allInfoOfBook));
            addBook();
        }



    }


