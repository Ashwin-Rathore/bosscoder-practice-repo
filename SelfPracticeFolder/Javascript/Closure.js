// function x(){

// let a = 5;

// return function y(){
// a = 100;
//   console.log(a); 
// }

// }
// var z = x();
// z();

function x(){
let a = 100;

 return function y(){
    a = 200;

    function z(){
      console.log(a);
    }
    z();
  }
  y()
  
}

var c = x();
 c(); // Output: [Function: y]