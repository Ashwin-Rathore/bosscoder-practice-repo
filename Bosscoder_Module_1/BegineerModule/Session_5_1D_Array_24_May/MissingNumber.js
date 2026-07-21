var missingNumber = function(nums) {
    let sum = 0;
    let num = nums.length;
    let sumOfNumber = (num)=>{
            return (num * (num+1))/2;
    }

    // sumOfNumber = (num * (num+1))/2;
    
    let sumOfArray = (nums)=>{
            for (let i=0;i<num;i++){
                sum = sum+nums[i];
            }
            return sum;
    }
      // for (let i=0;i<num;i++){
      //           sum = sum+nums[i];
      //       }
          

        return sumOfNumber(num) - sumOfArray(nums);


};

let nums = [9,6,4,2,3,5,7,0,1]
console.log(missingNumber(nums))