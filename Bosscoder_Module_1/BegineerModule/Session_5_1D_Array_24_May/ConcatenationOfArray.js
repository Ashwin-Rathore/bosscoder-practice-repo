
var getConcatenation = function(nums) {
    //let newNum = new Arrays(2*nums.length);
    let j =0;
    let newNum = new Array(2 * nums.length).fill(0);

            for(let i=0;i< newNum.length;i++){
            
                for(let j=i;j<=i;j++){
                newNum[i] = nums[j];
                
                }
              
            
    }  
    return newNum;
};

let nums = [1,2,1];
console.log(getConcatenation(nums));