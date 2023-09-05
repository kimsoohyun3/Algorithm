// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
class NLCM {
    public long nlcm(int[] num) {
        long answer = num[0];
        for (int i = 1; i < num.length; i++)
      answer = lcm (answer, num[i]);
        return answer;
}

long lcm (long a, long b){
    long tempA = a, tempB= b;
  while (a!=b){
   if (a>b) a-=b;
    else b-=a;
  }
  return tempA*tempB/a;
}

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = { 2, 6, 8, 14 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}