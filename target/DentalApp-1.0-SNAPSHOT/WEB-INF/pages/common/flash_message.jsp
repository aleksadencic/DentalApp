<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:if test="${not empty param.value}">
    <div class="flash-message">
        <p class="alert alert-${param.type}">${param.value}
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        </p>
    </div>
</c:if>
<%--<c:if test="${not empty sessionScope.message}">
    <div class="flash-message">
        <p class="alert alert-${sessionScope.message.type}">${sessionScope.message.value}
            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
        </p>
    </div>
    <%
        request.getSession().removeAttribute("message");
    %>
</c:if>--%>