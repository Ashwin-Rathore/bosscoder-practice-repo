// ### Problem 4: Reverse String

// **Description:** Write a function `reverseString(str)` that takes a string `str` as input and returns the reversed 
// version of the string.

// **Example Input/Output:**
// - `input`: "hello"
// - `output`: "olleh"


let str = "hello";
let reverseStr = (str) =>{
  let newstr = "";
  // for(let val of str){
  //   newstr = newstr+
  // }
  for(let i=str.length-1;i>=0;i--){
    newstr = newstr+str[i];
  }
  return newstr;
}

console.log("REverse- ",reverseStr(str));


let finalResult = str.split('').reverse().join('');

console.log("finalResult : "+finalResult)