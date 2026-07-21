


let findSumOfFourDivisor = (arr)=>{
  
  let finalSum =0;
  for(let i=0;i<arr.length;i++){
    let divisorCount=2;  
    let sum = 1+arr[i];
    for(let j=2;j<Math.sqrt(arr[i]);j++){
      if(arr[i]%j==0){
        divisorCount++;
        sum = sum+j;
        if(j!=arr[i]/j){
          sum=sum+arr[i]/j;
          divisorCount++;
        }
      }
    }
    if(divisorCount==4){
      finalSum = finalSum +sum;
    }


  }

  return finalSum;
}

let arr = [21,21];

console.log(findSumOfFourDivisor(arr));