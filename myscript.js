

function openNav(){              
  document.getElementById("mySidenav").style.width = "412px";
  //document.getElementById("table-wrapper").style.filter = "blur(8px)";                      
  }
          
            
function closeNav(){              
  document.getElementById("mySidenav").style.width = "0";
  //document.getElementById("table-wrapper").style.filter = "blur(0px)";
   } 
            

   import { initializeApp } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-app.js";
   import { getDatabase, get, set, ref, child } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-database.js";
   import { getAuth, signInWithEmailAndPassword, createUserWithEmailAndPassword } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-auth.js";
   
   const firebaseConfig = {
    apiKey: "AIzaSyCrGWnqUsdsFoDK2c9mLfYoCroIUYNWW5I",
    authDomain: "genyuva2.firebaseapp.com",
    databaseURL: "https://genyuva2-default-rtdb.firebaseio.com",
    projectId: "genyuva2",
    storageBucket: "genyuva2.appspot.com",
    messagingSenderId: "648537327614",
    appId: "1:648537327614:web:57ed10671dd2129afba2af"
   };
   
   const app = initializeApp(firebaseConfig);
   const auth = getAuth(app);
   const db = getDatabase();
   const dbref = ref(db);
   
   const submitButton = document.getElementById("submit");
   const signupButton = document.getElementById("sign-up");
   const emailInput = document.getElementById("email");
   const passwordInput = document.getElementById("password");
   const main = document.getElementById("main");
   const createacct = document.getElementById("create-acct")
   
   const signupEmailIn = document.getElementById("email-signup");
   const confirmSignupEmailIn = document.getElementById("confirm-email-signup");
   const signupPasswordIn = document.getElementById("password-signup");
   const confirmSignUpPasswordIn = document.getElementById("confirm-password-signup");
   const createacctbtn = document.getElementById("create-acct-btn");
   
   const returnBtn = document.getElementById("return-btn");
   
   var email, password, signupEmail, signupPassword, confirmSignupEmail, confirmSignUpPassword;
   
   createacctbtn.addEventListener("click", function() {
     var isVerified = true;
   
     signupEmail = signupEmailIn.value;
     confirmSignupEmail = confirmSignupEmailIn.value;
     if(signupEmail != confirmSignupEmail) {
         window.alert("Email fields do not match. Try again.")
         isVerified = false;
     }
   
     signupPassword = signupPasswordIn.value;
     confirmSignUpPassword = confirmSignUpPasswordIn.value;
     if(signupPassword != confirmSignUpPassword) {
         window.alert("Password fields do not match. Try again.")
         isVerified = false;
     }
     
     if(signupEmail == null || confirmSignupEmail == null || signupPassword == null || confirmSignUpPassword == null) {
       window.alert("Please fill out all required fields.");
       isVerified = false;
     }
     
     if(isVerified) {
       createUserWithEmailAndPassword(auth, signupEmail, signupPassword)
         .then((credentials) => {
         // Signed in 
         //const user = credentials.user;
         set(ref(db, 'UsersAuthList/' + credentials.user.uid),{
          account : signupEmail.value
         })
         window.alert("Success! Account created.");
       })
       .catch((error) => {
         const errorCode = error.code;
         const errorMessage = error.message;
         // ..
         window.alert("Success! you may log in now.");
       });
     }
   });
   
   submitButton.addEventListener("click", function() {
     email = emailInput.value;
     console.log(email);
     password = passwordInput.value;
     console.log(password);
   
     signInWithEmailAndPassword(auth, email, password)
       .then((credentials) => {
         // Signed in
         //const user = credentials.user;
         console.log(" Welcome to Genyuva");
         get(child(dbref,'UsersAuthList/' + credentials.user.uid)).then((snapshot)=>{
          if(snapshot.exists){
            sessionStorage.setItem("user-info", JSON.stringify({
              account: snapshot.val().account
            }))
            sessionStorage.setItem("user-creds",JSON.stringify(credentials.user));
            //.......window.location
          }
         })
         window.location.href = "departments.html"
       })

       .catch((error) => {
         const errorCode = error.code;
         const errorMessage = error.message;
         console.log("Error occurred. Try again.");
         window.alert("Error occurred. Try again.");
       });
   });
   

   signupButton.addEventListener("click", function() {
       main.style.display = "none";
       createacct.style.display = "block";
   });
   
   returnBtn.addEventListener("click", function() {
       main.style.display = "block";
       createacct.style.display = "none";
   });
   