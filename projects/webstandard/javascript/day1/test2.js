console.log('hi');

let x = 10;
let y = 20;
let result = x + y;

console.log(`결과:${result}`);

/**
 * 더하기 하는 함수
 * @param x
 */
function add(x,y) {
    let result = x + y;
    return result;
}

result = add(x,y) /* 함수 호출 */
console.log(`결과:${result}`);

/* 1~10까지의 합계 */
let sum = 0;
for(let i = 1; i<=10; i++){
    sum += i;
}
console.log(`1~10까지의 합계: ${sum}`);

sum = 0;
let i = 0;

while(i < 10){
    sum += ++i;
}

console.log(`1~10까지의 합계: ${sum}`);

sum = 0;
i = 0;
do {
    sum += ++i;
} while(i<10);
console.log(`1~10까지의 합계: ${sum}`);

let value = 10;
if( value % 2 == 0) {
    console.log('짝수');
} else {
    console.log('홀수');
}

let score = 65;
value = parseInt(score/10);
switch(value){
    case 9:
        console.log('A');
        break;
    case 8:
        console.log('B');
        break;
    case 7:
        console.log('C');
        break;
    case 6:
        console.log('D');
        break;
    default:
        console.log('F');
}

/* 배열 */
const arr = [1,2,3,4,5];
for (let i = 0; i < arr.length; i++) {
      console.log(arr[i]);
}

for (let ele of arr) {
    console.log(ele);
}

const arr2 = [
    [1,2],
    [3,4],
    [5,6]
]

for (let i = 0; i < arr2.length; i++) {
    for(let j=0; j<arr2[i].length; j++){
        console.log(arr2[i][j]);
    }
    console.log();
}