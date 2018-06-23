## 责任链模式应用理解  (个人理解)

 责任链模式在各种开源框架中的应用非常的广泛，包括但不限于 `Netty` , `Sevlet规范中的Filter` `Blade` 
 都无一例外的使用了责任链模式。通过使用责任链模式来提高框架，系统的`可维护性`和`可定制性`。能够根据系统不同的业务，对于
 系统不同的理解去定制一些 `Filter` 提高系统的处理。
 
 责任链链模式引入插拔式的开发模式，除了开源框架(系统)自带的 `Filter` 之外，业务处理也能够继承，或者实现某一个接口
 来引入，通过这种拦截的模式，提供了对系统细粒度的控制和观察。甚至能够通过拦截去计算`http 并发`等等
 
 因此只要系统、框架提供了拦截器，那么就可以使用一些定制的拦截器去提供系统的应用，具体的定制规则可以根据系统的要求去实现