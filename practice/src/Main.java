import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i=Integer.parseInt(br.readLine());
        String[] arr = str.split(" ");
        System.out.println(arr);
    }
}
/**
 * Enum(열거체) 상수
 * = 클래스를 이용해서 집합시킨 상수모음
 */
//getValue
