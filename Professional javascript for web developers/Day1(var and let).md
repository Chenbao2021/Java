# The difference between var and let in javascript 

## I- Reminder of var, and let.

### a - var
 ```
 var message = "hi";
 ```
- When we define a var inside a function block, then the var is a local variable.
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
