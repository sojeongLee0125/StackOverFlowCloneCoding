# <center> 😎 세번째 프로젝트 : Stack-Over-Flow 클론 코딩 </center>
<br>

![image](https://user-images.githubusercontent.com/110760593/210284271-2bfc0374-ffdb-41b7-8eaa-c19fb55009b8.png)

## 1. 프로젝트 소개
- 개발자들의 질의응답 커뮤니티인 스택-오버-플로우를 클론코딩하는 프로젝트.

## 2. 개발환경

### 🖥️ Front-end
<img src="https://img.shields.io/badge/Javascript-F7DF1E?style=for-the-badge&logo=JavaScript&logoColor=black"><img src="https://img.shields.io/badge/react-61DAFB?style=for-the-badge&logo=react&logoColor=black"><img src="https://img.shields.io/badge/React Router-CA4245?style=for-the-badge&logo=React Router&logoColor=white"><img src="https://img.shields.io/badge/Redex-764ABC?style=for-the-badge&logo=Redux&logoColor=white"><img src="https://img.shields.io/badge/Axios-181717?style=for-the-badge&logo=Axios&logoColor=white"><br>
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white"><img src="https://img.shields.io/badge/css-1572B6?style=for-the-badge&logo=css3&logoColor=white">

### ⚙️ Back-end
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"><img src="https://img.shields.io/badge/spring boot-6DB33F?style=for-the-badge&logo=spring boot&logoColor=white"><img src="https://img.shields.io/badge/spring security-6DB33F?style=for-the-badge&logo=spring security&logoColor=white"><img src="https://img.shields.io/badge/SPRING DATA JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white"><br/>
<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"><img src="https://img.shields.io/badge/H2-0000bb?style=for-the-badge&logoColor=black">

### 🖇️ ETC
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white"><img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"><img src="https://img.shields.io/badge/github Actions-F05032?style=for-the-badge&logo=github&logoColor=white"><br/>
<img src="https://img.shields.io/badge/amazon ec2-FF9900?style=for-the-badge&logo=amazon ec2&logoColor=white"><img src="https://img.shields.io/badge/amazon s3-569A31?style=for-the-badge&logo=amazon s3&logoColor=white"><img src="https://img.shields.io/badge/amazon rds-527FFF?style=for-the-badge&logo=amazon rds&logoColor=white">

## 3. 제작 기간 및 참여인원
- 2022.12.15(목) - 2023.01.02(월)
- 참여 인원 : 6명

### 👩‍👧‍👦 Team
|FE|FE|FE|BE|BE|BE|
|:---:|:---:|:---:|:---:|:---:|:---:|
|[김응열](https://github.com/Valentin1495)|[배성진](https://github.com/Menat91)|[조강열](https://github.com/CHOGANGYEOL)|[이소정](https://github.com/sojeongLee0125 )|[조혜주](https://github.com/hyejuc)|[최윤정](https://github.com/yulmuu)|
 
## 4. 주요 기능

### 1) User
- 회원가입 및 로그인 유효성 검사 (Spring Security 적용) 
- 유저 정보 조회 및 수정 / 삭제
- 로그인 시 액세스 토큰과 리프레시 토큰이 발급
  - 액세스 토큰으로 유저의 권한을 조회한다.
  - 해당 유저의 권한에 따라 기능 접근이 제한된다.
 
### 2) Question
- 질문 작성 / 조회 / 수정 / 삭제
- 조건에 따른 질문 조회 (등록순, 좋아요 순)
- 질문 Like / DisLike 기능
- 질문과 연관된 태그 추가

### 3) Answer
- 특정한 질문에 대한 답변 생성 / 수정 / 삭제
- 답변 Like / DisLike 기능

## 5. Project Rules

### 1) 매일 Pm 05:00 일일 스크럼 회의 참석하기
- 현재 진행상황 및 차후 계획 보고
- 이슈 발생 상황 보고 

### 2) Git Commit Convention 지키기
- 기본 형식 : [commit type]: [commit message]
- commit type
  - feat : 기능 구현
  - fix : 버그 수정
  - docs : 문서 작업
  - refactor : 리팩토링
  - test : 테스트
  - chore : 기타 작업

### 3) Branch 생성 규칙
- 기본 형식 : [type]/[feature]
- 기능 구현이 완료되면 Main Branch PR 남기기
- PR 후 Merge된 브랜치는 삭제하기

## 6. 회고
- RefreshToken을 현재 메인 DB에 저장 및 관리 -> 캐시 서버를 활용하는 방식으로 전환해보기
- N+1 문제를 방지하기 위한 FetchJoin 활용 -> 페이징 시 limit 없이 모든 데이터 메모리에 로드하는 문제
- Fetch Join + 페이징 처리 시 발생하는 문제를 해결하는 방법 고민하기
- 테스트 코드에서 스프링 시큐리티 필터 호환성 문제 해결하는 방법 고민하기
