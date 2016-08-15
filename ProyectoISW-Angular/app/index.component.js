(function (ng, app) {

ng.router.RouteConfig([
    { path: '/home', component: app.HomeComponent, as: 'Home', useAsDefault: true},
    { path: '/test', component: app.TestComponent, as: 'Test'}
])(app.Main);

})(window.ng, window.app);