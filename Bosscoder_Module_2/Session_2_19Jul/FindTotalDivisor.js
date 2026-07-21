
//let num = 21;
let list = [];

var divisorCount = function(num){

  if(num % 1 == 0) list.push(1);

  for(let i=2;i<Math.sqrt(num);i++){
    if(num%i==0){
      list.push(i);
      if(i!=num/i){
          list.push(num/i);
          Math.cbrt
        }
    }
  }
  list.push(num);
  return list;
}

console.log(divisorCount(21));


