let nums = 10;
let allPrimeNumbers = [];

var solve = function (n) {
  for (let i = 2; i <= n; i++) {
    let isPrime = true;
    for (let j = 2; j <= Math.sqrt(i); j++) {
      if (i % j === 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      allPrimeNumbers.push(i);
    }
  }
  return allPrimeNumbers;
};

console.log(solve(nums));
