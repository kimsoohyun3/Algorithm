// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
public class Expressions {

    public int expressions(int num) {
        int answer = 0;

        for(int i = 1;i<=num;i++){

            int temp = 0;
            for(int j = i;j<=num;j++){
                temp = temp + j;
                if(temp == num){
                    answer++;
                    break;
                }else if(temp>num){
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        Expressions expressions = new Expressions();
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(expressions.expressions(15));
    }
}
