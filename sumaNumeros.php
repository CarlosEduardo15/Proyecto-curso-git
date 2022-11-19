<html>
    <head>
        <title>
            Sumas de algunos nmeros 
        </title>
    </head>

    <body>
        <form action="" method = "post">
        <p>A: <input type = "number" name="NA"/></p>

        <p>B: <input type = "number" name="NB"/></p>

        <p><input type="submit" value="Suma"/> </p> 
        </form>

        <?php
        $A = $_POST['NA'] ?? null;

        $B = $_POST['NB'] ?? null;
        
        $C = ($A + $B);

        echo "C: " . $C;
        ?>
    </body>
</html>