package questions.save_user_information;

public class deneme01 {
    static int counter=0;
    static Integer a =1;
    public static void main(String[] args) {
        method01(counter);
        method01(counter);
        method01(counter);
        method02(counter);
        method02(counter);
        method02(counter);
        method02(a);

    }
    static Integer method01(Integer a){

        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));
        System.out.println("method01() ::: "+method02(a));

        return method02(a);

    }
    static Integer method02(Integer counter){
        counter++;
        System.out.println("method02:  "+counter);

        for (int i = 0; i < 4; i++){
            counter++;
            System.out.println("FOR method02:  "+counter);

        }

    return counter;
    }

}
