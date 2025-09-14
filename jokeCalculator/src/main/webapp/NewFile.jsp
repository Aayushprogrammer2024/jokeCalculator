<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
<style>

img{
height:15%;
width:15%;

}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}

body{
background:linear-gradient(to right, blue,pink);
text-align:center;
}

h1{
color:White;
}
input, button {
  font-size:30px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

h3{
color:White;

}

</style>
</head>
<body bgcolor="">
<img src="images\laughing.gif">
<h1>Joke Of The Day</h1>
<h3><%=request.getParameter("jokes") %></h3>
<form action="MyServlet" method="get">
<input type="text" name="first" placeholder="Enter First Number">
<input type="text" name="second" placeholder="Enter Second Number">
<button name="bt1" value="1">+</button>
<button name="bt1" value="2">-</button>
<button name="bt1" value="3">*</button>
<button name="bt1" value="4">/</button>
</form>

<h1>Ans=<%=request.getParameter("result") %></h1>
</body>
</html>