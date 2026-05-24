let nums = [1,2,3,4,5];
let k = 3;


var solve = function (nums, k) {
  let maxSum =0;
  for(let i=0;i<k;i++){
      let maxNum = nums[0];
      let index;
      for(let j=1;j<nums.length;j++){
          if(maxNum<nums[i]){
            maxNum = nums[i];
            index = i;
          }
      }
      maxSum = maxSum+maxNum;
      nums[index] = maxNum+1;


  }
    return maxSum;
};

console.log(solve(nums,k))