// 중첩 함수 정의가 가능
function a(){
    function b(){
        const value = 10;
        console.log(`b함수 호출됨!` + value);
        console.log(`b함수 호출됨!` + value);
        console.log(`b함수 호출됨!${value}`); //문자열 템플릿
    }
    b();
}
a();

// 함수를 값처럼 변수에 대입
const c = a;
c();


// 매개값으로 함수를 전달 할 수 있다.
function b(f){
    f();
}
b(a);

//  반환값으로 함수를 전달 할 수 잇다.
function d() {
    return function d2() {
        console.log('hi');
    };
}

// d()();
const f2 = d();
f2();