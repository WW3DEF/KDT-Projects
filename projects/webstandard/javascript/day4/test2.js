/* 
    주어진 문자열에서 모음의 개수를 세는 함수
    주어진 문자열에서 모음(a,e,i,o,u)의 개수를 세어 반환하는 함수를 정의하세요.
    함수는 세 가지 방식으로 정의해야 합니다: 함수 선언문, 함수 표현식, 화살표 함수
*/

{
    /* 함수 선언문 */
    const str = "keaaaiou";
    function countString(str) {
        let count = 0;
        const matchString = "aeiou";
        for (let i = 0; i < str.length; i++) {
            for (let j = 0; j < matchString.length; j++) {
                if(str[i] === matchString[j]) {
                    count++;
                }
            }
        }
        return count;
    }
    console.log(countString(str));
}

{
    /* 함수 표현식 */


}

{
    /* 화살표 함수 */


}