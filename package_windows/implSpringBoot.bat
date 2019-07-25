@echo off

cd ../ManagementSystem

mvnw spring-boot:run -Ddbip=%1 & timeout /t 2 && start openPage.url

pause