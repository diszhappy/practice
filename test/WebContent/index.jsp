<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.css" />
<script type="text/javascript"
	src="https://cdn.datatables.net/r/dt/dt-1.10.9/datatables.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>json sample</title>
<script type="text/javascript">
	var x;
	var html = "";
	/*START :: Update Document ready*/
	$(document).ready(function() {
		$("#detail-view").hide()

	});
	/*END :: Update Document ready*/
	function inittable(data) {
		$('#test').append(html);
	}

	function initeData(data) {

	}

	function search() {

		//	$("#example-table").tabulator();
		var arrayReturn = [];
		$
				.ajax({
					url : "https://api.github.com/users/diszhappy/followers",
					async : false,
					dataType : 'json',
					success : function(data) {
						x = data;
						$
								.each(
										data,
										function(key, value) {
											html += '<div class="col-xs-6 col-md-3 panel panel-default">'
											html += '	<div>'
											html += '		<span> ID :</span> <span>'
													+ value.id + '</span>'
											html += '	</div>'
											html += '	<div>'
											html += '		<span> Desc : </span> <span> <a href="#" onclick="showDetails('
													+ value.id
													+ ')">'
													+ value.name
													+ '</a></span>'
											html += '	</div>'
											html += '</div>'
											console.log(key + '&nbsp;' + value);
										});

		
						inittable(arrayReturn);
					}
				});

	}

	function showDetails(dat) {

		var p;
		$.each(x, function(i, v) {
			if (v.id == dat) {
				p = v;
			}
		});
		console.log(JSON.stringify(p));
		$("#login").text(p.id);
		$("#type").text(p.name);
		$("#user").text(p.dept);
		$("#orgurl").text(p.address);
		$("#detail-view").show();

	}
/* START :: Add these two methods */
	function accept() {
		alert('Coming soon....');
	}

	function clearnhide() {
		$("#login").text('');
		$("#type").text('');
		$("#user").text('');
		$("#orgurl").text('');
		$("#detail-view").hide();
	}
	/*END :: Add these two methods */
	</script>

</head>
<body style=" padding: 25px">
	<button onclick="search()">Search</button>
	<div id="test" class="row" style="text-align: center;"></div>
<!-- START :: Add below div after the table and update accordingly -->

	<div id="detail-view" style="text-align: center;" class="border">
		<div style="width: 200 px" class=" panel panel-default">
			<div class="row" style="width: 200 px">
				<div class="column">
					<span class=""> Login : </span><span class=" " id="login"></span>
				</div>

				<div class="column">
					<span class=" "> Type : </span><span class=" " id="type"></span>
				</div>

				<div class="column">
					<span class=" "> User : </span><span class=" " id="user"> </span>
				</div>

				<div class="column">
					<span class=" "> Org URL : </span><span class="span" id="orgurl">
					</span>

				</div>
			</div>
			<div style="text-align: center;">
			<button class="button" onclick="accept()">Accept</button>
			<button class="button" onclick="clearnhide()">Reject</button>
		</div>
		</div>
		
	</div>
<!-- END :: Add below div after the table and update accordingly -->

</body>
</html>