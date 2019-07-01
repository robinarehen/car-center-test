$(document).ready(function (){
	
	 $('select').formSelect();
	 $('.modal').modal();
	 $('.sidenav').sidenav();
	 
	 modalMessage();
});

function modalMessage(){
	
	var message = $('#modal-message .modal-content p');
	
	if(message.length > 0){		
		$('#modal-message').modal('open');
	}
}