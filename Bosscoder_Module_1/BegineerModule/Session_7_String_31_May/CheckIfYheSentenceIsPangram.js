var checkIfPangram = function(sentence) {

    sentence.toLowerCase();
        
        
        let mySet = new Set();
        for(let ca of sentence){
            if(ca >='a' || ca<='z')
              mySet.add(ca)
        }
        
        if(mySet.size == 26) return true;
        else return false
};  


let sentence = "thequickbrownfoxjumpsoverthelazydog"
//let sentence = "leetcode"

console.log(checkIfPangram(sentence));