//        1.
//        - ������ ������������ 20
//        - �� ����������� ���������� ������ ������� �� -10 �� 10
//        - ����� ����� ������������ ������������� � ����������� ������������� �������� �������
//        - �������� �� �������.
//
//        2. ����������� ������� �������.
    //        - �� ����� �������� � ���� ������ �������� (Candy, Jellybean, etc.)
//        - � ������ �������� ���� ��������, ���, ���� � ���� ���������� ��������
//        - ���������� ������� ������� �� ���������
//        - ����� ����� ��� �������, ����� ��������� �������
//        - ������� �� ������� ���������� � ���� ��������� � �������

import giftBasket.Basket;
import sandbox.Sandbox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������� ����������� ������\n1 - ������ �� ������\n2 - ������ ��� �������");
        switch (sc.next()){
            case "1":
                System.out.println("1 - ������ �� ������: \n");
                CreateArray.createArray();
                break;
            case "2":
                System.out.println("2 - ������ ��� �������: \n");
                Basket.basket();
                break;
            default:
                Sandbox.sandbox();
        }
        sc.close();
    }
}
