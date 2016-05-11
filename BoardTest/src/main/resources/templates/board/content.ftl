<!doctype html>
<html>
	<head>
	
	</head>
	<body>
		<table border="1">
			<tr>
				<th>번호</th>
				<td><input type="hidden" name="seq" value="${content.seq}">${content.seq}</td>
			</tr>
			<tr>
				<th>작성일(수정일)</th>
				<td>${content.createDate}</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${content.readCnt}</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td>${content.author}</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${content.title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${content.contents}</td>
			</tr>
		</table>
	</body>
</html>