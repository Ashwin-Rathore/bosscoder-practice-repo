let checkLeapYear = (num) => {
  if ((num % 4 == 0) && (num %100 !=100)) {
    return true;
  } else if (num % 100 == 0) {
    return false;
  } else if (num % 4 == 0) {
    return true;
  } else {
    return;
  }
};

console.log(checkLeapYear(2024));
