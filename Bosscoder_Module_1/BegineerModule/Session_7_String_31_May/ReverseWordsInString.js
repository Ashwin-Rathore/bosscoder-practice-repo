
var solve = function (s) {
 let revStr = "";
    //  let s = str.split(" ");
      for(let i=s.length-1;i>=0;i--){
          revStr = revStr+s[i];
      }


      return revStr;
    ;}

    let str = "bosscoder quiz practice code";
    console.log(solve(str));