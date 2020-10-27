# http-capacity-simulator

Contains modules:
  1. delay - the delay server: http://localhost:8081/api/delay?delay=<milliseconds> 
  1. blocking - the blocking server: http://localhost:8082/api/blocking?delay=<milliseconds>
  1. nonblocking - the non-blocking: http://localhost:8083/api/nonblocking?delay=<milliseconds>
  1. ktor - nonblocking with Ktor: http://localhost:8084/api/nonblocking?delay=<milliseconds>