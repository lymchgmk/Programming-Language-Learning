# 01장 안녕 Java !!

## 01-1 안녕, 세상 !

### 딜레마

*생략*



### JDK 설치

*생략*



### 자바소스와 컴파일

- jdk가 설치된 디렉토리의 하위 디렉토리인 bin에 `javac.exe` 와 `java.exe` 파일이 존재.
  - `javac` : `java compiler`를 의미. Java는 Python과 다르게 `.java`소스 파일을 `.class`파일로 컴파일 후 `.class`파일을 실행시키는 방식으로 프로그램을 실행함.

![image](D:\GITHUB_임창묵\Programming-Language-Learning\Java\점프 투 자바\images\01_compile.png)

- C / C++ 같은 경우는 JVM을 거치지 않아 빠른 속도의 장점이 있지만, 운영체제마다 별도의 실행파일을 작성해야하는 단점.
- 반대로, 자바는 JVM이라는 중간단계가 있어 C / C++ 보다 느리지만 어떤 OS에서도 사용가능.
  - JIT 도입으로 실행 속도도 거의 근접하게 됨.



### 따라 해보기

*생략*



### 이클립스 설치

- `src`폴더는 `.java` 파일들이 저장
- `bin`폴더는 `.class` 파일들이 저장
- `.classpath`와 `.project`는 현재 프로젝트의 환경값들을 저장



- `package`는 자바 클래스가 위치하고 있는 디렉토리명과 일치
  - [我] `python` 모듈 개념과 흡사?
- `public class`에서 `public`은 일단, 클래스명이 `.java`파일과 같을 경우라 생각



### main 메소드

- 메소드는 클래스 내의 함수.
  - Java는 모든것이 클래스기반이므로 Java의 모든 함수는 메소드라고 부를 수도 있음



- `public` : 메소드의 접근제어자. 누구나 이 메소드에 접근 가능.
- `static` : 이 메소드는 인스턴스 생성없이 실행 가능. 
- `void` : 메소드의 리턴값이 없음.
- `String` : 문자열
- `args[]` : `String` 자료형에 대한 변수명. []가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열을 의미.
- `System.out.println` : 표준출력.



