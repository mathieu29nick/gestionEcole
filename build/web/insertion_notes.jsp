<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>insertion_notes</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <h1 style="margin-top: 80px;text-align: center;">INSERTION NOTES</h1>
    <section class="register-photo" style="margin-top: 125px;">
        <div class="form-container">
            <form method="post" style="width: 370.2px;">
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
                <a href="index.jsp"><button class="btn btn-primary" type="button" style="width: 100.5px;margin-top: 88px;">&lt;&lt; BACK</button></a>
            </form>
            <form method="post" action="ServletInsertionNotes">
                <p style="width: 125px;margin-left: -50px;">Numero ETU</p>
                <p style="width: 125px;margin-left: -50px;">Matiere</p>
                <p style="width: 125px;margin-left: -50px;">Notes</p>
                <p style="width: 125px;margin-left: -50px;">Numero Examen</p>
                <input class="form-control" type="text" style="width: 200px;margin-left: 80px;margin-top: -169px;" name="num" required>
                <select class="form-control" style="width: 200px;margin-left: 80px;" name="matiere">
                    <optgroup label="Matiere">
                        <option value="">Matiere</option>
                    </optgroup>
                </select>
                <input class="form-control" type="text" style="width: 200px;margin-left: 80px;" name="note" required>
                <input class="form-control" type="text" style="width: 200px;margin-left: 80px;" name="numExam" required>
                <button class="btn btn-primary" type="submit" style="margin-left: 180px;">Enregistrer</button>
            </form>
        </div>
    </section>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>