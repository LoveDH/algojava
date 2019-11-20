import java.util.Arrays;
import java.util.Scanner;
 
public class N2352 {
    static int lis(int [] a) {
        int [] tailTable = new int[a.length];
        
        tailTable[0] = a[0]; // �ʱⰪ
        int length = 1;
        
        for(int i=1; i<a.length; i++) { //�ĺ����� ó�������� ���� ��
            if(tailTable[0] > a[i]) {
                tailTable[0] = a[i];
            }
            else if(tailTable[length-1] < a[i]) { //�ĺ����� ������������ Ŭ ��
                tailTable[length] = a[i];
                length+=1;
            }
            else { //�� ���� ��쿣 ������ ��ġ�� ��ü�Ѵ�.
                int idx = Arrays.binarySearch(tailTable, 0, length, a[i]);
                idx = (idx < 0) ? -idx -1 : idx;
                tailTable[idx] = a[i];
            }
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(lis(a));
        scan.close();
    }
}
