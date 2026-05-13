let nums = [-1,2,1,-4,3,4];
let target = 1
let arr = [];
nums.sort();
console.log(nums)
var threeSumClosest = function(nums, target) {
    for(let i=0;i<=nums.length-3;i++){
        sum = nums[i]+nums[i+1]+ nums[i+2];
        console.log(i, ": ",sum);
        arr[i] = target-sum
       
    }
    console.log(arr);
};

console.log(threeSumClosest(nums,target));