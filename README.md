# API-REST.Santander.DIO
Java RESTful API created for Santander.DIO

## Diagram Class

```mermaid

classDiagram
  class User {
    -name: string
    -acount: Account
    -features: Feature[]
    -card: Card
    -news: News[]
  }

  class Account {
    -Number: string
    -Agency: string
    -Balance: float
    -Limit: float
  }

  class Feature {
    -icon: string
    -description: string
  }

  class Card {
    -Number: string
    -Limit: float
  }

  class News {
    -icon: string
    -description: string
  }

  User "1"*--"1" Account
  User "1"*--"N" Feature 
  User "1"*--"1" Card 
  User "1"*--"N" News 


```


## API Documentation  (Swagger)
https://api-restsantanderdio-production.up.railway.app/swagger-ui.html

This API will be available on Railway for a limited period of time, but this is open source.

Production URL: https://api-restsantanderdio-production.up.railway.app/users/1
