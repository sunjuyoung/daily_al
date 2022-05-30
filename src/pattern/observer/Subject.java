package pattern.observer;

public interface Subject {
    /**
     * 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고
     * 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의합니다
     * 
     * 일련의 패턴은 일련의 객체사이에서 일대다 관계를 정의합니다
     * 한 객체의 상태가 변경되면 그 객체에 의존하는 모든 객체에 연락이 갑니다.
     * 
     */

     public void registerObserver(Observer o);
     public void removeObserver(Observer o);

     //주제의 상태가 변경되었을때 모든 옵저버에게 변경 내용을 알린다
     public void notifyObserver();
}


