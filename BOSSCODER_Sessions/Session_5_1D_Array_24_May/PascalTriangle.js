let n =5;

let fact = (num)=>{
  let sum =1;
  while(num>0){
     sum = sum*num;
     num--;
  }
  return sum;
}

let ncr = (n,r)=> {
    return result = fact(n)/(fact(r)*(fact(n-r)))
}

let pascalArray = [];
let pascal =  (n)=> {

  for(let i=0;i< n;i++){
    let row = [];
    for(let j=0;j<n-i;j++){
        process.stdout.write(" ");
    }
      for(let k=0;k<=i;k++) { 
      process.stdout.write(ncr(i,k).toString()+" ");
      row.push(ncr(i,k));
      }
      pascalArray.push(row);
    console.log();

  }
  return pascalArray;

}
console.log(pascal(n));