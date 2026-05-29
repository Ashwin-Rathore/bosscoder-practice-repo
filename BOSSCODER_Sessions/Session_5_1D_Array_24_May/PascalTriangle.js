
let rowIndex =3;
let n =rowIndex+1;
let fact = (num)=>{
  let sum =1;
  while(num>0){
     sum = sum*num;
     num--;
  }
  return sum;
}

let ncr = (n,r)=> {
    return Math.round(fact(n)/(fact(r)*(fact(n-r))))
}

let pascalArray = [];
let pascal =  (n)=> {
let row = [];
  for(let i=0;i< n;i++){
    
    for(let j=0;j<n-i;j++){
        process.stdout.write(" ");
    }
      for(let k=0;k<=i;k++) { 
      process.stdout.write(ncr(i,k).toString()+" ");
      if(i==rowIndex){
      row.push(ncr(i,k));
        }
    }
      if(i==rowIndex){
      pascalArray.push(row);
      }
      console.log();

  }
  return row;

}
console.log(pascal(n));