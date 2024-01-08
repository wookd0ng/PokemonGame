package example;

public class Try_Catch {
    public static void  main(String[] args) {
        boolean division = false;
        while (!division) {
            try {
                division(10, 0);
            } catch (RuntimeException e) {
                System.err.println("0으로 나눌 수 없습니다"); //throw e 도 가능, 사실 에러복구 하는게 제일 좋아서 System.err.println("0으로 나눌 수 없습니다");가 좋음
            }
        }
    }
    public static float division(int a, int b){
        return a/b;
    }
}
