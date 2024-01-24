package methodchainingpractice;

public class ChainingObjSample { //메서드 체이닝을 위한 클래스 선언
    int chainCount=0;

    public ChainingObjSample chainMethod(){ //chainMethod을 수행하면 ChainingObjSample을 반환
        this.chainCount+=1; //매번 호출할 때마다 횟수 증가하게 함.
        System.out.printf("Current chainCount is %d\n", this.chainCount); //현재 카운트가 몇인지도 호출
        return this; //리턴 체인카운트를 하면 인티저 값을 리턴해서 끝난 자리에서 또다시 체인메서드를 호출할 수 없게됨.
                        //반환타입이 호출하는 타입과 동일하기만 하면됨.
    }

    public int endChaining(){ //다른타입으로 바꾸고 싶을때에 호출되는 것. 마지막에 엔드 체인하면 int를 반환하고 끝냄.
        this.chainCount+=1;
        System.out.printf("Chaining ends at count %d\n", this.chainCount);
        return this.chainCount;
    }
}
