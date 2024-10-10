const btnEle = document.querySelector('.btn');
        console.log(btnEle);
        btnEle.addEventListener('click',function() {
            window.alert('클릭!');
            btnEle.style.backgroundColor = 'yellow';
        })