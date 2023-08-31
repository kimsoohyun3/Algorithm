// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
public class SumMatrix {
    int[][] sumMatrix(int[][] A, int[][] B) {

        int rowLength = Math.max(A.length, B.length);
        int colLength = Math.max(A[0].length, B[0].length);

        int[][] answer = new int[rowLength][colLength];

        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                answer[i][j] = A[i][j]+B[i][j];
            }
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumMatrix c = new SumMatrix();
        int[][] A = { { 1, 2 }, { 2, 3 } };
        int[][] B = { { 3, 4 }, { 5, 6 } };
        int[][] answer = c.sumMatrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6 && 
                answer[1][0] == 7 && answer[1][1] == 9) {
            System.out.println("맞았습니다. 제출을 눌러 보세요");
        } else {
            System.out.println("틀렸습니다. 수정하는게 좋겠어요");
        }
    }
}