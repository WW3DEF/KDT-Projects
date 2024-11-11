const btnUpdateEle = document.getElementById('btnUpdate');
const btnDeleteEle = document.getElementById('btnDelete');
const btnFindAllEle = document.getElementById('btnFindAll');

//수정
btnUpdateEle.addEventListener('click',e=>{
  const boardIdEle = document.getElementById('boardId');
  location.href=`/freeBoard/${boardIdEle.value}/edit`;
},false);

//삭제
btnDeleteEle.addEventListener('click',e=>{
  if(!confirm('삭제하시겠습니까')) return;

  const boardIdEle = document.getElementById('boardId');
  location.href = `/freeBoard/${boardIdEle.value}/del`;
},false);

//목록
btnFindAllEle.addEventListener('click',e=>{
  location.href = '/freeBoard';
},false);