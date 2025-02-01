<html>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
                <a href="/admin/delete/${product.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
