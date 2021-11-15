# 자동차 경주 - 단위 테스트

## 🚀 3단계 - 자동차 경주

### 기능 요구사항

- **주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.**
    - 자동차 전진 기능
    - 자동차 정지 기능
- **사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.**
    - 차 수 입력 기능
    - 이동 횟수 입력 기능
- **전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.**
    - 자동차 랜덤 이동 기능 (0~3: 정지, 4~9: 전진)
- **자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.**
    - 자동차 상태 출력 기능
  
### 프로그래밍 요구사항

- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- else 예약어를 쓰지 않는다 (switch도 X)
- 커밋 로그 요구사항

```text
feat (feature)
fix (bug fix)
docs (documentation)
style (formatting, missing semi colons, …)
refactor
test (when adding missing tests)
chore (maintain)
```

## 🚀 4단계 - 자동차 경주(우승자)

### 기능 요구사항

- **각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.**
  - 자동차 이름 부여 기능
    - 이름 부여 정상 시나리오 테스트
    - 이름 부여 5자 초과 실패 시나리오 테스트
- **전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.**
  - 출력 시 이름 같이 출력할 수 있도록 기능 추가 (구체적 테스트 X)
- **자동차 이름은 쉼표(,)를 기준으로 구분한다.**
  - 자동차 이름 입력 기능 추가 (구체적 테스트 X)
- **자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.**
  - 경주 게임 우승 기능 추가
    - 우승자 한 명 테스트
    - 우승자 여러 명 테스트

### 프로그래밍 추가 요구사항

- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.