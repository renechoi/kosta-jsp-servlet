<jsp:directive.page contentType="text/html;charset=utf-8" />
<html>
<body>
 <h1>Script Tag Example</h1>
 <jsp:declaration>
 	public int max(int i, int j){
 		return (i>j)? i : j;
 	}
 </jsp:declaration>
 <jsp:scriptlet> 
    int i = 22; 
    int j = 23;
 </jsp:scriptlet>
 i = <jsp:expression>i</jsp:expression>�� 
 j = <jsp:expression>j</jsp:expression> �߿� �� ū ���ڴ�?
 <b><jsp:expression>max(i,j)</jsp:expression></b>
</body>
</html>