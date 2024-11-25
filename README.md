# kotlin-lotto

## 1단계 - 문자열 덧셈 계산기

### 기능 요구 사항

- 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
- 앞의 기본 구분자(쉼표, 콜론) 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
- 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 **RuntimeException** 예외를 throw 한다.


## 2단계 - 로또(자동)

### 기능 요구사항

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### 구현 기능 목록

- [x] 로또 티켓은 6개의 번호를 가진다
- [x] 로또 각 번호는 오름차순으로 정렬한다
- [x] 로또 번호는 1부터 45까지만 가능하다
- [x] 똑같은 로또 번호가 존재하면 예외를 던진다
- [x] 로또 티켓 머신은 티켓 구매 가격(1000원) 미만의 돈을 받으면 예외를 던진다
- [x] 로또 티켓 머신은 1000원 당 한 개의 로또 티켓을 자동 발급한다
- [x] 로또 티켓 머신의 잔액이 티켓 1장 가격보다 적으면 발권 시 null을 반환한다
- [x] 로또 당첨 검사기는 로또 1등 당첨 번호(티켓)을 입력 받는다
- [x] ~~로또 당첨 검사기는 로또 티켓을 받아 1등 티켓과 일치하는 당첨 번호 수를 알 수 있다~~
- [x] 당첨 결과는 일치하는 번호 숫자를 받아 찾을 수 있다
- [x] 로또 당첨 검사기는 로또 티켓을 받아 당첨 결과를 조회할 수 있다
- [x] 당첨 보드는 당첨 결과 리스트를 받아 생성하고 알고 싶은 당첨 결과를 받아 당첨 횟수를 알 수 있다
- [x] 로또 티켓 머신은 총 티켓 구매 비용을 제공할 수 있다
- [x] 당첨 보드는 총 티켓 구매 비용과 총 복권 당첨 금액으로 수익률을 계산할 수 있다

- [x] UI 로직 구현

## 3단계 - 로또(2등)

### 기능 요구사항

- 2등을 위해 추가 번호를 하나 더 추첨한다. 
- 당첨 통계에 2등도 추가해야 한다.

### 구현 기능 목록

- [x] 로또 티켓은 보너스 로또 번호와 일치하는 로또 번호를 가지고 있는지 판단할 수 있다
- [x] 로또 당첨 결과 중 기본 5개 일치 및 보너스 번호 1개 일치는 2등으로 추가한다
- [x] 로또 당첨 검사기는 로또 티켓 체크 시 보너스 로또 번호 포함 여부까지 검사해 당첨 결과를 반환한다
- [x] 로또 당첨 검사기는 보너스 로또 번호를 기존 1등 로또 티켓 번호에 포함되지 않는 로또 번호만 받을 수 있다


## 4단계 - 로또(수동)

### 기능 요구사항

- 현재 로또 생성기는 자동 생성 기능만 제공한다. 사용자가 수동으로 추첨 번호를 입력할 수 있도록 해야 한다. 
- 입력한 금액, 자동 생성 숫자, 수동 생성 번호를 입력하도록 해야 한다.

### 프로그래밍 요구사항

- 모든 원시값과 문자열을 포장한다. 
- 예외 처리를 통해 에러가 발생하지 않도록 한다.

### 구현 기능 목록

- [ ] LottoTicketMachine 구입금액(잔액) 을 가지고 발급할 수 있는 LottoTicket 개수를 체크할 수 있다
- [x] LottoTicketMachine 은 수동으로 로또 번호를 받아 로또 티켓을 발급할 수 있다

- [x] 금액 관련 Int 는 Money 로 포장한다
- [x] 수익률의 Double 값은 Returns 로 포장한다
