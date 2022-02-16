<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" 
    integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" 
    crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    
    
    <div class="container mt-5"> 
    
   <!--  <h3 class="text-center"> REGISTRATION FORM</h3> -->
    <h3 class="text-center"> ${Header }</h3>
    <p class="text-center"> ${Desc }
     <form action="processform" method="post">
     
     <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input
     type="email" 
     class="form-control" 
     id="exampleInputEmail1"
     aria-describedby="emailHelp"
     name="email"
      >
    
    </div>
    
     <div class="form-group">
    <label for="userName">User Name</label>
    <input
     type="text" 
     class="form-control" 
     id="userName"
     aria-describedby="emailHelp"
     name="userName"
      >
      
    </div>
    
     <div class="form-group">
    <label for="userPasswaord">User Password</label>
    <input
     type="password" 
     class="form-control" 
     id="userPasswaord"
     aria-describedby="emailHelp"
     name="password"
     >
    </div>
    
    <div class="container text-center">
       <button type="submit" class="btn btn-success">Sign Up</button>
    
    </div>
    
    
    </form>
    
    </div>
    
    
   
    
    

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    -->
  </body>
</html>