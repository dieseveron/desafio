$(function () {



	function escapeHTML(text) {
		return text.replace(/\&/g, '&amp;').replace(/\</g, '&lt;').replace(/\>/g, '&gt;');
	}

	function bytesToSize(bytes) {
		var sizes = ['Bytes', 'KB', 'MB', 'GB', 'TB'];
		if (bytes == 0) return '0 Bytes';
		var i = parseInt(Math.floor(Math.log(bytes) / Math.log(1024)));
		return Math.round(bytes / Math.pow(1024, i), 2) + ' ' + sizes[i];
	}
});


var baseUrl = 'http://localhost:8081/api/';

function getDocumentById(){
	var id=document.getElementById("buscarId").value;
	$.ajax({
		url: baseUrl + 'documents/'+id,
		type: 'GET',
		success: function (resp) {
			document.getElementById("id_doc").value=resp.id;
			document.getElementById("nameDocument").value=resp.nameDocument;
			document.getElementById("typeDoc").value=resp.typeDoc;
			document.getElementById("owner").value=resp.owner;
		},
	});

}
function getDocument() { 
	
$.ajax({
	url: baseUrl + 'documents',
	type: 'GET',
	success: function (resp) {
		
		obj = JSON.stringify(resp);
		x = "";
		txt = "";
		txt += "<table border='1' class='table'>";
		txt +="<tr><td id='del_id'>id</td><td>Nombre</td><td>Fecha</td><td>Tipo</td><td>Owner</td><td>Documento</td><td>Funcion</td></tr>"
        for (x in resp) {
			txt += "<tr><td>" + resp[x].id+ "</td><td>" + resp[x].nameDocument+ "</td><td>" + resp[x].dateUpload+ "</td><td>" + resp[x].typeDoc+ "</td><td>" + resp[x].owner+ "</td><td>" + resp[x].document+ "</td><td><button onclick='putDocument("+resp[x].id+")' class='btn btn-default'>Update</button> <br> <button onclick='delDocument("+resp[x].id+")' class='btn btn-default'>Delete</button></td></tr>";
		}
		txt += "</table>"; 
		document.getElementById("table").innerHTML = txt;
		
	},
});
}
function saveDocument() { 
	
	var data = {};
		data.nameDocument=document.getElementById("nameDocument").value;
		data.dateUpload="2018-08-02";
		data.typeDoc=document.getElementById("typeDoc").value;
		data.owner=document.getElementById("owner").value;
		data.document=document.getElementById("document").value;
		console.log(baseUrl);
		$.ajax({
		type: 'POST',
		data: JSON.stringify(data),
		contentType: 'application/json',
        url: baseUrl +'documents',						
        success: function(data) {
            console.log('success');
            console.log(JSON.stringify(data));
        }
        });
}

function putDocument() { 
	var id=document.getElementById("id_doc").value;
	var data = {};
		data.id=document.getElementById("id_doc").value;
		data.nameDocument=document.getElementById("nameDocument").value;
		data.dateUpload="2018-08-02";
		data.typeDoc=document.getElementById("typeDoc").value;
		data.owner=document.getElementById("owner").value;
		data.document=document.getElementById("document").value;
		console.log(baseUrl);
		$.ajax({
		type: 'PUT',
		data: JSON.stringify(data),
		contentType: 'application/json',
        url: baseUrl +'documents/'+id,						
        success: function(data) {
            console.log('success');
            console.log(JSON.stringify(data));
        }
        });
}

function delDocument(id) { 
	
	//var id = document.getElementById("del_id").value;
		console.log(id);
		console.log(baseUrl);
		var data = {};
		data.id=id;
		$.ajax({
			type: "DELETE",
			url: baseUrl + 'documents/'+id ,
			headers: {"id": id},
			data: JSON.stringify(data)
        });
}
