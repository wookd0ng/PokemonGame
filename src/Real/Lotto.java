package Real;

import java.util.ArrayList; //1. import
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto {
    public static void main(String[] args){
        int number = 0;
        List<Integer> Lotto = new ArrayList<>(10000); //2. ArrayList 객체 생성
        Random numberPicker = new Random();
        while (Lotto.size() < 6){
            int winningNumber = numberPicker.nextInt(45)+1;
            if (Lotto.contains(winningNumber)){ // 이전 번호와 중복이면
                continue;
            }
            Lotto.add(winningNumber); // 복권 번호 순서 정렬
        }
        Collections.sort(Lotto);
        // ---------------------

        int howManyDoYouBuyLottery = 0;
        List<Integer> myLottery = new ArrayList<>();
        while (!myLottery.equals(Lotto)){ //list에서는 equals이고, set에서는 containsAll임.
            myLottery = new ArrayList<>();
            while (myLottery.size() < 6){
                int boughtNumber = numberPicker.nextInt(45)+1;
                if (myLottery.contains(boughtNumber)){
                    continue;
                }
                myLottery.add(boughtNumber);
                howManyDoYouBuyLottery++;
            }
            Collections.sort(myLottery); // 복권 번호 순서 정렬
            // System.out.println(myLottery); // 잘 사고 있는지 확인용
        }
        long howMuchDoYouSpentMoneyLottery = (long)howManyDoYouBuyLottery * 1000;
        System.out.println("당첨 되었습니다 ! 당첨 번호 : "+Lotto);
        System.out.println("당신이 산 복권 번호 : "+myLottery);
        System.out.println("당신이 여태까지 산 복권의 개수를 기억하시나요? : "+howManyDoYouBuyLottery);
        System.out.println("당신은 복권에 무려 "+howMuchDoYouSpentMoneyLottery+" 원이나 쓰셨습니다!");
    }
}



