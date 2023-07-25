<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <%@include file="components/header.jsp" %>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <%@include file="components/sidebar.jsp" %>

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <%@include file="components/topbar.jsp" %>

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <h1>Alta Usuarios</h1>
                        <p>Este es el apartado para dar de alta a diferentes usuarios del sistema</p>

                        <%@include file="components/formAltaUsuarios.jsp" %>

                    </div>
                    <!-- /.container-fluid -->
                </div>
                <!-- End of Main Content -->

                <%@include file="components/footer.jsp" %>

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <%@include file="components/logout.jsp" %>

        <%@include file="components/scripts.jsp" %>

    </body>

</html>