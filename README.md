# design-pattern


## 1. 전략패턴
알고리즘군을 정의하고 캡슐화해서   
각각의 알고리즘군을 수정해서 쓸 수 있게 해 줍니다.   
전략 패턴을 사용하면 클라이언트로부터 알고리즘을 분리해서 독립적으로 변경할 수 있습니다.
https://gyoogle.dev/blog/design-pattern/Strategy%20Pattern.html

## 2. 옵저버 패턴
옵서버 패턴은 객체의 상태 변화를 관찰하는 관찰자들,    
즉 옵저버들의 목록을 객체에 등록하여 상태 변화가 있을 때마다   
메서드 등을 통해 객체가 직접 목록의 각 옵저버에게 통지하도록 하는 디자인 패턴이다.   
주로 분산 이벤트 핸들링 시스템을 구현하는 데 사용된다.

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체에게 연락이 가고   
자동으로 내용이 갱신되는 방식으로
일대다(OneToMany) 의존성을 정의합니다.
https://gyoogle.dev/blog/design-pattern/Observer%20Pattern.html