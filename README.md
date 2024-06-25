# Mini-Bank Middle Layer

Этот проект представляет собой middle-слой "Мини-банк" приложения, реализованного на Java с использованием Spring Boot. Middle-слой обрабатывает запросы от фронтенда (Telegram-bot) и взаимодействует с бэкендом для выполнения бизнес-логики.

## Технологии

- Java 17
- Spring Boot
- Spring WebFlux (WebClient)
- Gradle
- DTO (Data Transfer Objects)

## Структура проекта

├── main
│   ├── java
│   │   └── com
│   │       └── sabinaber
│   │           └── berezinabot
│   │               ├── MiddleLayerApplication.java
│   │               ├── application
│   │               │   └── service
│   │               │       ├── AccountService.java
│   │               │       ├── TransferService.java
│   │               │       └── UserService.java
│   │               ├── config
│   │               │   └── WebClientConfig.java
│   │               ├── domain
│   │               │   ├── model
│   │               │   │   ├── Account.java
│   │               │   │   ├── Transfer.java
│   │               │   │   └── User.java
│   │               │   ├── service
│   │               │   └── usecase
│   │               ├── dto
│   │               │   ├── AccountsListResponseV2DTO.java
│   │               │   ├── CreateAccountRequestV2DTO.java
│   │               │   ├── CreateTransferRequestV2DTO.java
│   │               │   ├── CreateUserRequestV2DTO.java
│   │               │   ├── ErrorResponseV2DTO.java
│   │               │   ├── TransferResponseV2DTO.java
│   │               │   └── UserResponseV2DTO.java
│   │               ├── infrastructure
│   │               │   └── controller
│   │               │       ├── AccountController.java
│   │               │       ├── TransferController.java
│   │               │       └── UserController.java
│   │               └── services
│   │                   └── UserService.java
│   └── resources
│       ├── application.yml
│       ├── static
│       └── templates
└── test
    └── java
        └── com
            └── sabinaber
                └── berezinabot
                    └── BerezinaBotApplicationTests.java

                    
## Установка и запуск

### Предварительные требования

- Java 17 или выше
- Gradle

### Шаги для запуска

1. Клонируйте репозиторий:
    ```sh
    git clone https://github.com/gpb-it-factory/berezina-middle-service
    cd berezina-middle-service
    ```

2. Сборка и запуск приложения:
    ```sh
    ./gradlew bootRun
    ```

Приложение будет доступно по адресу `http://localhost:8082`.

## Примеры использования API

Ту би континуэд...
