let boxes = document.querySelectorAll(".box");
let resetButton = document.querySelector(".resetButton");
let gameOver = false;

let winnerPattern = [
  [0, 1, 2],
  [3, 4, 5],
  [6, 7, 8],
  [0, 3, 6],
  [1, 4, 7],
  [2, 5, 8],
  [0, 4, 8],
  [2, 4, 6],
];
let b =10;
let value0 = true;

// Add click event to each box
boxes.forEach((box) => {
  box.addEventListener("click", () => {
    if (gameOver || box.disabled) return; // Don't allow clicks if game is over

    if (value0) {
      box.innerText = "O";
      value0 = false;
    } else {
      box.innerText = "X";
      value0 = true;
    }
    box.disabled = true;
    winnerCheck();
  });
});

// Check for winner
let winnerCheck = () => {
  for (let pattern of winnerPattern) {
    let firstPosition = boxes[pattern[0]].innerText;
    let secondPosition = boxes[pattern[1]].innerText;
    let thirdPosition = boxes[pattern[2]].innerText;

    if (firstPosition != "" && secondPosition != "" && thirdPosition != "") {
      if (
        firstPosition === secondPosition &&
        secondPosition === thirdPosition
      ) {
        console.log(`Winner is ${firstPosition}`);
        alert(`🎉 Winner is ${firstPosition}`);
        gameOver = true;
        disableAllBoxes();
        return;
      }
    }
  }

  // Check if all boxes are filled (Draw)
  let allFilled = Array.from(boxes).every((box) => box.innerText !== "");
  if (allFilled && !gameOver) {
    console.log("Game is a Draw");
    alert("🤝 Game is a Draw!");
    gameOver = true;
  }
};

// Disable all boxes after game ends
let disableAllBoxes = () => {
  boxes.forEach((box) => {
    box.disabled = true;
  });
};

// Reset game
if (resetButton) {
  resetButton.addEventListener("click", () => {
    boxes.forEach((box) => {
      box.innerText = "";
      box.disabled = false;
    });
    value0 = true;
    gameOver = false;
    console.log("Game Reset");
  });
}
