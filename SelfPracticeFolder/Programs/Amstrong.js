let n = 371;

function ams(n){
let temp =n;
let digits = n.toString.length;
let sum = 0;
while(n!=0){
  digit = n%10;
  sum  += Math.pow(digit,digits)
  n = Math.floor(n/10)
}
return sum==temp
}

console.log(ams(n))