//1.
//        - ������ ������������ 20
//        - �� ����������� ���������� ������ ������� �� -10 �� 10
//        - ����� ����� ������������ ������������� � ����������� ������������� �������� �������
//        - �������� �� �������.

public class CreateArray {

    static final int ARRAY_LENGTH = 20;
    static final int MAX = 10;
    static final int MIN = -10;
    static int[] arr = new int[ARRAY_LENGTH];

    public static void createArray () {
        //���������� �������� ������������� ��������������/������������ ��������������
        int maxNegative = -11;
        int minPositive = 11;
        System.out.print("��������������� ������: \n");
        //��������� ������ � �������� ���
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arr[i] = (int) ((Math.random() * ((MAX - MIN) + 1)) + MIN);
            System.out.printf("[%d]:%d ", i, arr[i]);
            //�������� �������� �� �������� ������� "������������ �������������"/"����������� �������������", ���� �� ��������� ����������
            if (arr[i] == 0) continue;
            if (arr[i] / Math.abs(arr[i]) == 1) {
                if (arr[i] < minPositive) minPositive = arr[i];
            } else if (arr[i] / Math.abs(arr[i]) == -1) {
                if (arr[i] > maxNegative) maxNegative = arr[i];

            } else
                System.out.println("�� �������������,  �� �������������, �� ����... ��� � ���� ��� � ���������� ������");
        }
        System.out.println(1);
        //������ ������������ ������������� � ����������� ������������� �������
        if ((maxNegative != -11 & minPositive != 11)) { //���� ����� ��� ����
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                if (arr[i] == maxNegative) {
                    arr[i] = minPositive;
                    System.out.printf("\n� ������ [%d] ������������ ������������� �������� %d ���� �������� �� ����������� ������������� �������� %d", i, maxNegative, minPositive);
                    continue;
                }
                if (arr[i] == minPositive) {
                    arr[i] = maxNegative;
                    System.out.printf("\n� ������ [%d] ����������� ������������� �������� %d ���� �������� �� ������������ ������������� �������� %d", i, minPositive, maxNegative);

                }
            }
        } else System.out.println("�� ���� �� ������ ��������������� ��� �� ������ �������������� �����");
        //�������� �������� ������
        System.out.print("\n\n�������� ������: \n");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.printf("[%d]:%d ", i, arr[i]);
        }

    }


}


