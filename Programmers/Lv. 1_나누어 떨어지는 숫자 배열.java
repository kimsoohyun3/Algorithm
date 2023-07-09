// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.Arrays;

class Divisible {
    public int[] divisible(int[] array, int divisor) {
        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.

        int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%divisor==0){

                index++;
            }
        }
        int[] ret = new int[index];
        int count = 0;
        for(int i=0;i<array.length;i++){

            if(array[i]%divisor==0){
                ret[count++] = array[i];

            }

        }

        return ret;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}