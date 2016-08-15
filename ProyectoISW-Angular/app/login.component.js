
(function(ng, app) {
  app.LoginComponent =
    ng.core.Component({
   	  // directives: [RouterOutlet, RouterLink],
   	  directives: [ng.router.ROUTER_DIRECTIVES],
      selector: 'loginWindow',
      template: `<div class="container">

		<div class="col-sm-6 col-sm-offset-3">

		    <h1><span class="fa fa-sign-in"></span> Login</h1>

		    <!-- mostrar mensajes que regresan con la autentificacion -->

		    <!-- LOGIN FORM -->
		    <form action="/login" method="post">
		        <div class="form-group">
		            <label>Email</label>
		            <input type="text" class="form-control" name="email">
		        </div>
		        <div class="form-group">
		            <label>Password</label>
		            <input type="password" class="form-control" name="password">
		        </div>

		        <button type="submit" class="btn btn-warning btn-lg">Login</button>
		    </form>

		    <hr>

		    <p>Necesitas una cuenta? <a href="/signup">Registrate</a></p>
		    <p>O regresar a <a href="/">home</a>.</p>

		</div>

		</div>`,
    })

    .Class({
      constructor: function() {}

    });
})(window.ng ,window.app || (window.app = {}));

