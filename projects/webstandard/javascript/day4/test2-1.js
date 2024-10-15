/* 
    주어진 문자열에서 모음의 개수를 세는 함수
    주어진 문자열에서 모음(a,e,i,o,u)의 개수를 세어 반환하는 함수를 정의하세요.
    함수는 세 가지 방식으로 정의해야 합니다: 함수 선언문, 함수 표현식, 화살표 함수
*/

{
    /* 함수 선언문 */
    function countVowels(strArr){
        let cntofVowels = 0;
        for (let i = 0; i < strArr.length; i++) {
            if(strArr[i] == 'a' ||
                strArr[i] == 'e' ||
                strArr[i] == 'i' ||
                strArr[i] == 'o' ||
                strArr[i] == 'u'){
            cntofVowels ++;
            }
        }

        return cntofVowels;
    }
    function countVowels2(strArr){
        let cntofVowels = 0;
        const vowels = 'aeiou';
        strArr = strArr.toLowerCase();
        for (let i = 0; i < strArr.length; i++) {
            if(vowels.includes(strArr[i])){
            cntofVowels ++;
            }
        }

        return cntofVowels;
    }
    console.log(countVowels('student'));
    console.log(countVowels2('student'));
    console.log(countVowels2('StUdent'));
}

{
    /* 함수 표현식 */


}

{
    /* 화살표 함수 */


}