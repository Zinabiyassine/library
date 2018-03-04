$(document).ready(function(){
	
	$('#pwd').keyup(function() {
		var pswd = $(this).val();
		var valid1=true;
		var valid2=true;
		var valid3=true;
		var valid4=true;
		var valid5=true;


		//validate the length
		if ( pswd.length < 8 ) {
			$('#length').removeClass('valid').addClass('invalid');
			valid1=!valid1;
		} else {
			$('#length').removeClass('invalid').addClass('valid');
			valid1=valid1;
		}
		
		//validate letter
		if ( pswd.match(/[A-z]/) ) {
			$('#letter').removeClass('invalid').addClass('valid');
			valid2=valid2;

		} else {
			$('#letter').removeClass('valid').addClass('invalid');
			valid2=!valid2;

		}

		//validate capital letter
		if ( pswd.match(/[A-Z]/) ) {
			$('#capital').removeClass('invalid').addClass('valid');
			valid3=valid3;
		} else {
			$('#capital').removeClass('valid').addClass('invalid');
			valid3=!valid3;
		}

		//validate number
		if ( pswd.match(/\d/) ) {
			$('#number').removeClass('invalid').addClass('valid');
			valid4=valid4;
		} else {
			$('#number').removeClass('valid').addClass('invalid');
			valid4=!valid4;

		}
		
	
		if(valid1&&valid2&&valid3&&valid4){
			$("#submitValid").removeAttr('disabled');


		}else{
			$("#submitValid").attr('disabled','disabled');


		}
		
	}).focus(function() {
		$('#pswd_info').show();
	}).blur(function() {
		$('#pswd_info').hide();
	});
	
});