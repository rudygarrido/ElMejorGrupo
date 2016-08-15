

// (function(ng, app) {
//   document.addEventListener('DOMContentLoaded', function() {
//   	ng.platform.browser.bootstrap(app.Main , [
//       ng.router.ROUTER_BINDINGS,
//       ng.core.bind(ng.router.LocationStrategy).toClass(ng.router.HashLocationStrategy)
//     ]);
//     ng.platformBrowserDynamic.bootstrap(app.AppComponent);
//     ng.platformBrowserDynamic.bootstrap(app.TestComponent);
//     ng.platformBrowserDynamic.bootstrap(app.LoginComponent);
//     ng.platformBrowserDynamic.bootstrap(app.IndexComponent);


//   });
// })(window.app, window.ng);



/*global app*/
'use strict';

(function (ng, app) {
  document.addEventListener('DOMContentLoaded', function () {
    ng.platform.browser.bootstrap(app.Main , [
      ng.router.ROUTER_BINDINGS,
      ng.router.ROUTER_DIRECTIVES,
      ng.core.bind(ng.router.LocationStrategy).toClass(ng.router.HashLocationStrategy)
    ]);
 });
})(this.ng, this.app);