
var moveZeroes = function(nums) {
    
    if( nums.length==1 && nums[0]==0) return nums
    
    let index =0;
      for(let i=0;i<nums.length;i++){
            if(nums[i]!=0){
              nums[index]=nums[i];
              index++
            }
      }
      while(index<nums.length){
          nums[index] = 0
          index++
      }

    return nums;
};

let  nums = [0,0,1] //[0,1,0,3,12]
console.log(moveZeroes(nums));