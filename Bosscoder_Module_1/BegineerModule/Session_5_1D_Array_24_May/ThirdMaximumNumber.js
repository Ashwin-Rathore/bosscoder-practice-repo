var thirdMax = function (nums) {
  let firstMax = -Infinity;
  let secondMax = -Infinity;
  let thirdMax = -Infinity;

  for (let i = 0; i < nums.length; i++) {

     if (
        nums[i] === firstMax ||
        nums[i] === secondMax ||
        nums[i] === thirdMax
    ) {
        continue;
    }


    if (nums[i] > firstMax) {
      thirdMax = secondMax;
      secondMax = firstMax;
      firstMax = nums[i];
    } else if (nums[i] > secondMax) {
      thirdMax = secondMax;
      secondMax = nums[i];
    }
   else if (nums[i] > thirdMax) {
      thirdMax = nums[i];    }
  }
  //console.log("1 :" + firstMax + "| 2 :" + secondMax + " 3 :" + thirdMax);

    return (thirdMax!= -Infinity)? firstMax : thirdMax 

};

let nums = [1,2]
console.log(thirdMax(nums));
