$(document).ready(() => {

	// ajax통신, 글데이터 가져오기
	$.ajax({
	   url: 'boardList.do', // 어디로 요청을 보낼 것인가? 
	   type: 'post', //get?, post?
	   data: {
		  // 'key(name)' : value  -> 보내줄데이터
	   },
	   /* dataType : 'json',  응답 받는 데이터가 어떤 형태인지 */
	   success: function (res) {
		  // 요청이 성공했을때  실행되는 Call back 함수 
		  // res --> 응답받는 데이터가 담기는 변수
		  console.log(res);
 
		  // table에 출력
		  // $('선택자').html('코드') : 안에 있는 코드 덮어쓰기
		  // $('선택자').after('코드') : 태그 바로 뒤에(다음줄)
		  // $('선택자').before('코드') : 태그 바로 앞 (이전줄)
		  // $('선택자').append('코드') : 태그 안에 누적         
		  $('#tbody').html(''); //내용 초기화
 
		  for (let i = 0; i < res.length; i++) {
			 //`` 따옴표 내에서 ${변수} 문자열 사이에 변수를 집어 넣는게 가능
			 // JSP의 EL이랑 문법이 겹쳐서, JSP안에서는 사용 불가능
 
			 tr = `
				   <tr>
					  <td>${res[i].idx}</td>
					  <td><a href='javascript:open(${res[i].idx})'>${res[i].title}</a></td>
					  <td>${res[i].writer}</td>
					  <td>${res[i].indate}</td>
					  <td id="count${res[i].idx}">${res[i].count}</td>
				   </tr>
				   
				   <tr id="board${res[i].idx}" style="display:none;">
					  <td colspan="5">
						 <textarea row="5" class="form-control">${res[i].content}</textarea>
					  </td>
				   </tr>
				   
				   `;
 
			 $('#tbody').append(tr);
		  }
 
 
	   },
	   error: function (e) {
		  // 404,405,500 --> 요청자체가 시랲
		  // e--> 어떤 에러인지 담기는 변수
		  alert('error');
	   }
	})
 
 })
 
 // ================= ajax =======================
 
 function open(idx){
	// 조회수 업데이트하기 
	// 태그 안에 있는 값 ?? 
	// .text()
	// .html() : 닫는 태그 있는경우
	//. val() : 닫는 태그 없는경우
	let count = Number($(`#count${idx}`).html());
	$.ajax({
	   url : 'viewUpdate.do',
	   type : 'post',
	   data : {
		  'idx' : idx,
		  'count' : count + 1
	   },
	   success : function(res){
		  // 기존에 있던 조회수 
		  $(`#count${idx}`).html(count+1);
 
	   },
	   error : function(e){alert('error!')}
	});
 
 
	//$('선택자').css('스타일이름') : 해당하는 스타일 값을 리턴 
	//$('선택자').css('스타일이름', '바꿔줄값') : css옵션을 수정 시켜주는 함수
	$(`#board${idx}`).css('display', 'table-row');
 }
 
 