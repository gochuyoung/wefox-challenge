## About The Project

Case study for the SDET position at [wefox](https://www.wefox.com/en-de)\
Done by Krzysztof Bursztynowicz


### Built With
List of main tools used in this project
* [Gradle](https://gradle.org/)
* [Spock](http://spockframework.org/spock/docs/1.3/index.html)
* [REST-assured](http://rest-assured.io/)


## How to run


### Prerequisites

Java 18+ installed

### Installation

1 Clone the repository and import the gradle project\
2 Execute the following command in the main project directory
```sh
make test-exec
```

The implemented test case is located in the `AccidentSpedictionSpec.groovy` file\
Project is divided into 5 sections: dtos, factories, services, utils and tests\
Configuration parameters can be set in `/resources/config.yaml` file

### Reports & logs
Report with all logs is generated in `build/reports` directory, it contains the execution summary
and all generated logs\
In order to display the report, open `build/reports/tests/test/index.html` file in a browser\
Each report folder contains the execution timestamp in the name


## Project ownership

[Krzysztof Bursztynowicz](krzysb@pm.me)





