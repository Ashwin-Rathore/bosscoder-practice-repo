
var sortSentence = function(s) {
    let newStr = "";
    let arr = s.split(" ");
    let newArr = new Array(arr.length);

      for(let i=0;i<arr.length;i++){
          let word = arr[i].length-1;

            let digit = arr[i].charAt(word)-'0';
            newArr[digit-1] = arr[i].substring(0,word);
           // newArr[digit - 1] = arr[i].substring(0, arr[i].length - 1);
      }
      
      for(let i=0;i<newArr.length;i++){
        //console.log(newStr)
          newStr = newStr+newArr[i];
           if(i<newArr.length-1){
                  newStr+= " ";
           }

          }

return newStr;
        
};



 let s = "is2 sentence4 This1 a3";
    console.log(sortSentence(s));