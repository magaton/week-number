# week-number

Demonstrates how env variables user.country and user.language are picked up when constructing default locale.


java -Duser.country=US -Duser.language=EN -jar target/demo-0.0.1-SNAPSHOT.jar "2021-05-01"

java -Duser.country=IT -Duser.language=IT -jar target/demo-0.0.1-SNAPSHOT.jar "2021-05-01"