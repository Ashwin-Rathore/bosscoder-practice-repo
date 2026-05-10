let a = 2344443;

let sum = 0;
let num = a;

while (num > 0) {
  let digit = num % 10; // get last digit
  sum = (sum%3 + digit%3)%3; // add digit to sum
 // sum = sum + digit;
  num = Math.floor(num / 10); // remove last digit
  console.log("SUM -" + sum + " | num-" + num);
}

if (sum % 3 === 0) {
  console.log(a + " is a multiple of 3");
} else {
  console.log(a + " is NOT a multiple of 3");
}
