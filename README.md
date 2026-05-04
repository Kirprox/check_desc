# CheckDesc Service

Сервис checkdesc предназначен для хранения и предоставления информации о доступных экзаменах (тестах).

Сервис реализован на Spring Boot и является частью микросервисной системы, развернутой в Kubernetes.

### Назначение сервиса

Сервис хранит описание экзаменов и предоставляет API для получения информации о них.

#### Каждый экзамен содержит:

id экзамена

название экзамена

### Клонирование проекта

Проект состоит из трёх репозиториев и имеет следующую структуру:
```
project/
├── check_desc/
├── check_exam/
└── check_infra/
```

check_desk - https://github.com/Kirprox/check_desc

check_exam - https://github.com/Kirprox/check_exam

check_infra - https://github.com/Kirprox/check_infra

Необходимо скачать их в одну папку.

### Сборка Docker-образа

Сборка и публикация образа выполняется автоматически через bat-файл из репозитория check_infra.

### Запуск в Kubernetes

Перейти в папку check_infra
Выполнить:
kubectl apply -f k8s/

Включить ingress (если не включен):
minikube addons enable ingress

При необходимости выполнить:
minikube tunnel

### Доступ к API

После запуска сервис доступен по адресу:
http://127.0.0.1/desc - вернет список экзаменов

http://127.0.0.1/exam - вернет список пользователей и их экзаменов





