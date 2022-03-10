<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Liste_ecole</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Footer-Clean.css">
    <link rel="stylesheet" href="assets/css/Login-Form-Clean.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <h1 style="margin-top: 80px;text-align: center;">INSERTION ETUDIANT</h1>
    <section class="register-photo" style="margin-top: 80px;">
        <div class="form-container" style="width: 500.6px;">
            <form method="post" style="width: 500.6px;margin-left: 0px;height: 300.6px;" action="ServletInsertionEtudiant">
                <p style="width: 120px;">Nom Prenom</p>
                <p style="width: 120px;margin-top: 10px;">Date_naissance</p>
                <div class="form-check" style="margin-left: 550px;width: 100px;margin-top: 73px;">
                    <input class="form-check-input" type="radio" id="formCheck-2" name="sexe" value="homme">
                    <label class="form-check-label" for="formCheck-2">Homme</label>
                </div>
                <div class="form-check" style="width: 100px;margin-left: 550px;margin-top: -76px;">
                    <input class="form-check-input" type="radio" id="formCheck-1" name="sexe" value="femme">
                    <label class="form-check-label" for="formCheck-1">Femme</label></div>
                <p style="width: 120px;margin-top: -27px;">Adresse</p>
                <p style="width: 120px;margin-top: 0px;">Date Inscription</p>
                <input class="form-control" type="text" style="width: 250px;margin-left: 130px;margin-top: -166px;" name="nomP" required>
                <input class="form-control" type="date" style="width: 250px;margin-left: 130px;margin-top: 1px;" name="naissance" required>
                <input class="form-control" type="text" style="margin-left: 130px;width: 250px;margin-top: 0px;" name="adresse" required>
                <input class="form-control" type="date" style="width: 250px;margin-left: 130px;margin-top: 0px;" name="inscription" required>
                <p style="width: 150px;margin-left: 400px;margin-top: -108px;">Promotion</p>
                <select class="form-control" style="margin-left: 550px;width: 175px;margin-top: -95px;" name="niveau">
                    <optgroup label="Niveau">
                        <option value="">Niveau</option>
                    </optgroup>
                </select>
                <p style="margin-left: 400px;width: 150px;margin-top: -31px;">Niveau</p>
                <select class="form-control" style="margin-left: 550px;width: 175px;margin-top: 10px;" name="prom">
                    <optgroup label="Promotion">
                        <option value="">Promotion</option>
                    </optgroup>
                </select>
                <p style="margin-left: 400px;width: 75px;margin-top: 26px;">Sexe</p>
                
                <button class="btn btn-primary" type="submit" style="margin-left: 650px;width: 100px;margin-top: 38px;">Valider</button>
                <% if(request.getAttribute("error") != null) {
                    String message = (String)request.getAttribute("error"); %>
                    <div class="alert alert-warning" role="alert">
                        <% out.println(message); %>
                    </div>
                <% } %>
            </form>
            <a href="pageAdmin.jsp"><button class="btn btn-primary" type="button" style="margin-top: 372px;margin-right: 0px;margin-left: -811px;width: 130.5px;background: rgb(244, 71, 107);height: 46px;">&lt;&lt; BACK</button></a>
           
        </div>
    </section>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>