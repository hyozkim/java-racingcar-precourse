# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

### 자동차 경주 게임
1. 참가 레이싱 자동차 이름 입력
2. 게임 횟수 입력
3. 경주 시작 
   1. 모든 레이싱 자동차
      1. `RacingCars.class` 내 List<>로 관리 
      2. 일급 컬렉션
   2. 이동 거리(Random) 추가
      1. `Distance.class` 에서 이동 거리('-') 추가 
      2. 원시값,문자열 포장 
4. 결과 출력
   1. 모든 참가 레이싱 자동차 이름,이동거리 출력
   2. 승리한 사람 이름 출력

### 기능 단위 Commit 리스트
`Input`
- [x] 사용자 n번 이동 입력
- [x] 자동차 이름 입력 (,로 구분)
- [x] Input Exception(횟수, 길이, 사이즈) 로직 추가

`Game Racing`
- [x] 게임 핵심 로직 구현
- [x] 0에서 9 사이에서 random 값 4이상: 전진, 3이하: 멈춤 

`Output`
- [x] 우승자 출력 
- [x] 한명 이상의 경우 , 추가

`Test`
- [x] Test Case 작성

`Refactor`
- [x] 일급 컬렉션 적용
- [x] 원시값과 문자열 포장
- [x] stream 사용안함 조건 적용
- [x] Distance class 생성 (총 이동거리를 표현하기 위함)
- [x] public, private 접근제한자 분리
- [x] InputView, OutputView static 클래스로 변경
- [x] 변수명 좀 더 명확히 수정

`Document`
- [x] ReadMe.md 프로젝트 설명 추가