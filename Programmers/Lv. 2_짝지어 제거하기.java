// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        // 문자열을 캐릭터 배열로 변환
       char[] c = s.toCharArray();
       ArrayList<Character> list = new ArrayList<>();

       // 캐릭터를 하나씩 리스트에 삽입
       for(char _c : c){
           Add(list, _c);
       }

       // 만약 리스트가 비었다면 짝지거 제거 완료
       if(list.isEmpty()){
           return 1;
       }
       else {
           return 0;
       }
    }

     // 리스트에 캐릭터 하나씩 삽입하는 함수
    public static void Add(ArrayList _list, char _c){
        _list.add(_c);

        // 만약 리스트의 길이가 2보다 크고 && 마지막 두 원소가 같은 캐릭터라면
        if(_list.size() > 1 && (_list.get(_list.size() - 2) == _list.get(_list.size() - 1))){
                // 마지막 두 원소 제거
                _list.remove(_list.size() - 1);
                _list.remove(_list.size() - 1);
        }
    }
}