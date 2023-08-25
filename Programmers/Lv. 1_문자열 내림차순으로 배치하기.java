// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.Arrays;

public class ReverseStr {
    public String reverseStr(String str){
    char[] ch = str.toCharArray();
        String lower = "";
        String upper = "";

        for(int i = 0; i < ch.length; i++) {
            int chnum = ch[i];

            if(chnum >= 65 && chnum <= 90)
                upper += ch[i];
            else
                lower += ch[i];
        }

        char[] chUpper = upper.toCharArray();
        char[] chLower = lower.toCharArray();
        upper = ""; lower = "";

        Arrays.sort(chUpper);
        Arrays.sort(chLower);

        for(int i = chUpper.length - 1; i >= 0; i--)
            upper += chUpper[i];
        for(int i = chLower.length - 1; i >= 0; i--)
            lower += chLower[i];

        return lower + upper;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}