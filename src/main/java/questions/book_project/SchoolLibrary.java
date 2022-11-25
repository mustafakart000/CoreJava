package questions.book_project;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//----------------------------------------------------CLASS-------------------------------------------------------------
public class SchoolLibrary {
    static Integer counter=1000;
    SchoolLibrary(){
        SchoolLibrary.counter++;
        System.out.println("constructor body: "+bookList);
    }
    static HashMap<String, String> bookList= new HashMap<>();

//--------------------------------------------------MAİN METHOD---------------------------------------------------------
    public static void main(String[] args) {
        beforeList();
        selectProcess();

    }

//----------------------------------------------------METHODS-----------------------------------------------------------
// selectProcess() variable: select-------------------
    static void selectProcess(){
        System.out.println("1: add Book 2: remove Book 3:find the book by entering the book information " +
                "5: show all books 6:exit");
        Scanner scan = new Scanner(System.in);
        Integer select=scan.nextInt();
        switch (select) {
            case 1:
                addBook();


            case 2:
                removeBook();
                case 3 :
                    findBookWithBookType();
        }


    }


//--addBook()---variable:bookName, author, price, allInfoOfBook and bookList--------------
    static void beforeList(){
        bookList.put("Süt Lekesi", "1001 Süt Lekesi Esra Ezmeci 50.20 Bilim Kurgu");
        bookList.put("Kozmos", "1002 Süt Lekesi Carl Sagan 55 Bilim Kurgu");
        bookList.put("Beyin", "1003 Beyin David Eagleman 47 Bilim Kurgu");
        bookList.put("Saklambaç", "1004 Saklambaç Kabal 42 Korku-gerilim");
        bookList.put("Hizmetçi", "1005 Hizmetçi Nita Prose 59 Korku-gerilim");
        bookList.put("Enstitü", "1006 Enstitü Stephen King 81 Korku-gerilim");
    }
    static HashMap<String,String> addBook(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Kitap Adı: ");
        String bookName= scan.next();
        System.out.println("Kitabın yazar adı: ");
        String author= scan.next();
        System.out.println("Kitabın fiyatı: ");
        String price= scan.next();
        System.out.println();
        String allInfoOfBook= counter+"-"+author+"-"+price+"-"+bookType();
        SchoolLibrary schLib= new SchoolLibrary();
        bookList.put(bookName, allInfoOfBook);
        System.out.println(bookList);
        showBookList();
        selectProcess();
        return bookList;
    }

//--removeBook Variable: getBook and bookList.remove(getBook)
    static void removeBook(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Sileceğiniz Kitap ismini giriniz: ");
        String getBook=scan.next();
        try {
            bookList.remove(getBook);
            System.out.println(bookList);
            }catch (ClassCastException e) {
                System.out.println("Lütfen ismin var olup olmadığını kontrol ediniz."+e.getMessage());
            }
        showBookList();
        }

    static String bookType(){
        Scanner scan = new Scanner(System.in);
        String getBookType="";
        System.out.println("Bilim Kurgu: 1   Korku-gerilim: 2   polisiye: 3");
        int userBookType= scan.nextInt();
        String[] bookType ={"Bilim Kurgu", "Korku-gerilim","polisiye"};
        switch (userBookType){
            case 1:
                getBookType=getBookType+bookType[0];
                break;
            case 2:
                getBookType=getBookType+bookType[1];
                break;
            case 3:
                getBookType=getBookType+bookType[2];
                break;
        }showBookList();
        return getBookType;

    }
    static void findBookWithBookType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("kitap türüne göre arama yapmak için" +
                "\"Bilim Kurgu: 1   Korku-gerilim: 2   polisiye: 3\" birini seçiniz ");
        String typeOfBook = bookType();
        new SchoolLibrary();
        if (typeOfBook == bookList.values().toString().split("-")[3]) {
            for (String w:bookList.values()){
                System.out.println(w.split("-")[3].contains(typeOfBook));
            }
        }else {
            System.out.println("Belirttiğiniz. katogeri mevcut değildir.");
            findBookWithBookType();
        }
    }
    static void showBookList(){
        HashMap<String, HashMap> selects=new HashMap<>();
        SchoolLibrary sch=new SchoolLibrary();

        for (Map.Entry<String, String> w : bookList.entrySet()) {
                        String key = w.getKey();
                        String value= w.getValue();
            System.out.println("key: "+key+" Value: "+value);
        }
    }
}
