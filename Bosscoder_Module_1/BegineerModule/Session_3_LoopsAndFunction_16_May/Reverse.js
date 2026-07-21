var reverse = function(x) {
    let rev = 0;
        while(x!==0){
            let digit = x%10;
            rev = rev*10 + digit;
            // x = x/10;
            x = Math.round(x / 10);
        }    
        return rev;
};

// var reverse = function(x) {

//     let rev = 0;

//     while (x !== 0) {

//         let digit = x % 10;

//         rev = rev * 10 + digit;

//         x = Math.trunc(x / 10);
//     }

//     return rev;
// };

console.log(reverse(123))