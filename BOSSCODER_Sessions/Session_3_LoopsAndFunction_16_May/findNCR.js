function ncr (n,r){

    return fact(n)/(fact(r)* (fact(n-r)));
    
}

function fact(num){
    n = 1;
    for(let i=num;i>=2;i--){
        n = n*i;
    }
    return n;
}

console.log(ncr(4,2));