package OrderManager;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



class CarWashProcessor {
    //주요기능을 수행하는 클래스.
    private final Timer timer;
    //
    private int elapsedTime;
    private int costPerSecond;
    private Scanner sc;
    private boolean extensionRequested;
    private boolean timerPaused = false;

    public CarWashProcessor() {
        this.sc = new Scanner(System.in);
        this.timer = new Timer();
        this.elapsedTime = 0;
        this.costPerSecond = 3000;
        this.extensionRequested = false;
    }

    public void chooseModel() {
        System.out.println("[세차하실 차량의 모델을 선택하세요]");
        System.out.println("1.[Mercedes-Benz]");
        System.out.println("2.[BMW]");
        System.out.println("3.[Audi]");
        int selectedCarModel = sc.nextInt();
        if (selectedCarModel == 1) {
            System.out.println("1.[Mercedes-Benz](을)를 선택하셨습니다.");
        } else if (selectedCarModel == 2) {
            System.out.println("2.[BMW](을)를 선택하셨습니다");
        } else if (selectedCarModel == 3) {
            System.out.println("3.[Audi](을)를 선택하셨습니다");
        }
    }

//    public void chooseMode() {
//        System.out.println("[세차 모드를 선택하세요]");
//        System.out.println("1.[프리미엄 모드]");
//        System.out.println("2.[일반 모드]");
//        int selectedMode = sc.nextInt();
//        if (selectedMode == 1) {
//            System.out.println("1.[프리미엄 모드](을)를 선택하셨습니다");
//        } else if (selectedMode == 2) {
//            System.out.println("2.[일반 모드](을)를 선택하셨습니다");
//        }
//    }

    public void choosePayment() {
        System.out.println("[세차가 진행될 예정입니다..]");
        //System.out.println("총 소요 예정 시간: 20 초");
        //System.out.println("총 금액: 10,000원");
        System.out.println("[결제방법]");
        System.out.println("1.[현금]");
        System.out.println("2.[카드]");
        int selectedPayment = sc.nextInt();
        if (selectedPayment == 1) {
            System.out.println("1.[현금]을 선택하셨습니다.");

            System.out.println("[현금투입구에 올바르게 펴서 넣어주세요]");
        } else if (selectedPayment == 2) {
            System.out.println("2.[카드]를 선택하셨습니다.");

            System.out.println("[그림과 같이 IC칩이 하늘을 바라보게 넣어주세요]");
        }
        chooseWay();  // 수정된 부분: choosePayment 이후 chooseWay 호출
    }

    public void chooseWay() {
        System.out.println("[세차 순서]");
        System.out.println("[원하시는 세차방법을 버튼을 눌러주세요]");
        System.out.println("[이벤트! 원하시는 방법을 고르시면]");
        System.out.println("[첫번째 순서에 무료로 사용 가능합니다]");
        System.out.println("[결제는 마지막에 정산됩니다]");
        // Enum 순회 출력해보기
        System.out.println("1.[고압수 세척] ");
        System.out.println("2.[버블폼]");
        System.out.println("3.[브러쉬 모드]");
        System.out.println("4.[종료]");
        //
        int selectedWay = sc.nextInt();
        System.out.println(getWayName(selectedWay));
        startCountUpTimer();
    }

    private String getWayName(int selectedWay) {
        switch (selectedWay) {  // Enum 적용해보기
            case 1:
                return "[고압수 세척]";
            case 2:
                return "[버블폼]";
            case 3:
                return "[브러쉬 모드]";
            case 4:
                System.out.println("[프로그램을 종료합니다]");
                System.exit(0);
                return "[알 수 없음]";
            default:
                System.out.println("[올바르지 않은 입력]");
                return "[알 수 없음]";
        }
    }

    public void startCountUpTimer() {
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {

                if(elapsedTime==0){
                    System.out.println("[세차를 시작합니다]");
                }
                System.out.println("[경과시간: " + elapsedTime + "초]");

                // Check if the elapsed time is a multiple of 5
                if (elapsedTime > 0 && elapsedTime % 5 == 0) {
                    int messageNumber = elapsedTime / 5;
                    switch (messageNumber) {
                        case 1:
                            System.out.println("[5초 경과! 고압수 세척]");
                            break;
                        case 2:
                            System.out.println("[10초 경과! 버블펌]");
                            break;
                        case 3:
                            System.out.println("[15초 경과! 브러쉬 모드]");
                            break;
                        case 4:
                            System.out.println("[20초 경과! 헹굼 모드]");
                            break;
                        case 5:
                            System.out.println("[세차 종료]");
                            timer.cancel();
                            billCustomer();
                            break;

                    }
                }

                elapsedTime++;
            }
        }, 0, 1000);
    }

    public void billCustomer() {
        int totalCost = elapsedTime * costPerSecond;
        System.out.println("[세차가 완료되었습니다]");
        System.out.println("[총 소요 시간: " + elapsedTime + "초]");
        System.out.println("[총 금액: " + totalCost + "원]");
    }
}
