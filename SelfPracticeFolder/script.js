let modeButton = document.querySelector("#modeBtn");
let currentMode = "lightMode";
modeButton.addEventListener("click", () => {
  if (currentMode === "lightMode") {
    currentMode = "dark";
    document.querySelector("body").style.backgroundColor = "black";
  } else {
    currentMode = "lightMode";
    document.querySelector("body").style.backgroundColor = "white";
  }
  console.log(currentMode);
});
