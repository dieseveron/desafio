

var baseUrl = 'http://localhost:8081/api/';
function getDocument() { 
	
$.ajax({
	url: baseUrl+ 'documents',
	type: 'GET',
	success: function (resp) {
		alert(resp);
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
        url: baseUrl + 'documents',
        success: function(data) {
            console.log('success');
            console.log(JSON.stringify(data));
        }
        });
}

