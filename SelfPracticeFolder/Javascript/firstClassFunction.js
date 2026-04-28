function a(param1) {
  console.log(param1);
}

function b() {
  return "Hello";
}

a(b()); // Output: Hello
