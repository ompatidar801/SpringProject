<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<tiles:insertAttribute name="title" />
</head>
<body>

  <table width="100%" border="0" cellpadding="0" cellspacing="0" align="left">
    <tr>
      <td colspan="2" align="center"><tiles:insertAttribute name="menu" />
      </td>
    </tr>
        <tr>
      <td colspan="2" align="center"><tiles:insertAttribute name="header" />
      </td>
    </tr>
    <tr>
      <td align="center" height="250px" bgcolor="#FFC266"><tiles:insertAttribute name="body" />
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center"><tiles:insertAttribute name="footer" />
      </td>
    </tr>
  </table>


</body>
</html>