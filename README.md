# Spring-MVCForms
<h1>Form Handling Support in Spring MVC</h1>
Spring MVC is a Model-View-Controller framework so it handles form submission by the three key components: model, view and controller.
Model: basically a POJO (Plain Old Java Object) class is created to bind form fields with properties of the object. This object will be put into the model (model object).
View: Spring MVC form tags are used to render the equivalent HTML form fields, and most importantly, bind the object in the model with the form.
Controller: alongside with handling requests, the controller binds the model object with the view and vice-versa, and delegates processing to dedicated business/service class.
