setTimeout(function () {
  console.log("I am Timer");
}, 5000);

function x(y) {
  console.log("I am x");
  y();
}

x(function y() {
  console.log("I am y");
});
