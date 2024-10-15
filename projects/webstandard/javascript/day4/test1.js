/* 
문제 1: 배열의 최대값을 찾는 함수
주어진 숫자 배열에서 최대값을 찾아 반환하는 함수를 정의하세요.
함수는 세 가지 방식으로 정의해야 합니다: 함수 선언문, 함수 표현식, 화살표 함수.
*/

{
/* 함수 선언문 */
const arr = [1,3,5,7,9];
function arrMaxValue(array){
    let Max = 0;
    for (let i = 0; i < array.length; i++) {
        if(array[i] > Max) {
            Max = array[i];
            console.log(`최대값 : ` + Max);
        }
    }
    return Max;
}
console.log(arrMaxValue(arr));
}
{
    /* 함수 표현식 */
    const arr = [1,3,5,7,9,10];
    const arrMaxValue = function(array){
        let Max = 0;
        for (let i = 0; i < array.length; i++) {
            if(array[i] > Max) {
                Max = array[i];
                console.log(`최대값 : ` + Max);
            }
        }
        return Max;
    }
    console.log(arrMaxValue(arr));
}
{
    /* 화살표 함수 */
    const arr = [1,3,5,7,9,10,11];
    const arrMaxValue = array =>{
        let Max = 0;
        for (let i = 0; i < array.length; i++) {
            if(array[i] > Max) {
                Max = array[i];
                console.log(`최대값 : ` + Max);
            }
        }
        return Max;
    }
    console.log(arrMaxValue(arr));
}