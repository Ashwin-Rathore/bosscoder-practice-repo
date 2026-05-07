let nums = [0, 1, 2, 2, 3, 0, 4, 2];
let val = 2;

var removeElement = function (nums, val) {
  let k = 0; // Count of elements not equal to val

  // Two-pointer approach: overwrite val elements with non-val elements
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== val) {
      nums[k] = nums[i]; // Place element at position k
      k++;
    }
  }

  return k;
};

// Test the function
let k = removeElement(nums, val);

// Display result in required format
let displayArray = nums.slice(0, k);
for (let i = k; i < nums.length; i++) {
  displayArray.push("_");
}

console.log(`Output: ${k}, nums = [${displayArray.join(",")}]`);
console.log("Actual array:", nums);
