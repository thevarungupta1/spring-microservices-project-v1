# Distributed Tracing
as the complexity of microservices architecture increases, uniform observability accross the services and server instanbce become critical, each service request passes through multiple service layer, and identifying latency or any other runtime issues become increasingly difficult using traditional debugging techniques

distributedf tracing provides a hoslistic view of request tracing through multiple servers allowing for imediate identification of issue


span - a span is an individual operation
trace - a trace is an end-to end latency graph, compose of span
tracers - it record span and passes context required to connect them into a trace



# Zipkin
it is an open source distributed system that provides mechanism for sending, reveving, storing and visualizing traces details. this help the team to correlate activities between the server instance and get much more deeper understaning of exactly what is going on in our services

it also provides UI interface to analyze the traces and call graph detail between the services



# STart Zipkin

1. docker
docker run -d -p 9411:9411 openzipkin/zipkin

2. jar file
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar


http://localhost:9411/zipkin




<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-sleuth-zipkin</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-sleuth</artifactId>
		</dependency>