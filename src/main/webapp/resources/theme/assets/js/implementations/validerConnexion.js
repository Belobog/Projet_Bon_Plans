afficherErreur();

function afficherErreur(){
	$('div[class="alert alert-block alert-warning fade in"]').remove();
	var erreur = $('p[name=message_erreur]').text();
	if(erreur.length > 0){
		var message = "<div class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Mauvais login ou mot de passe</div>";
		$('p[name=message_erreur]').replaceWith(message);
	}
	else{
		$('p[name=message_erreur]').remove();
	}
	
}

function validerConnexion(){
	
	$('div[class="alert alert-block alert-warning fade in"]').remove();
	
	var tableau = [validerEmail(),validerPassword()];
	
	
	if($.inArray(false, tableau)>-1){
		return false;
	}
	else{
		return true;
	}
	
}




function validerEmail(){
	var email = $('input[name=security_username]').val();
	
	var myEmail = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		    
    if(myEmail.test(email)){
    	return true;
    } 
    else {
    	var erreur = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez entrer une adresse email valide.</div>"
    	
    	$('div[name=div_email]').after(erreur);
    	return false;
    }
}


function validerPassword(){
	var password = $('input[name=security_password]').val();
	
	var myPassword = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}/;
		    
    if(myPassword.test(password)){
    	return true;
	
    } 
    else {
    	var erreur = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez entrer un mot de passe valide au moins 6 caracteres,au moins une majuscule un chiffre et une minuscule.</div>"
    	
    	$('div[name=div_password]').after(erreur);
    	return false;
    }
}