const arr = [1,2,3];

console.log(10/3);
console.log(10/0);
console.log(0/0);
try {
    // 오류가 예상되는 코드
    // const result = 10 / - 3;
    // const value = arr[3];
    // console.log(result, value);
    
}catch(err) {
    console.log('잘못된 연산오류!');
}
console.log('hi');