<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <title>Sign Up</title>
</head>

<style>
  .success {
    background-color: #f8f8f8;
  }
  .fail {
    border: 1px solid #ff0000;
  }
</style>
<body>
  <jsp:include page="/WEB-INF/jsp/header.jsp"/>
  
  <div class="title-section">
    <form action="/signup" method="post">
      ID : <input type="text" name="id" id="userId"> <input type="button" id="checkBtn" value="Click"><br>
      PW : <input type="password" name="password"> <br>
      NAME : <input type="text" name="name"> <br>
      <button type="submit">Click</button>
    </form>
  </div>

  <script>
    var checkBtn = document.getElementById("checkBtn");
    
    checkBtn.addEventListener("click", () => {
      var id = document.getElementById("userId");

      if(id.value == '' || id.value == null) {
        alert("Id를 입력해주세요.");
      } else {
        checkAjax(id)
      }

    })


    function checkAjax(id) {
      $.ajax({
          url: "/check_id",
          type: "get",
          data: {
            "id": id.value
          },
          success: data => {
            if(data == 0 ) {
              alert("입력하신 아이디 " + id + "는 사용 가능한 아이디입니다.");
              checkBtn.disabled = true;
              id.disabled = true;
              id.classList.remove('fail');
            } else {
              alert("입력하신 아이디 " + id + "는 이미 존재하는 아이디입니다. \n다른 아이디를 입력해주세요.");
              id.classList.add('fail');
            }
          },
          error: error => {
            console.log(error)
          }
        });
    }
  </script>
</body>
</html>
