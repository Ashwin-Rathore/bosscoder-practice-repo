// ### Problem 2: Check Even Odd

// **Description:** Write a function `checkEvenOdd(num)` that takes an integer `num` as input and returns "Even" if 
// the number is even, otherwise return "Odd".

// **Example Input/Output:**
// - `input`: 4
// - `output`: "Even"


let checkNum = (num) =>{
  return (num%2==0) ? "Even": "Odd";
  
}

console.log(checkNum(8));