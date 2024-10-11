/* 배열 요소로 다양한 타입이 올 수 있다. */
const arr = [1,'홍길동', 4.5, true,[1,2],{name:'홍길동',age:10}];

/* 객체 리터럴 다양한 타입의 속성이 올 수 있다. */
const obj = {
    attr1 : [1,2,3],
    attr2 : {name:'홍길동', age:10, hobby:['농구','축구']},
    attr3 : 1,
    attr4 : 3.14,
    attr5 : true,
    attr6 : arr
}