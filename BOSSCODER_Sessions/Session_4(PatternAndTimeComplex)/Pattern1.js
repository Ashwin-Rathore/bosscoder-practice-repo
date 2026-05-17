let pat = ()=> {

  let row = 8
  let column = 3
  for(let i=0;i<row;i++){

    for(let j=0;j<column;j++){
      process.stdout.write("* ");
    }
    console.log();
  }

}

pat();