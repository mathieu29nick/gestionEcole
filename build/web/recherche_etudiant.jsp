<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>validation_note</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <h1 style="margin-top: 80px;text-align: center;">RECHERCHE ETUDIANTS</h1>
    <div class="form-container">
        <form method="post" style="margin-top: 80px;margin-left: 150px;" action="ServletRechercheETU">
            <p style="width: 150px;margin-top: 20px;margin-left: 150px;">Promotion</p>
            <select class="form-control" style="width: 200px;margin-left: 280px;margin-top: -47px;" name="prom">
                <optgroup label="Promotion">
                    <option value="">Promotion</option>
                </optgroup>
            </select>
            <p style="width: 150px;margin-left: 620px;margin-top: -35px;">Niveau</p>
            <select class="form-control" style="width: 200px;margin-left: 730px;margin-top: -47px;" name="niveau">
                <optgroup label="Niveau">
                    <option value="">Niveau</option>
                </optgroup>
            </select>
            <button class="btn btn-primary" type="submit" style="margin-left: 950px;margin-top: -65px;background: rgb(244, 71, 107);">Rechercher</button>
        </form>
    </div>
    <div class="container" style="height: 400px;margin-top: 0px;background: #bfe1e7;">
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th style="text-align: center;">NumETU</th>
                        <th style="text-align: center;">Niveau</th>
                        <th style="text-align: center;">Promotion</th>
                        <th style="text-align: center;">Matiere</th>
                        <th style="text-align: center;">Coeff</th>
                        <th style="text-align: center;">Notes</th>
                        <th style="text-align: center;">Dates</th>
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
                        <td style="text-align: center;">Cell 1</td>
                        <td style="text-align: center;"><a href="ServletDetailEtudiant">Voir plus</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
        <a href="accueil_admin.jsp"><button class="btn btn-primary" type="button" style="margin-top: 100px;margin-left: 950px;background: rgb(235, 59, 96);border-color: rgb(235, 59, 96);">&lt;&lt; BACK</button></a>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>