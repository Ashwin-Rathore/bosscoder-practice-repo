let num = 2;
let flag = false;
if (num < 1) {
  console.log("Not Eligible");
  return false;
}
for (let i = 2; i <= num / 2; i++) {
  if (num % i == 0) {
    flag = false;
    break;
  } else {
    flag = true;
  }
}

if (flag == true) {
  console.log("Prime");
} else console.log("Not Prime");
