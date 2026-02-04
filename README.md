## Aston - API Gateway
Часть микросервисного приложения [aston-project](https://github.com/gedfalk/aston-project).

Единая точка входа для всех микросервисов:
- user-service
- notification-service

Помимо API Gateway прописаны контроллеры для Circuit Breaker.


### 🚀 Быстрый старт
```shell
# 1. Поднимаем докер из aston-project
# 2. Запускаем aston-discoveryServer
# 3. Запускаем aston-configServer

# 4. 
git clone https://github.com/gedfalk/aston-apiGateway
cd aston-apiGateway

mvn spring-boot:run

# 5. Запускаем aston-project (user-service)
# 6. Запускаем aston-notificationProject (notification-service)
```
---

### 📡 Проверка

- http://localhost:8080/user/health
- http://localhost:8080/user/api/users
- http://localhost:8080/notification/health
- ...


