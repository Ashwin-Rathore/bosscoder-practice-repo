function x(){

let a = 5;

return function y(){
a = 100;
  console.log(a); 
}

}
var z = x();
z(); 