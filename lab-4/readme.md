Lab4

Instructions to run:
Run config server
java -jar ../lab-3/lab-3-server/target/lab-3-server-0.0.1-SNAPSHOT.jar

Run eureka server:
java -jar -Dspring.profiles.active=primary lab-4/lab-4-eureka-server/target/lab-4-eureka-server-0.0.1-SNAPSHOT.jar

Run sentence server:
java -jar lab-4/lab-4-sentence/target/lab-4-sentence-0.0.1-SNAPSHOT.jar

Run word server:
java -jar -Dspring.profiles.active=subject lab-4-word/target/lab-4-word-0.0.1-SNAPSHOT.jar
java -jar -Dspring.profiles.active=verb lab-4-word/target/lab-4-word-0.0.1-SNAPSHOT.jar
java -jar -Dspring.profiles.active=article lab-4-word/target/lab-4-word-0.0.1-SNAPSHOT.jar
java -jar -Dspring.profiles.active=adjective lab-4-word/target/lab-4-word-0.0.1-SNAPSHOT.jar
java -jar -Dspring.profiles.active=noun lab-4-word/target/lab-4-word-0.0.1-SNAPSHOT.jar

Check:
Config - http://localhost:8001/lab-3-client/default/
Eureka server - http://localhost:8011/
Sentence - http://localhost:8020/sentence
