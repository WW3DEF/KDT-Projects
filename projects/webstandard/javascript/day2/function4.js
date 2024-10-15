/* 
배열의 평균값

문제 : 주어진 숫자 배열의 평균값을 계산하여 반환하는 함수를 작성하세요.
요구 사항:
일반 함수로 작성하세요.
같은 기능을 하는 함수 표현식으로 변환하세요.
같은 기능을 하는 화살표 함수로 변환하세요.
*/

const a = [2,3,7,1];
let sum = 0;
let avg = 0;
let count = 0;

// 일반함수
// function average(a) {
//     for (let i = 0; i < a.length; i++) {
//         sum += a[i];
//         count++;
//     }
//     avg = sum / count;
//     console.log(`합계 : ${sum}`);
//     console.log(`배열크기 : ${a.length}`);
//     console.log(`평균값 : ${avg}`);
//     return parseFloat(avg);
// }

// average(a);

// 함수 표현식
// {   
//     const a = [2,3,7,1];
//     let sum = 0;
//     let avg = 0;
//     let count = 0;

//     const average = function average(a){
//         for (let i = 0; i < a.length; i++) {
//             sum += a[i];
//             count++;
//         }
//         avg = sum / count;
//         console.log(`합계 : ${sum}`);
//         console.log(`배열크기 : ${a.length}`);
//         console.log(`평균값 : ${avg}`);
//         return parseFloat(avg);
//     }
//     console.log(average(a));
// }

// 화살표함수
{   
    const a = [2,3,7,1];
    let sum = 0;
    let avg = 0;
    let count = 0;

    const average = (a) => {
        for (let i = 0; i < a.length; i++) {
            sum += a[i];
            count++;
        }
        avg = sum / count;
        console.log(`합계 : ${sum}`);
        console.log(`배열크기 : ${a.length}`);
        console.log(`평균값 : ${avg}`);
        return parseFloat(avg);
    }
    console.log(average(a));
}