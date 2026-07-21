var solve = function(str){

      let arr = str.split(/\s+/);
      let newArr = [];
    
      for(let i=0;i<arr.length;i++){
                  if(!isNaN(arr[i])){
                        newArr.push(Number(arr[i]));
                  }
      }
           for(let i = 1; i < newArr.length; i++){

            if(newArr[i] <= newArr[i-1]){
                  return false;
            }
      }

      return true;

}

let s = "1 box has 3 blue 5 red 5 green and 12 yellow marbles"
console.log(solve(s))