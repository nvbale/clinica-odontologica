<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form class="user" action="SvUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="nombreusu" id="nombreusu"
                   placeholder="Nombre Usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" name="contrasenia" id="contrasenia"
                   placeholder="Contraseña">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" name="rol" id="rol"
                   placeholder="Rol">
        </div>
    </div>
    <button type="submit" class="btn btn-primary btn-user btn-block">
        Crear Usuario
    </button>
</form>