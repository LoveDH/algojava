import java.io.*;
import java.util.*;

public class N1946 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(reader.readLine());
        // int tc = sc.nextInt();
        while(tc-- > 0) {
            int n = Integer.parseInt(reader.readLine());
            // int n = sc.nextInt();
            int [] a= new int[n+1];
    
            for(int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(reader.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                // int x = sc.nextInt();
                // int y = sc.nextInt();
                a[x] = y;
            }
            
            int cnt = 1; //x�� 1�϶��� ������ �����ϹǷ� 1�� ����
            int standard = a[1]; //���� ��, ó������ x�� 1�� ���� y��
            for(int i=2; i<=n; i++) {
                if(standard > a[i]) { //���� ������ a[i]�� y���� �۴ٸ� 
                    cnt++; //�߰�
                    standard = a[i]; //���� �� a[i]�� y������ ����
                }
            }
            System.out.println(cnt);
        }
        // sc.close();
    }
}
