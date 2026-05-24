//.       * 
//       * *
//      * * *
//     * * * *
// 
// 


let pat = () => {
  let row = 5;
  let column = 3;
  for (let i = 0; i < row; i++) {
     for (let k = row; k > i; k--) {
        process.stdout.write(" ");
  }
    for (let j = 0; j <=i; j++) {
      process.stdout.write("* ");
    }
    console.log();
   
};
}
pat();
