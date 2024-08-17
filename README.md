# Layout Banco Dev
Java RESTful API criada curso para modelar aplicacao bancaria Dev.

## Diagram de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -List~Feature~ features
        -Card card
        -List~News~ news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -String limit
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String cardNumber
        -double cardLimit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *-- "1" Account
    User "1" *-- "1" Card
    User "1" *-- "N" Feature 
    User "1" *-- "N" News
```
