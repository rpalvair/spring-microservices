# spring-microservices

Exemple du load balancing avec Eureka et Ribbon.

2 instances de `AccountServer` sont lancées. Un serveur eureka `RegistrationServer`.

Le `WebController` utilise un `RestTemplate` load balancé(`@LoadBalanced`) via un `@Service` pour accéder à une instance de `AccountServer`. 
