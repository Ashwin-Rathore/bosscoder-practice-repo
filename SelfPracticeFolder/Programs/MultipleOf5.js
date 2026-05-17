var solve = function (num) {
    let ans = 1;          // empty prefix
        let sum = 0;

        for (let i = 0; i < num.length; i++) {
            sum += num[i];
            if (sum > 0) {
                ans++;
            }
        }
        return ans;
};
let  myList = [-2, 5, 7, -1, 3];
console.log(solve(myList));