# spring-boot-mongo-crud
Spring boot application using mongo db and open api specification
<p align="center">

<img alt="PRs Welcome" src="https://img.shields.io/badge/PRs-welcome-brightgreen.svg" />
<img alt="Maintained | Yes" src="https://img.shields.io/badge/Maintained%3F-yes-green.svg" />
<img alt="Ask me anything" src="https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg" />
<img alt="Maintained" src="https://img.shields.io/pypi/l/ansicolortags.svg" />
<img alt="issues open 0" src="https://img.shields.io/github/issues/Naereen/StrapDown.js.svg" />
<img alt="open source" src="https://badges.frapsoft.com/os/v1/open-source.svg?v=103" />
</p>

<p align="center"><img src="https://miro.medium.com/v2/resize:fit:1172/1*Ycnld_XVz7GKsmRu8--LuQ.png" alt="header image" width="600px"></p>

# Open API Spec
1. Click [here](https://editor.swagger.io/?raw=https://raw.githubusercontent.com/path/to/file.yaml) to view the open api specs

# Folder Structurfe

```bash
.
└── src
    ├── main
       ├── java   
            └── com.spring.product
                └── controller
                └── integrator
                └── repository
                └── service
                └── ProductApplication.java
       |── resources
    |── test
        ├── java
        │   └── com.simpleproject
        │       └── SimpleClassTest.java
        └── resources
```

# Mongo DB Configuration

1. Install [Mongo DB](https://www.mongodb.com/docs/manual/installation/)
2. Install [Mongo Compass](https://www.mongodb.com/products/tools/compass)
3. Start server by copy pasting in your terminal `brew services start mongodb-community@6.0`
4. Open Mongo Compass and paste the following in your URI `mongodb://localhost:27017` & click on `Connect`
5. Your Mongo DB will be live on `localhost:27017` server
6. To stop the server, copy & paste the following in your terminal `brew services stop mongodb-community@6.0`

# Spring Configuration
1. Download [Maven](https://maven.apache.org/install.html) on windows OR copy and paste in your Mac terminal `brew install maven`
2. Download the project
3. Open the root terminal and run `mvn clean install`
4. Run the application
5. Application will be live on localhost:9000


<p align="center">
<img alt="PRs Welcome" src="https://forthebadge.com/images/badges/built-with-love.svg" />
</p>

