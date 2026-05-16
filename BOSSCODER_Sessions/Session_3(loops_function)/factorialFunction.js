function factorial(num) {
  let fact = 1;
  for (let i = num; i => 2; i--) {
    console.log(i)
    fact = fact * i;
  }
  return fact;
}

console.log(factorial(4));
