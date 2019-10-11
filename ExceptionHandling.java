//In a normal execution flow
//An unexpected behavioous that occurs in a normal execution flow is called exception.
//chcked xcptions- Exceptions occurs when you are trying to connect other resources. 
//checked exception. Connecting to files, CPU time, sleep.

Objct->Throwable->Exception
Exception types 
1)SQL Exception
2)calssNot found exception
3)InterruptedException
3)IO Exception 
    a)File not found
	b) EOF exception
4)Run time exception(unchecked exception)->dealing with data in the programs
	a)Null pointer exception
	b)Arithmetic exception
	c)Calss Exception
	d)IndexOutOfBoundsException
	   1)String Indx out of bound index
	   2)Array out of bound index
	e) illegalformat exception

In how many ways we can see exception information. Three ways to print exception.	
1)e.toSTring();->It will give the exception class+description
2)e.getMessage();->It will give only the descritpion
3)e.printStackTrace(); -> It will give name, descritpion and location.It is same as what JVM throws.


1)what is exception
2)why we need exception
3)How to handle exception- try and catch
4)who all can handle exception- jvm and user
5)why dev team writes try catch - to give proper info to 
6)what is the use of throw keyword.
7)How many ways we see xception information
8)difference between e.toString(), e.getMessage(), e.printStackTrace()
9)Can we write catch with multiple catches.
- child first and parent next. This point is very important.
10)where to write try catch
11)Irrespective of exception or not, if you want to execute compulsarily, that statement need to be put in finally block, because 
finally block executes in all the situation.
12)Use of finally block
13)Can we write try without catch.
a)Try with finally
b)try with resources, 
14)Multiple tries are not allowed.Multiple catches are allowed.
15)WHat happns when an exception occurs?
Whereever exception occured that location takes the respossibility of creating an exception object, and giving to JVM.
JVM has a subtask called default exception handler which will handle the exceptions received by JVM. It will check the current
location is having try catch. If the current location has matching try catch, it will continue accordingly.Else it will check the calling 
method whether it has suitable try catch. If it has it will continue, else 	it will inform the JVM to terminate the program.
16)Checkd time exceptions are also called compile time exception.