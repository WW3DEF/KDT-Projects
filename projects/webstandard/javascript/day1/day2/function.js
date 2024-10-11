{
    // 일반함수
    function add(x,y){
        return x + y;
    }
    console.log(add(10,20));
}
{
    // 함수 표현식
    const add = function(x,y){
        console.log('함수표현식');
        return x + y;
    }
    console.log(add(10,20));
}
{
    // 화살표함수
    // fuction이라는 키워드를 화살표로 변형
    const add = (x,y)=>{
        console.log('화살표 함수');
        return x + y;
    }
    console.log(add(10,20));
}