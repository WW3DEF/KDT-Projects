/* 
문제 1: 배열의 최대값을 찾는 함수
주어진 숫자 배열에서 최대값을 찾아 반환하는 함수를 정의하세요.
함수는 세 가지 방식으로 정의해야 합니다: 함수 선언문, 함수 표현식, 화살표 함수.
*/

{
    /* 함수 선언문 */
    function max(arr){
        let maxValue =  arr[0];
        for(let i = 1; i<arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    const arr = [3,4,5,6];
    const result = max(arr);
    console.log(result);
}

{
    /* 함수 표현식 */
    const max = function (arr){
        let maxValue =  arr[0];
        for(let i = 1; i<arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    const arr = [3,4,5,6];
    const result = max(arr);
    console.log(result);
    
}

{
    /* 화살표 함수 */
    const max =  arr => {
        let maxValue =  arr[0];
        for(let i = 1; i<arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    const arr = [3,4,5,6];
    const result = max(arr);
    console.log(result);

}