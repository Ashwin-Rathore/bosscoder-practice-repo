// ### Problem 5: Check for Palindrome

// **Description:** Write a function `isPalindrome(str)` that takes a string `str` as input and returns true if the
// string is a palindrome, otherwise return false.

// **Example Input/Output:**
// - `input`: "racecar"
// - `output`: true

let palindrom = (input) => {
  let count = Math.floor(input.length / 2);
  console.log("Count -" + count);
  console.log(input[3]);
  for (let i = 0; i < count; i++) {
    if (input[i] !== input[input.length-i-1]) return false;
  }
  return "Palindrom";
};

console.log("Palindrom- ", palindrom("raceeacar"));
