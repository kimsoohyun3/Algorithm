// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
class StringExercise{
    String getMiddle(String word){
    int a = word.length();
    String word1;
    if ( a % 2 == 0 )
            word1 = word.substring(a/2 - 1, (a/2) + 1);
    else
            word1 = word.substring((a/2), (a/2) + 1);
    return word1;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}