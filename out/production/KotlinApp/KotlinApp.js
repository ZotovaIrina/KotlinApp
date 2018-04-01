if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KotlinApp'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlinApp'.");
}
var KotlinApp = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  var ensureNotNull = Kotlin.ensureNotNull;
  function main(args) {
    var message = 'Hello World!!!';
    var template = '\n        <h1 class="header">Hello World!!!<\/h1>\n        ';
    println(message);
    var root = document.getElementById('root');
    ensureNotNull(root).innerHTML = template;
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('KotlinApp', _);
  return _;
}(typeof KotlinApp === 'undefined' ? {} : KotlinApp, kotlin);
