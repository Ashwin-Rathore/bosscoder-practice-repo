// Characters - 'A' = 65, 'Z' = 90 , 'a' = 97, 'z' = 122

function upperCase(passString) {
  let count = passString.length;
  let newStr = "";
  for (let i = 0; i < count; i++) {
    let newAsci;
    let p = passString[i];
    let asci = p.charCodeAt(i);
    if (asci >= 97 && asci >= 122) {
      newAsci = asci - 32;
      newStr = newStr + String.fromCharCode(newAsci);
    } else newStr = newStr + String.fromCharCode(asci);
  }
  return newStr;
}

console.log(upperCase("AshWin"));
