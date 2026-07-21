var flipAndInvertImage = function(image) {
          
        for(let i=0;i<image.length;i++){
            let len = image[i].length-1;
            for (let j=0;j<image[i].length/2;j++){
                let temp = image[i][j];
                 image[i][j] =  image[i][len-j]
                 image[i][len-j] = temp;

                
            }
          }
            for(let i=0;i<image.length;i++){
              for (let j=0;j<image[i].length;j++){

             if(image[i][j] == 0) image[i][j] = 1;
                 else image[i][j] = 0;
              }
            }   
        


        return image;


};

let image = [[1,1,0],[1,0,1],[0,0,0]];
//flipAndInvertImage(image)
console.log(flipAndInvertImage(image));
// for(let i=0;i<image.length;i++)
// {
//   console.log(image[i])
//}