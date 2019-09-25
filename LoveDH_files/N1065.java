import java.io.*;

public class N1065 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String n = br.readLine();
        int intN = Integer.parseInt(n);
        int output = 99; // 99<= �Ѽ� <=110�� �Ѽ��� 99����
        
        if(intN>=111) { // 111���� üũ
            
            for(int i=111; i<=intN; i++) { // 1000�� ���� 1000�� �� ���� �ƴϱ� ������ �ڵ����� ������ �ʴ´�.
                String checkNum= String.valueOf(i);
                int firstGap = Character.getNumericValue(checkNum.charAt(0)) - Character.getNumericValue(checkNum.charAt(1));
                int secondGap = Character.getNumericValue(checkNum.charAt(1)) - Character.getNumericValue(checkNum.charAt(2));
                
                if(firstGap == secondGap) { // �ڸ��� �� ���̰� ������ �Ѽ��̴�
                    output++;
                }
            }
        }else if(intN <99){ // 98 ���� ������ �Է��� �� �״�δ�
            output = intN;
        }
        
        bw.write(String.valueOf(output));
        bw.flush();
    }
}