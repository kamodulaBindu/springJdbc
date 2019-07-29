<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3c//DTD HTML 4.01 Transitiona//EN" "http://www.w3.org/TR/html4/loose.dtd"

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>KeepNote</title>
</head>
<body>
	<!-- Create a form which will have text boxes for Note ID, title, content and status along with a Send
		 button. Handle errors like empty fields -->
    <form  method="post"action="saveNote"><br>
    <p>Enter empId to be deleted.</p>
    Employee Id:<input type="text" name="empId"><br>
    <input type="submit" Value="Delete"><br>
    </form>
<p>deleted</p>
	<!-- display all existing notes in a tabular structure with Id, Title,Content,Status, Created Date and Action -->
    <table border="5px" margin="10px">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Salary</th>
    <th>Gender</th>
    </tr>


        		  <tr>
        		  <c:forEach  var = "note" items="${notes}">
        		    <td>${note.noteId}</td>
        		    <td>${note.noteTitle}</td>
        		    <td>${note.noteContent}</td>
        		    <td>${note.noteStatus}</td>
        		    <td>${note.createdAt}</td>
               </tr>
               </c:forEach>
    </table>
</body>
</html>