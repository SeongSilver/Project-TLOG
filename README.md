<div align="center">
<img src="https://user-images.githubusercontent.com/95121282/216059524-b873bc43-dd12-44fd-bf08-806f929fdb35.png" width="300" height="auto">
</div>


# T-LOG
여행을 기록하고 다른 사람들과 나눌 수 있는 공유 웹서비스
  



---
  
## :pushpin: 프로젝트 설명
 
:computer: 개발환경  
* IDE  


&emsp;<img src="https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=Spring&logoColor=white"/>

* Frontend  


&emsp;<img src="https://img.shields.io/badge/Html5-E34F26?style=flat&logo=Html5&logoColor=white"/> <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=CSS3&logoColor=white"/> <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=JavaScript&logoColor=white"/>   <img src="https://img.shields.io/badge/jQuery-0769AD?style=flat&logo=jQuery&logoColor=white"/> <img src="https://img.shields.io/badge/Bootstrap-7952B3?style=flat&logo=Bootstrap&logoColor=white"/>



* Backend  


&emsp;<img src="https://img.shields.io/badge/JAVA-ff0000?style=flat&logo=JAVA&logoColor=white"/> <img src="https://img.shields.io/badge/Jsp-000000?style=flat&logo=Jsp&logoColor=white"/> <img src="https://img.shields.io/badge/Mybatis-000000?style=flat&logo=Mybatis&logoColor=white"/> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=flat&logo=apache tomcat&logoColor=white"/>


* DB  


&emsp;<img src="https://img.shields.io/badge/MySQL-4479A1?style=flat&logo=MySQL&logoColor=white"/>


* etc  


&emsp;<img src="https://img.shields.io/badge/Git-4479A1?style=flat&logo=Git&logoColor=white"/> <img src="https://img.shields.io/badge/GitHub-181717?style=flat&logo=GitHub&logoColor=white"/> <img src="https://img.shields.io/badge/Sourcetree-0052CC?style=flat&logo=Sourcetree&logoColor=white"/>
                
:runner: 팀원  
<div align="center">
<img src="https://user-images.githubusercontent.com/95121282/216060141-277093eb-7e32-4fb2-8bd2-072545cdd7e7.png" width="800" height="auto">
</div>



---
  
## :pushpin: 목차  
[1. 개발 로그](#개발-로그)  
[2. 프로젝트 사용 방법](#프로젝트-사용-방법)  
[3. 참고 자료](#참고-자료)

---
  
## 개발 로그


## dependencies  
```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-jdbc'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'mysql:mysql-connector-java'
	providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	
	//<---------- 추가한 의존성 START---------
	// 1) Tomcat
	implementation 'org.apache.tomcat.embed:tomcat-embed-jasper:9.0.60'
	// 2) JSTL
	implementation 'javax.servlet:jstl:1.2'
	// 3) JSON
	implementation 'org.json:json:20211205'
	// 4) inject
	implementation group: 'javax.inject', name: 'javax.inject', version: '1'
	// 5) 파일 업로드 세팅
	implementation group: 'org.apache.commons', name: 'commons-lang3', version: '3.12.0'
	implementation group: 'commons-io', name: 'commons-io', version: '2.11.0'
	implementation group: 'commons-fileupload', name: 'commons-fileupload', version: '1.4'
}
```

## DB
![DB](https://user-images.githubusercontent.com/95121282/216060559-15d5438a-580f-4283-a2c4-176df11461b1.JPG)



---


## 프로젝트 사용 방법
### 프로젝트 시작 방법  
sts Boot Dashboard 탭에서 시작 버튼으로 실행  
![project_start](https://user-images.githubusercontent.com/95121282/216060960-448aaa69-725b-4a30-a120-2ee278aff78b.png)  


* 메인페이지
![그림1](https://user-images.githubusercontent.com/95121282/216067239-8d36bf37-0bf5-430c-a0c1-ed2c36ff2dba.png)
![그림2](https://user-images.githubusercontent.com/95121282/216067245-4f7aa38c-8b39-4248-9b5f-a864bf088cd1.png)
![그림3](https://user-images.githubusercontent.com/95121282/216067251-09b043ff-a9dc-4208-a4a2-63ee5aad5436.png)
![그림4](https://user-images.githubusercontent.com/95121282/216067253-4279ef63-7efc-4b93-b6ff-59702db960bc.png)


* 로그인 및 카카오 회원가입 시 추가 정보 입력(프로필 이미지, 닉네임, 태그)
![KakaoTalk_20220805_001147180](https://user-images.githubusercontent.com/95121282/216068204-b4968c83-be10-47e9-b153-269fb76f0c5c.png)
![43](https://user-images.githubusercontent.com/95121282/216068208-2326003a-3777-474e-a909-2c18e970ddc2.png)


* 여행일기 리스트 : 각 게시물의 글 작성 시 선택한 대표 이미지, 좋아요 수, 제목, 위치, 기간, 태그 확인 가능 /  
왼쪽 상단에서 좋아요 순 및 업로드 순 정렬 가능 / 우측 상단에서 작성자, 제목, 태그 선택 후 검색 가능
![그림5](https://user-images.githubusercontent.com/95121282/216067256-460aa33a-ac49-4c81-b9b8-f542a1050aeb.png)


* 자유일기 : 서비스 이용자들이 자유롭게 댓글형식으로 일기를 적는 공간, 광고배너 및 댓글 유효성 검사 구현
![그림8](https://user-images.githubusercontent.com/95121282/216067278-b3c2f334-e97c-45c2-b0dc-2ce0ffc2fb18.png)
![그림9](https://user-images.githubusercontent.com/95121282/216067282-433bb8d6-3009-4797-b0d6-bd80971d77a2.png)


* 
![그림10](https://user-images.githubusercontent.com/95121282/216067284-68dddae5-9100-4514-8f5b-5df31da8f2dc.png)
![그림11](https://user-images.githubusercontent.com/95121282/216067288-559fe666-23ae-4214-b6a7-e02b6883ebfe.png)
![그림12](https://user-images.githubusercontent.com/95121282/216067295-c6ecb5a6-45ae-4a90-8ef8-aaf436172eb8.png)
![그림13](https://user-images.githubusercontent.com/95121282/216067297-e2e56800-ec95-4e0d-beee-1d8ff23f52a8.png)
![그림14](https://user-images.githubusercontent.com/95121282/216067310-eab43dcc-d5f7-4904-a5f6-671f608f627f.png)
![그림15](https://user-images.githubusercontent.com/95121282/216067314-0593375b-5cdf-497e-9648-d5d0da048b1b.png)
![그림16](https://user-images.githubusercontent.com/95121282/216067318-3b168c34-b62c-4410-9167-e5dd57806707.png)
![그림17](https://user-images.githubusercontent.com/95121282/216067321-87199e08-a12e-4684-9914-b808d72d6a84.png)
![그림18](https://user-images.githubusercontent.com/95121282/216067327-8b6af146-adba-4050-8217-c36d96325dbc.png)
![그림19](https://user-images.githubusercontent.com/95121282/216067223-fc55089f-b42e-4ed6-add6-5b830724568b.png)
![그림20](https://user-images.githubusercontent.com/95121282/216067237-5d5ae1f5-6db8-4608-8f63-8aab052f5022.png)






---
## 참고 자료
