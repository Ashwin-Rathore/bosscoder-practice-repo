var mostFrequentEven = function(nums) {

    let myMap = new Map();

        for(let i=0;i<nums.length;i++){
                if(nums[i]%2==0){
                if(myMap.has(nums[i])){
                    myMap.set(nums[i],myMap.get(nums[i])+1)
                }
                else myMap.set(nums[i],1);
        }
        }
            for(let j=0;i<myMap.size;j++){
                let num = myMap.get(i);
                  if
            }

        console.log(myMap)
    
};

let nums = [0,1,2,2,4,4,1,3,3,3];
console.log(mostFrequentEven(nums))