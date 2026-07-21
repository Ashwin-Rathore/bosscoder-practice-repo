var sortedSquares = function(nums) {

        for(let i=0;i<nums.length;i++){
                nums[i] = nums[i]* nums[i];
                console.log(nums[i]);
        }
         return  nums.sort((a,b) => (a-b));

};

let nums = [-4,-1,0,3,10];
console.log(sortedSquares(nums))