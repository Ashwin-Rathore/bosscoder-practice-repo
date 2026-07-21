//.       * 
//       * *
//      * * *
//     * * * *
// 
// 

function fact(num){
    let n =1;
    let sum = 1;
  while (num>0){
    sum =  sum*num;
    num--

  }
  return sum
}


function ncr(n,r){
    return fact(n)/(fact(r)*(fact(n-r)))
}

//console.log(ncr(4,2));

let pat = () => {
  let row = 5;
  let column = 3;
  for (let i = 0; i < row; i++) {
     for (let k = row; k > i; k--) {
        process.stdout.write(" ");
  }
    for (let j = 0; j <=i; j++) {
      process.stdout.write(ncr(i,j).toString()+" ");
    }
    console.log();
   
};
}
pat();
