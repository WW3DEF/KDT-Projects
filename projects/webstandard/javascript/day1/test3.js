/* 객체 리터럴 */

const person = {name: '홍길동', age:10 };
console.log(person.name);
console.log(person.age);

/* class를 사용한 객체 생성 */
class Person {
    constructor(name,age) {
        this.name = name;
        this.age = age;
    }
}

const person2 = new Person('홍길동', 10);
console.log(person2.name);
console.log(person2.age);