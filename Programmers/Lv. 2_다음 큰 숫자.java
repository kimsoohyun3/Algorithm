// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
class TryHelloWorld
{

  public int toBinaryOne(int n){
    String bin = Integer.toBinaryString(n);
      int count = 0;
      for(int i=0; i<bin.length(); i++){
        if(bin.charAt(i)=='1') count++;
      }
    return count;
  }

    public int nextBigNumber(int n)
    {
        int answer = 0;
      int number = toBinaryOne(n);
      while(true){
        if(number == toBinaryOne(++n)){
         answer = n;
          break;
        }


      }

        return answer;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}