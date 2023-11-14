# The difference between var and let in javascript 
## I - A reminder about var and let.
var and let are two ways to define a variable in javascript.

let and const are introduced in javascript on ECMAScript6.


## II- Details about var and let.

### II.1 - var
 ```
 var message = "hi";
 ```
- When we define a var inside a function scope, then the var is a function's variable.
- The var is destroyed after the function execution is completed.
- If we define a variable inside a function block without "var", then the variable will be a global variable
    ```
    function test() {
      message : "hi";
    }
    test()
    console.log(message); // "hi"
    ```
    But this is not recommended, because hard to maintain.
- Javascript has a mechanism called "Hoisting", this mecanism will **move all variable declarations using "var" to the top of the scope** (functional scope, global scope, etc.).
  ```
  function foo() {
    console.log(age);
    var age = 26;
    var age = 32;
  }
  foo(); // undefined
  ```
  There is no error, because ECMAscript treat it as :
  ```
  function foo() {
   var age;
   console.log(age);
   age = 26;
   age = 32;
  }
  ```
### II.2 - let
Let manifest as var , but the difference is let is bloc scope, but var is functional scope.
- We can define same var several time in a scope, but not let.
    ```
    var name;
    var name; // Because of "hoisting", there is no error
    
    let age;
    let age; //SyntaxError, there is no "hoisting" for let.
    ```
- When we declare a let in the global scope, let won't be a propertie of window.(but var is)
    ```
    var name = "Matt";
    console.log(window.name) // "Matt"
    
    let age = 26;
    console.log(window.age); // undefined
    ```
## III - An example to illustrate the difference between var and let
```
for ( var i = 0; i < 5; i++ ) {
    setTimeout(() => console.log(i), 0);
}
// You may think there will be 0, 1, 2, 3, 4
// But in fact, there will be 5, 5, 5, 5, 5
```
Because a variable declared with var within a function has function scope, all instances of "i" in this case will be the same, as **the scope of a for...in loop is just a block scope**.
then all setTimeout will print 5.

So we need to use let in this case, because the for loop will create a new "i" to every block scope.

