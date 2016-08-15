//home.component.js
app.register ('HomeComponent', function (ng) {
  return ng.core.

  Component({
    template: '<div>Hello {{name}}!</div>',
  }).
  Class({
    constructor:function () {
      this.name ='world';
    }
  });

});