# com.ubisam.persons.parkjinwon3

## 1. Maven 프로젝트 + Docker 컨테이너 실행 (세미나 이전)

1. `docker Desktop` 실행

2. `.jar` 파일 생성 명령어 실행
``` bash
.\mvnw clean package -DskipTests 
```

3. `docker-compose` 프로그램 실행
```bash
# DB 결과 확인하려면 DBeaver도 켜야함.
docker-compose up -d
```

## 2. Maven 프로젝트 + Docker 컨테이너 종료
```bash
docker-compose down 
```
---
---
---
---
---
---
---
---
---
---
---

## 1. Maven 프로젝트 + Docker 컨테이너 실행 (세미나 이후)

1. `docker Desktop` 실행

2. 터미널에서 명령어 실행 (**버전은 이미지 마다 다를 수 있음.**)
```bash
# MySQL
docker pull mysql:9.5.0
docker run --name=mydata -p 3306:3306 -v C:/yourdata:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=docker123 -d mysql:9.5.0
```
```bash
# PostgreSQL
docker pull postgres:latest
docker run --name postgres-db -p 5432:5432 -e POSTGRES_PASSWORD=1234 -e POSTGRES_DB=rest -d postgres:latest
``` 
```bash
# MSSQL
docker pull mcr.microsoft.com/mssql/server:2025-latest
docker run -e "ACCEPT_EULA=Y" -e "MSSQL_SA_PASSWORD=StrongP@ssw0rd!" -p 1433:1433 --name sql1 --hostname sql1 -d mcr.microsoft.com/mssql/server:2025-latest

```

2. 등록

3. 조회

-- test랑 메인이랑 
    '>'화살표 클릭 = .\mvnw spring-boot:run
