// ### Problem 3: Find Maximum in Array

// **Description:** Write a function `findMax(arr)` that takes an array of numbers `arr` as input and returns the 
// maximum number in the array.

// **Example Input/Output:**
// - `input`: [3, 7, 2, 9]
// - `output`: 9


let maxNum = (arr) => {
  let largestNum = 0;
  for( let val of arr){
    largestNum>val ? largestNum : largestNum=val;
  }
  return largestNum;
}
let arr = [13, 7, 2, 9]
console.log(maxNum(arr))