var mostFrequentEven = function (nums) {
  let ans = 0;
  let maxFreq = 0;
  let myMap = new Map();
  for (let element of nums) {
    if (element % 2 == 0) {
        console.log("Element -",element)
      if (myMap.has(element)) {
        console.log("Element 2nd -",element)
        console.log("myMap.get(element)",myMap.get(element))
        myMap.set(element, myMap.get(element) + 1);
      }
      else myMap.set(element, 1);
    }
  }
      
        for(let [num, freq] of myMap){
                if(freq>maxFreq || (freq==maxFreq && num<ans)){
                        maxFreq = freq;
                        ans = num;
                }

        }
        {

        }
  return ans;
};

let nums = [0, 1, 2, 2, 4, 4, 4, 1, 3, 3, 3];
console.log(mostFrequentEven(nums));
