# demoapp

Task:

Do a POC to develop spring boot micro service for search user events send to a kafka topic and indexed in elastic search.


1)write a rest api using them you can push the data to kafka topic named "users"

2)write a kafka listener which reads data from "users" topic and place in elastic search index

3)Write an rest api using which i can query back the  data place in elastic search.

Tech stock:
1) User Spring boot with spring cloud for micro service
2) Setup local elastic search and kafka  using docker
3) Use  IntelliJ and java8
4) Use github
5) User maven or gradle



maven commands used to run this project on eclipse

clean install spring-boot:run

install brew :
/usr/bin/ruby -e "$(curl -fsSL  https://raw.githubusercontent.com/Homebrew/install/master/install)"

install wget:

brew install wget



setting up elastic search :

1) docker pull docker.elastic.co/elasticsearch/elasticsearch:5.6.3
2) docker run -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:5.6.3

default username/password : elastic/changeme
