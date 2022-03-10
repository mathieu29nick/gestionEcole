<%@page import="java.time.LocalDate" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>secretaire</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <h1 style="margin-top: 80px;text-align: center;">PAYEMENT ECOLAGE</h1>
    <section class="register-photo" style="margin-top: 80px;">
        <div class="form-container">
            <form method="post">
                <div class="table-responsive">
                    <table class="table">
                        <thead>
                            <tr>
                                <th style="text-align: center;">NumETU</th>
                                <th style="text-align: center;">Nom Prenom</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td style="text-align: center;">Cell 1</td>
                                <td style="text-align: center;">Cell 2</td>
                            </tr>
                            <tr></tr>
                        </tbody>
                    </table>
                </div>
                <a href="index.jsp"><button class="btn btn-primary" type="button" style="margin-top: 127px;width: 100.5px;">&lt;&lt; BACK</button></a>
            </form>
            <form method="post" action="ServletInsertionEcolage">
                <p style="width: 150px;">Numero ETU</p>
                <p style="width: 150px;">Mois</p>
                <p style="width: 150px;">Annee</p>
                <p style="width: 150px;">Date</p>
                <p style="width: 150px;">Niveau</p>
                <input class="form-control" type="text" style="width: 200px;margin-left: 200px;margin-top: -210px;" name="num" required>
                <select class="form-control" style="width: 200px;margin-left: 200px;" name="mois" selected="1">
                    <optgroup label="Mois">
                        <% for(int i = 1; i <= 12; i++) { %>
                            <option value="<% out.print(i); %>"><% out.print(i); %></option>
                        <% } %>
                    </optgroup>
                </select>
                <input class="form-control" type="text" style="width: 200px;margin-left: 200px;" name="annee" required>
                <input class="form-control" type="date" style="width: 200px;margin-left: 200px;" value="<% out.print(LocalDate.now()); %>" name="date">
                <select class="form-control" style="width: 200px;margin-left: 200px;" name="niveau">
                    <optgroup label="Mois">
                        <% for(int i = 1; i <= 12; i++) { %>
                            <option value="<% out.print(i); %>"><% out.print(i); %></option>
                        <% } %>
                    </optgroup>
                </select>
                <button class="btn btn-primary" type="submit" style="margin-left: 320px;">Valider</button>
            </form>
        </div>
    </section>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>