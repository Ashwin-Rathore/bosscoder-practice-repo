var flipAndInvertImage = function(image) {
    
        for(let i=0;i<image.length;i++){

            for (let j=0;j<image[i].length/2;j++){
                let temp = image[i][j];
                 image[i][j] =  image[i][image[i].length-j]
                 image[i][image[i].length-j] = temp;
            }
           
        }

};

let image = [[1,1,0],[1,0,1],[0,0,0]];
console.log(flipAndInvertImage(image));
for(let i=0;i<image.length;i++)
{
  console.log(image[i])
}