<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ztree</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function(){
		//alert方法---提示框
 		//alert(111); 原始的方法
 		//一共是四个参数 分别是标题 内容 图标 以及关闭窗口的时候出发的回调函数
 		//$.messager.alert("标题","内容","info");
		//comfirm方法--确认框
		/* $.messager.confirm("提示信息","你确定要删除当前记录吗?",function(r){
			alert(r);
		}); */
		
		//show方法---欢迎框
		$.messager.show({
			title:"欢迎!",
			msg:"五秒钟之后消失",
			timeout:5000,
			showType:"slide"
		});
	});
</script>
</head>
</html>