var solve = function (n) {
  for (let i = 0; i < n; i++) {
    let temp = "";
    for (let j = 0; j <= i; j++) {
      temp += "*";
    }
    console.log(temp);
  }
};
console.log(solve(4));
