//1.
//        - ?????? ???????????? 20
//        - ?? ??????????? ?????????? ?????? ??????? ?? -10 ?? 10
//        - ????? ????? ???????????? ????????????? ? ??????????? ????????????? ???????? ???????
//        - ???????? ?? ???????.
//
//        2. ??????????? ??????? ???????.
//        - ?? ????? ???????? ? ???? ?????? ???????? (Candy, Jellybean, etc.)
//        - ? ?????? ???????? ???? ????????, ???, ???? ? ???? ?????????? ????????
//        - ?????????? ??????? ??????? ?? ?????????
//        - ????? ????? ??? ???????, ????? ????????? ???????
//        - ??????? ?? ??????? ?????????? ? ???? ????????? ? ???????

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("???????? ??????????? ??????\n1 - ?????? ?? ??????\n2 - ?????? ??? ???????\n?????? - ?????????");
        switch (sc.next()){
            case "1":
                System.out.println("1 - ?????? ?? ??????");
                break;
            case "2":
                System.out.println("2 - ?????? ??? ???????");
                break;
            default:
                System.out.println("?????????");
        }
        sc.close();
    }
}
