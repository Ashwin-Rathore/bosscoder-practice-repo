// ### Problem 7: Multiply Array Elements

// **Description:** Write a function `multiplyArray(arr)` that takes an array of numbers `arr` as input and returns the product of all elements in the array.

// **Example Input/Output:**
// - `input`: [1, 3, 5]
// - `output`: 15

let input = [1, 3, 5];

let product = function (input) {
  let prod = 1;
  for (let val of input) {
    prod = prod * val;
  }
  return prod;
};

console.log(product(input));


input = input.reduce((current,next) => current* next);

// console.log("Input =",input)
// let input1 = [1, 3, 5];

// //for(let val of input){
// let newAr = [];
// console.log(input1);
//  newAr = input1.map((val) => { 
//  console.log(val) 
//   return val})
//  console.log()
// console.log(newAr);
// //}



let input1 = [5, 4, 3, 2, 1];
console.log(input1);

// Here we are not pushing the value into newAr directly, but instead returning it
// let newAr = input1.map((val) => {
//     console.log(val);
    let newAr = input1.reverse()
    // return val;
// });

console.log();
console.log(newAr); 