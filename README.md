# Entity-Management-System-Spring-MVC-
Two web portals that communicates using Java RMI, that works as an bank ATM.

  It is always not necessary that the client credentials are to be revealed to client side server in online transactions.
  Being a customer of a bank, have you ever made any transactions from the other bank Atm. Let’s say you are a customer of SBI bank, 
  and you are making some transaction in ICICI bank ATM, have you ever thought how are the transactions held. Here comes the Java RMI,
  this method is executed using a proxy object , that does not reveal any details of the customer to ICICI bank server and gets your job done by reaching SBI server.
  This execution takes place using proxy objects. Client side there will be proxy handler and in server side proxy is handled by setting the reference from stub to respective object.
  Here we have created two web portals to demonstrate working of transactions that occur across different bank servers using Java RMI without revealing credentials of customer to client side server.

In online transactions, client gives credentials so as to perform transactions. All the time it is not necessary that credentials are revealed to client side server. In real life, when you go into an atm of a different bank than yours here transaction is made using proxy object so that no details of yours are revealed to that bank.Using proxy object is facilitated by Java RMI.
In RMI, communication between client and server is made using remote object. So that only object reference is passed to the server, keeping details of client hidden to client side server.To execute RMI there are several methods in Spring MVC framework.We’ve to use Spring MVC framework, so as to create web portals and at the same time communicate them using Java RMI.
Since security for customer details is the most important thing, it is crucial to communicate to server without revealing the details to the client side server.Here we’ve created two web portals one as the ATM (client side) and the other is Bank Server (Server side) which are able to communicate, without revealing details to client side server.
As a real life example we’ve created a database such as bank database with customer list and their details.Our web portals show balance enquiry and you can add money using the machine.

It is important to know Java RMI working.
RMI stands for Remote Method Invocation, means communicating object across network.
RMI is a type of system that allows an object running in one JVM (Client) to invoke method on an object running in another JVM(Server).
RMI is executed using stub and skeleton at client and server respectively. Stub and Skeleton are responsible for the communication.
 Stub is a client side proxy that handles remote objects which    are getting from the reference.
Skeleton is a server side proxy that set the reference to objects that communicate to stub.




Workflow Model:
First Phase: Application Execution on consoles
             In the first phase we have learnt Java RMI concepts and executed our application on consoles using RMI purely.

Second Phase: Spring Basics
Here we’ve got to learn basins of spring concepts.
 DI (Dependency Injection)
 Spring MVC
 Spring with RMI.
 Spring MVC with CRUD

Third Phase: Application execution on web portals
         In the last phase after learning all the spring concepts we got to complete our objective. So we created our application on two web portals using Spring MVC, spring with RMI.

Technologies Used:
  Java RMI
Spring MVC
Spring with RMI
MySQL(Database)
Eclipse(IDE)

Application Workflow:
   Application Workflow with RMI layers and respective functioning
  Client Request:
                Request from clients is obtained using JSP files.Client gives input in the jsp file requesting to show balance or to add amount.

Stub Layer:
                 Client side proxy handling is done using Client Invoker file which is a java file.From jsp file with respective parameters, Client Invoker assigns object data source bean and method.

 Remote Reference Layer:
                   Connection between reference and remote object in server is done using Controller class, that is a java file.Here the connection is established between client and the server side using controller class, where the reference is shown its method respectively with its data source bean attached.

 Skeleton Layer:
                   Server side proxy handling is done using Http Invoker file which is a xml type file.Here the reference have its appropriate method and data source bean attached.Proxy handling is done here.
   
 

Application Layer:
                 Code execution is done using file with all methods and views are returned using controller file.Both are java files.Actual code is executed in this layer, reference from client side is set to its respective remote object.
Here reference gets executed with its method and return with new view.
Problems Faced:
Connection between two machines is the major problem we’ve faced, this took most of the time to get it solved.
 It was important to ping between two machines before    establishing the connections.
We’ve used static IP’s to make connection between two machines.
Making Spring programs work on two machines was also a big problem.
 We’ve to put all the class files of server in the client side to make them work.
 To learn working of spring with RMI and Spring MVC has been a big problem.
Future Work:
 We can make same application displaying results in GUI.
Application can be executed on three machines in a practical way.


