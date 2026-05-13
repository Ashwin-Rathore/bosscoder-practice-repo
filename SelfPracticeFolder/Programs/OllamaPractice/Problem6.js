// **Description:** Write a function `filterEvens(arr)` that takes an array of numbers `arr` as input and returns a 
// new array containing only the even numbers from the original array.

// **Example Input/Output:**
// - `input`: [1, 2, 3, 4, 5]
// - `output`: [2, 4]
let input= [1, 2, 3, 4, 5];

let newArray  =input.filter((val) =>  val % 2 === 0)

console.log(newArray)