package questions.book_project;
import java.util.*;

//----------------------------------------------------CLASS-------------------------------------------------------------
public class SchoolLibrary {
    static Integer counter=1006;
    static Integer select;

    static HashMap<String, String> bookList= new HashMap<>();

//--------------------------------------------------MAİN METHOD---------------------------------------------------------
    public static void main(String[] args) {
        selectProcess();

    }

//----------------------------------------------------METHODS-----------------------------------------------------------
// selectProcess() variable: select-------------------
    static void selectProcess(){
        System.out.println("1: add Book 2: remove Book 3:find the book by entering the book information " +
                "4: show all books 5:exit");
        Scanner scan = new Scanner(System.in);
        select=scan.nextInt();
        switch (select) {

            case 1:
                addBook();
                showBookList();
                selectProcess();
                break;
            case 2:
                removeBook();
                showBookList();
                selectProcess();
                break;
            case 3 :
                findBookWithBookType();
                showBookList();
                selectProcess();
                break;
            case 4:
                showBookList();
                selectProcess();
            case 5:
                System.out.println("Sağlıklı günler dileriz.");
                break;
        }



    }


//-- ---variable:bookName, author, price, allInfoOfBook and bookList--------------
    //demo test için öncesinde 5 adet kitap ekledik.
    static void beforeList(){
        System.out.println("======================================================");
        bookList.put("Enstitü", "1005 Enstitü Stephen King 81 Korku-gerilim");
        bookList.put("Süt Lekesi", "1001 Süt Lekesi Esra Ezmeci 50.20 Bilim Kurgu");
        bookList.put("Kozmos", "1002 Süt Lekesi Carl Sagan 55 Bilim Kurgu");
        bookList.put("Beyin", "1003 Beyin David Eagleman 47 Bilim Kurgu");
        bookList.put("Saklambaç", "1003 Saklambaç Kabal 42 Korku-gerilim");
        bookList.put("Hizmetçi", "1004 Hizmetçi Nita Prose 59 Korku-gerilim");
    }
//HashMap ile kitap ekleme addBook() methodu.
    static HashMap<String,String> addBook(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kitap Adı: ");
        String bookName= scan.next();
        System.out.println("Kitabın yazar adı: ");
        String author= scan.next();
        System.out.println("Kitabın fiyatı: ");
        String price= scan.next();
        System.out.println();
        SchoolLibrary schLib= new SchoolLibrary();
        String allInfoOfBook= (SchoolLibrary.counter++)+" "+author+" "+price+" "+bookType();
        bookList.put(bookName, allInfoOfBook);
        showBookList();
        selectProcess();
        return bookList;
    }

//--removeBook Variable: getBook and bookList.remove(getBook)
    static void removeBook(){
        showBookList();
        Scanner scan = new Scanner(System.in);
        System.out.println("Sileceğiniz Kitap ismini giriniz: ");
        String getBook=scan.next();
        try {
            bookList.remove(getBook);
        }catch (InputMismatchException e) {
            showBookList();
            System.out.println("Lütfen ismin var olup olmadığını kontrol ediniz."+e.getMessage());
        }

        }
//bookType() kategorize etme methodu.(findBookWithBookType() ve addBook() methodları için bu methodu oluşturduk)
    static String bookType(){
        Scanner scan = new Scanner(System.in);
        String getBookType="";
        System.out.println("Bilim Kurgu: 1   Korku-gerilim: 2   polisiye: 3");
        int userBookType= scan.nextInt();
        String[] bookType ={"Bilim Kurgu", "Korku-gerilim","polisiye"};
        switch (userBookType){
            case 1:
                getBookType=getBookType+bookType[0]; //Bilim Kurgu
                break;
            case 2:
                getBookType=getBookType+bookType[1]; //Korku-gerilim
                break;
            case 3:
                getBookType=getBookType+bookType[2];//polisiye
                break;
        }showBookList();
        return getBookType;

    }
    //findBookWithBookType() kategorisine göre kitapları listele
    static void findBookWithBookType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kitap türüne göre arama yapmak için" +
                "\"Bilim Kurgu: 1   Korku-gerilim: 2   polisiye: 3\" birini seçiniz ");
        String typeOfBook = bookType();
        int counter=0;
        Set<Map.Entry<String,String>> entries = bookList.entrySet();
            for (Map.Entry<String,String> w:entries){
                if (w.getValue().contains(typeOfBook)) {
                    System.out.println(typeOfBook+" Kategori listesi: "+w);
                    counter++;
                }

        }System.out.println(typeOfBook+" Kategori listesinde: "+counter+" adet var.");
            /*else {
            System.out.println("Belirttiğiniz. katogeri mevcut değildir.");
            //
        }*/selectProcess();
    }


//showBookList() Kitapları göster
    static void showBookList(){
        HashMap<String, HashMap> selects=new HashMap<>();
        SchoolLibrary sch=new SchoolLibrary();

        for (Map.Entry<String, String> w : bookList.entrySet()) {
                        String key = w.getKey();
                        String value= w.getValue();
            System.out.println("key: "+key+" Value: "+value);
        }
        System.out.println("=============================++++++++++======================================");
        beforeList();
    }
}

