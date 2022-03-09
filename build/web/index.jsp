<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>login</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/fonts/ionicons.min.css">
    <link rel="stylesheet" href="assets/css/Footer-Basic.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <section class="register-photo">
        <div class="form-container">
            <div class="image-holder"></div>
            <form method="post" action="ServletLogin">
                <h2 class="text-center"><strong>LOGIN</strong></h2>
                <input class="form-control" type="text" name="nom" placeholder="Email" required>
                <input class="form-control" type="password" name="password" placeholder="Password" style="margin-top: 10px;" required>
                <div class="form-check" style="margin-top: 10px;">
                    <input class="form-check-input" type="radio" id="formCheck-1" value="admin" name="role">
                    <label class="form-check-label" for="formCheck-1" style="margin-top: 0px;">Admin</label>
                </div>
                <div class="form-check" style="margin-top: 10px;">
                    <input class="form-check-input" type="radio" id="formCheck-2" value="professeur" name="role">
                    <label class="form-check-label" for="formCheck-2">Professeur</label>
                </div>
                <div class="form-check" style="margin-top: 10px;">
                    <input class="form-check-input" type="radio" id="formCheck-3" value="secretaire" name="role">
                    <label class="form-check-label" for="formCheck-3">Secretaire</label>
                </div>
                <button class="btn btn-primary btn-block" type="submit">Valider</button>
                <% if(request.getAttribute("error") != null) {
                    String message = (String)request.getAttribute("error"); %>
                    <div class="alert alert-warning" role="alert">
                        <% out.println(message); %>
                    </div>
                <% } %>
            </form>
        </div>
    </section>
    <footer class="footer-basic">
        <div class="social"><a href="#"><i class="icon ion-social-instagram"></i></a>
            <a href="#"><i class="icon ion-social-snapchat"></i></a>
            <a href="#"><i class="icon ion-social-twitter"></i></a>
            <a href="#"><i class="icon ion-social-facebook"></i></a>
        </div>
        <ul class="list-inline">
            <li class="list-inline-item"><a href="#">Home</a></li>
            <li class="list-inline-item"><a href="#">Services</a></li>
            <li class="list-inline-item"><a href="#">About</a></li>
            <li class="list-inline-item"><a href="#">Terms</a></li>
            <li class="list-inline-item"><a href="#">Privacy Policy</a></li>
        </ul>
        <p class="copyright">Company Name © 2022</p>
    </footer>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>