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






---
## 참고 자료
