create topic
sudo ./kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic TutorialTopic

Publish:
echo "Hello, World" | ./kafka-console-producer.sh --broker-list localhost:9092 --topic TutorialTopic > /dev/null
echo "Hello World from Sammy at DigitalOcean!" | ./kafka-console-producer.sh --broker-list localhost:9092 --topic TutorialTopic > /dev/null


Consum:
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic TutorialTopic --from-beginning

Ref: https://stackoverflow.com/questions/53428903/zookeeper-is-not-a-recognized-option-when-executing-kafka-console-consumer-sh

Ref: https://www.digitalocean.com/community/tutorials/how-to-install-apache-kafka-on-ubuntu-20-04

