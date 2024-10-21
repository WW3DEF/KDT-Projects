let btns = document.querySelectorAll('.btn');
const rsField = document.querySelector('.resultfield');

/**
 * 텍스트 필드에 데이터 삽입하는 함수
 * @param {*} btn 입력된 버튼 객체
 * @param {*} rsField 결과값 텍스트 필드
 */
    const insertData = (btn, rsField) => {
        try {
            // 버튼의 입력값에 따른 필터링
            switch(btn.value) {
                // 버튼의 값이 = 일시
                case '=' :
                    // 이미 텍스트 필드의 값이 Error 이거나 공백일시
                    if(rsField.value == 'Error' || rsField.value == '') { 
                        rsField.value = 'Error';
                    } else {
                        // 아니라면 텍스트 필드 내의 (문자열)값을 식으로 변환하고 계산
                        rsField.value = eval(rsField.value);
                    }
                break;

                case 'AC' :
                    rsField.value = '';
                break;

                default :
                    rsField.value += btn.value;
            }
        } catch(err) {
            rsField.value = 'Error';
        }
    }

    /**
     * 타겟팅된 이벤트 객체의 배경색을 변경시켜주는 함수
     * @param {*} evt 입력한 이벤트 타겟
     */
    const changeBackColor = evt => {
        evt.target.style.backgroundColor = "yellow";
        evt.target.style.borderWidth = "1px";
    }

    btns.forEach(button => {
        button.addEventListener('click', function() {
            insertData(button, rsField);
        }, false);
        
        button.addEventListener('mouseup', changeBackColor,false);
    });