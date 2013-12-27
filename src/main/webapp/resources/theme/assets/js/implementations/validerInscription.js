function validerInscription(){
	
	$('div[class="alert alert-block alert-warning fade in"]').remove();
	
	var tableau = [validerPseudo(),validerNom(),validerPrenom(),validerDate_De_Naissance(),validerEmail(),validerPassword(),validerCheckBox()];
	
	
	if($.inArray(false, tableau)>-1){
		return false;
	}
	else{
		return true;
	}
	
}


function validerPseudo(){
	var pseudo = $('input[name=pseudo]').val();
	
	var myPseudo = new RegExp("^[a-zA-Z0-9-_]{5,9}$","g");
    if(myPseudo.test(pseudo)){
    	return true;
    } 
    else {
    	var erreur = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Pseudo non valide.</div>"
    	
    	$('div[name=div_pseudo]').after(erreur);
    	return false;
    }
}


function validerNom(){
	var nom = $('input[name=nom]').val();
	
	var myNom = new RegExp("^[a-zA-Z-]{2,20}$","g");
    if(myNom.test(nom)){
    	return true;
    } 
    else {
    	var erreur = "<div class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez entrer votre vrai nom.</div>"
    	
    	$('div[name=div_nom]').after(erreur);
    	return false;
    }
}

function validerPrenom(){
	var prenom = $('input[name=prenom]').val();
	
	var myPrenom = new RegExp("^[a-zA-Z-]{2,20}$","g");
    if(myPrenom.test(prenom)){
    	return true;
    } 
    else {
    	var erreur = "<div class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez entrer votre vrai prenom.</div>"
    	
    	$('div[name=div_prenom]').after(erreur);
    	return false;
    }
}


function validerDate_De_Naissance(){
	var date_de_naissance = $('input[name=date_de_naissance]').val();
	
	
    if(isDate(date_de_naissance)){
    	return true;
    } 
    else {
    	var erreur = "<div class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Format date non conforme, attendu dd/MM/yyyy</div>"
    	
    	$('div[name=div_date_de_naissance]').after(erreur);
    	return false;
    }
}


function validerEmail(){
	var email = $('input[name=email]').val();
	
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
	var password = $('input[name=password]').val();
	
	var myPassword = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}/;
		    
    if(myPassword.test(password)){
    	
    	
    	var confirm_password = $('input[name=confirm_password]').val();
    	if(confirm_password != password){
    		var erreur2 = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Vous avez rentré deux mots de passe différents.</div>"
    	    	
    	    $('div[name=div_confirm_password]').after(erreur2);
    	    return false;
    	}
    	else{
    		return true;
    	}
    } 
    else {
    	var erreur = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez entrer un mot de passe valide au moins 6 caracteres,au moins une majuscule un chiffre et une minuscule.</div>"
    	
    	$('div[name=div_password]').after(erreur);
    	return false;
    }
}

function validerCheckBox(){
	if (document.getElementsByName('checkbox')[0].checked) {
		return true;
    } 
	else {
    	var erreur = "<div  class=\"alert alert-block alert-warning fade in\"><button class=\"close\" type=\"button\" data-dismiss=\"alert\"><i class=\"icon-remove\"></i></button><h4>Attention!</h4>Veuillez lire les conditions d'utilisation</div>"
    	$('label[name=label_checkbox]').after(erreur);
        return false;
    }
}




function isDate(sDate){
	var sSeparator = '/';
	if(!sDate.match("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) return false;
	var arDate = sDate.split(sSeparator);
	var iDay = parseInt(arDate[0]);
	var iMonth = parseInt(arDate[1]);
	var iYear = parseInt(arDate[2]);
	var arDayPerMonth = [31,(isLeapYear(iYear))?29:28,31,30,31,30,31,31,30,31,30,31];
	if(!arDayPerMonth[iMonth-1]) return false;
	return (iDay <= arDayPerMonth[iMonth-1] && iDay > 0);
}


function isLeapYear(iYear){
	return ((iYear%4==0 && iYear%100!=0) || iYear%400==0);
}