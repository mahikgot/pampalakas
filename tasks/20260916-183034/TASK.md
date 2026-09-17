# IoC/DI without Boot's magic

- STATUS: CLOSED
- PRIORITY: 100
- TAGS: spring

## Task
Build a tiny app with a manual `AnnotationConfigApplicationContext`,
at least 3 beans with a real dependency chain (A->B->C), and deliberately
force a circular dependency between two of them.

## Question
Whats the actual exception and where in the bean-creation graph does Spring
detect it? Does switching one bean to prototype scope change whether
the error happens at all?

UnsatisfiedDependencyException and further down BeanCurrentlyInCreationException
No, why would it? 

## Notes
ambiguity can be resolved by @Primary, @Fallback, and @Qualifier annotations
can autowire all wanted beans of same type(generics also) or pass qualifier into collections

when a singleton has dependency on prototype, the prototype is only instantieated once.
if you want to have the prototype instantiated everytime it is injected/used by the singleton,
you have to do method injectino using @Lookup with abstract method

`https://docs.spring.io/spring-framework/reference/core/beans.html`
