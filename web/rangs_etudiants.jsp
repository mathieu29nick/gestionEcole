<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>rang_etudiants</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <h1 style="margin-top: 80px;text-align: center;">RANGS ETUDIANTS</h1>
    <div class="container" style="height: 400px;margin-top: 125px;background: #bfe1e7;padding: 0px;">
        <form action="ServletRechercheRangETU" method="post">
            <nav class="navbar navbar-light navbar-expand-md navigation-clean-search" style="background: white;">
                <div class="container">
                    <p style="margin-top: 17px;">Promotion</p>
                    <select class="form-control" style="width: 200px;" name="prom">
                        <optgroup label="Promotion">
                            <option value="">Promotion</option>
                        </optgroup>
                    </select>
                    <p style="margin-top: 17px;">Niveau</p>
                    <select class="form-control" style="width: 200px;" name="niveau">
                        <optgroup label="This is a group">
                            <option value="">Niveau</option>
                        </optgroup>
                    </select>
                    <button class="btn btn-primary" type="submit" style="background: rgb(235, 59, 96);">OK</button>
                </div>
            </nav>
        </form>
        <div class="table-responsive" style="width: 900px;">
            <table class="table">
                <thead>
                    <tr>
                        <th style="text-align: center;">NumETU</th>
                        <th style="text-align: center;">Nom Prenom</th>
                        <th style="text-align: center;">Sexe</th>
                        <th style="text-align: center;">Promotion</th>
                        <th style="text-align: center;">Niveau</th>
                        <th style="text-align: center;">Adresse</th>
                        <th style="text-align: center;">+++</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;"><a href="bulletin.jsp">Voir plus</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <a href="accueil_admin.jsp"><button class="btn btn-primary" type="button" style="width: 100.5px;margin-left: 1010px;background: rgb(235, 59, 96);">&lt;&lt; BACK</button></a>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>