//  * * * * * 
//  *       *
//  *       *
//  *       * 
//  *       * 
//  * * * * *


let pat = () => {
  let row = 5;
  let column = 3;
  for (let i = 0; i < row; i++) {
    for (let j = 0; j <column; j++) {
      if(i==0 || i==row-1 ){
      process.stdout.write("* ");
    } else if (i>0 && i<row-1 ){
      for (let j = 0; j <=column; j++) {
        if(j==0) process.stdout.write("* ");
        else if(j==row-1) process.stdout.write("* ");
        else process.stdout.write("  ");
      }

    }
  
  }
    console.log();
  }
};

pat();
