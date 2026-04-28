// Print 
// Hello World
// 1
// 2
// 3
// 4
// 5

function x(){
  for (var i = 1; i <= 5; i++) {
    setTimeout(function(){

      console.log(i);

    }, i*1000)
  }
  console.log("Hello World");
 }

//  x();
// Output
//  Hello World
// 6
// 6
// 6
// 6
// 6


//  To achieve this Option 1 , use let instead of var

function y(){
  for(let i =1;i<=5;i++){
    setTimeout(function(){

      console.log(i);

     }, i*1000)
  }

  console.log("Hello World");
}

//y()

//  To achieve this Option 2 , Inclose it inside a function


function z(){
  for (var i =1;i<=5;i++){

    function close(x){
      setTimeout(function(){

        console.log(x);
        
      }, i *1000)

}

close(i);
  }
console.log("Hello World");
}

z();