

let nums = [[1,2,3],[2,4,6,8],[3,6,9,12]];

function array(nums){

  // for(let i =0;i<nums.length;i++){

  //     for(let j =0;j<nums[i].length;j++){
  //         console.log(nums[i][j]);
  //     }
  // }
  // console.log("--")


    for(let x of nums){

        for(let y of x){
            console.log(y)
        }
        console.log("----")
    }
}


console.log(array(nums))