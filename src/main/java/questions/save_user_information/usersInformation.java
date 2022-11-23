package questions.save_user_information;

import java.util.*;

public class usersInformation {
   static Integer selectEnter=0;
    public static void main(String[] args) {
        callmethod();
    }
    static Integer callmethod(){
        while (selectEnter!=3) {
            System.out.println("kimlik kayıt için: 1, kayıtlı kimik silmek için: 2, çıkmak için yanlızca 3 yazınız: ");
            Scanner scanner = new Scanner(System.in);
            Integer selectEnter = scanner.nextInt();
            HashMap<Integer, String> getUserInfo =new HashMap<>();
            if (selectEnter == 1) {
                HashMap<Integer,String> getUserInfo1 = new HashMap<>();
                System.out.println("Kimlik gir: ");
                Integer keyİdentity= scanner.nextInt();
                getUserInfo1.put(saveInfo(), Arrays.toString(getList()));
            } else if (selectEnter == 3) {
                System.out.println(getUserInfo.toString());
                System.out.println(getUserInfo.keySet()+" "+getUserInfo.values());
                break;
            }
        }
        return selectEnter;
    }


    static Integer saveInfo(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Lütfen Dört haneli kimlik nurası giriniz: ");
            Integer identy= scan.nextInt();
            return identy;
        }
        static String[] getList(){
            Scanner scan=new Scanner(System.in);
            String[] personAllİnfo=new String[3];
            for (int i=0; i<3; i++){
                String[] personRaw= {"Ad","adres","telefon" };
                System.out.println("Lütfen bir "+personRaw[i]+" giriniz: ");
                personAllİnfo[i]=scan.next();
            }

            return personAllİnfo;

        }


        static HashMap<Integer,String> listStroge(){
            HashMap<Integer,String> getUserInfo=new HashMap<>();
            getUserInfo.put(saveInfo(), Arrays.toString(getList()));
            Set<Map.Entry<Integer,String>> entries = getUserInfo.entrySet();
            for(Map.Entry<Integer,String> w  : entries){
                System.out.println(w);
            }
            System.out.println(entries);
            return getUserInfo;
        }



}
