let pat = () => {
  let row = 5;
  let column = 3;
  for (let i = 0; i <row; i++) {
    for (let j = 0; j <=column-i; j++) {
      process.stdout.write("* ");
    }
    console.log();
  }
};

pat();
