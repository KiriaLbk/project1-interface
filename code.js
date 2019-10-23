function btnSubmit_onclick() {
    // Если что-то забыто, выводим окно сообщения
    var btnpas= document.getElementById("txtPassword").value;
    var btnuser= document.getElementById("txtUserName").value;
   if((btnuser == "") || (btnpas == ""))
    {
    alert("Вы должны ввести имя пользователя и пароль");
    return false;
    }
    return true;
   }