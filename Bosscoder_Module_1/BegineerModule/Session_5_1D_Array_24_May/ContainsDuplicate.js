

var containsDuplicate = function(nums) {
    let flag = false;
      
    nums.sort

    for(let i=0;i<nums.length;i++){
            for(let j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]) flag = true;
            }
    }
        return flag;

};

let nums = [1,2,3,1]
console.log(containsDuplicate(nums));