import { ajax, PaginationUI } from '/js/common.js';

const btnUpdateEle = document.getElementById('btnUpdate');
const btnDeleteEle = document.getElementById('btnDelete');
const btnFindAllEle = document.getElementById('btnFindAll');
const boardIdEle = document.getElementById('boardId');
const boardIdVal = boardIdEle.value;

if(btnUpdateEle && btnDeleteEle){
  //수정
  btnUpdateEle.addEventListener('click',e=>{
    
    location.href=`/freeBoard/${boardIdEle.value}/edit`;
  },false);

  //삭제
  btnDeleteEle.addEventListener('click',e=>{
    if(!confirm('삭제하시겠습니까')) return;

    location.href = `/freeBoard/${boardIdEle.value}/del`;
  },false);
}

//목록
btnFindAllEle.addEventListener('click',e=>{
  location.href = '/freeBoard';
},false);

//댓글등록
const addReply = async reply => {
  try {
    const url = '/api/replys';
    const result = await ajax.post(url, reply);
    if (result.header.rtcd === 'S00') {
      // console.log(result.body);
      frm.reset();
      getReplys();
    } else {
      console.log(result.header.rtmsg);
    }
  } catch (err) {
    console.error(err.message);
  }
};

//댓글조회
// const getReply = async repid => {
//   try {
//     const url = `/api/replys/${repid}`;
//     const result = await ajax.get(url);
//     console.log(result);
//     if (result.header.rtcd === 'S00') {
//       console.log(result.body);
//       productId2.setAttribute('value', result.body.replyId);
//       pname2.setAttribute('value', result.body.pname);
//       quantity2.setAttribute('value', result.body.quantity);
//       price2.setAttribute('value', result.body.price);

//       productId2.value = result.body.productId;
//       pname2.value = result.body.pname;
//       quantity2.value =  result.body.quantity;
//       price2.value = result.body.price;

//     } else {
//       console.log(result.header.rtmsg);
//     }
//   } catch (err) {
//     console.error(err);
//   }
// };

//댓글삭제
const delReply = async (repid) => {
  try {
    const url = `/api/replys/${repid}`;
    const result = await ajax.delete(url);
    console.log(result);
    if (result.header.rtcd === 'S00') {
      console.log(result.body);
      getReplys();
    } else {
      console.log(result.header.rtmsg);
    }
  } catch (err) {
    console.error(err);
  }
};

// //댓글수정
// const modifyReply = async (repid, reply) => {
//   try {
//     const url = `/api/replys/${repid}`;
//     const result = await ajax.patch(url, reply);
//     if (result.header.rtcd === 'S00') {
//       console.log(result.body);
//       getReplys();
//     } else {
//       console.log(result.header.rtmsg);
//     }
//   } catch (err) {
//     console.error(err.message);
//   }
// };

//댓글목록
const getReplys = async (reqPage, reqRec) => {
  try {
    const url = `/api/replys?boardId=${boardIdVal}&reqPage=${reqPage}&reqRec=${reqRec}`;
    console.log(`url=${url}`);
    const result = await ajax.get(url);
    console.log(JSON.stringify(result));

    if (result.header.rtcd === 'S00') {
      displayReplyList(result.body);
    } else {
      console.log(result.header.rtmsg);
    }
  } catch (err) {
    console.error(err);
  }
};

//댓글등록 화면
function displayForm() {
  //댓글등록
  const $addFormWrap = document.createElement('div');
  $addFormWrap.innerHTML = 
  ` 
    <div>
          <label for="replyWriter">글쓴이</label>
          <input type="text" id="replyWriter" name="replyWriter"/>
    </div>
    <div>
          <label for="replyContent">내용</label>
          <input type="text" id="replyContent" name="replyContent"/>
          <span class="field-error client" id="errContent"></span>
    </div>
    <div>
          <button id="btnAdd" type="submit">등록</button>
    </div>
  `;

  const $frm = document.querySelector('#frm');
  if($frm) {
    $frm.insertAdjacentElement('afterbegin', $addFormWrap);
    $frm.addEventListener('submit', e => {
      e.preventDefault(); // 기본동작 중지
  
      //유효성 체크
      if($frm.replyContent.value.trim().length === 0) {
        errContent.textContent = '내용은 필수로 입력해야 됩니다.';
        $frm.replyContent.focus();
        return;
      }
  
      const formData = new FormData(e.target); //폼데이터가져오기
      const reply = {};
      [...formData.keys()].forEach(
        ele => (reply[ele] = formData.get(ele)),
      );
      
      reply.boardId = e.target.dataset.boardid;
      reply.userId = e.target.dataset.userid;
  
      console.log(reply);
  
      addReply(reply);
  
    });
  }
}

//댓글목록 화면
function displayReplyList(replys) {
  console.log(`list=${$list}`);
  const makeTr = replys => {
    const $tr = replys
      .map(
        reply =>
          `<tr data-repid=${reply.replyId} data-userid=${reply.userId} style="border: solid; border-radius: 5px; border-color: rgb(160, 154, 145);">
            <td>${reply.replyWriter}님</td>
            <td>${reply.replyContent}</td>
            <td>${reply.createDate}</td>
          </tr>`,
      )
      .join('');
    return $tr;
  };

  $list.innerHTML = `
    <table style="border-collapse: collapse;">
      <caption> 댓글 목록 </caption>
      <thead>
        <tr>
          <th>글쓴이</th>
          <th>내용</th>
          <th>작성일</th>
        </tr>
      </thead>
      <tbody>
        ${makeTr(replys)}
      </tbody>
    </table>`;

  const $replys = $list.querySelectorAll('table tbody tr');
  const frmData = frm.dataset.userid;

  // Array.from($replys)
  if(frm) {
  [...$replys].forEach(reply => {
      if(frmData == reply.dataset.userid) {
        console.log(reply.dataset.userid);
        const createdDelBtn = document.createElement('button');
        createdDelBtn.setAttribute('id', 'delBtn');
        createdDelBtn.textContent = '삭제';
        reply.insertAdjacentElement('beforeend', createdDelBtn);
        createdDelBtn.addEventListener('click', e=> {
            const deleteRepVal = reply.dataset.repid;
            if(!confirm("삭제하시겠습니까?")){ return;}
            delReply(deleteRepVal);
        });
      }
    }
      
      // reply.addEventListener('click', e => {
      //   const userId = e.currentTarget.dataset.userid;
      //   if(frmData == userId) {};
      // }),
    );
  }
}

displayForm();//등록

const $list = document.createElement('div');
$list.setAttribute('id','list')
replyArea.appendChild($list);

const divEle = document.createElement('div');
divEle.setAttribute('id','reply_pagenation');
replyArea.appendChild(divEle);

// getReplys(1, 10);//목록


(async ()=>{
  const url = '/api/replys/totalCnt';
  try {
    const result = await ajax.get(url);
    
    const totalRecords = result.totalCnt; // 전체 레코드수
    const recordsPerPage = 10;            // 페이지당 레코드수
    const pagesPerPage = 10;              // 한페이지당 페이지수

    const handlePageChange = (reqPage)=>{
      return getReplys(reqPage,recordsPerPage);
    };

    // Pagination UI 초기화
    var pagination = new PaginationUI('reply_pagenation', handlePageChange);
    
    pagination.setTotalRecords(totalRecords);
    pagination.setRecordsPerPage(recordsPerPage);
    pagination.setPagesPerPage(pagesPerPage);

    // 첫페이지 가져오기
    pagination.handleFirstClick();   

  }catch(err){
    console.error(err);
  }
})();