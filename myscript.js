import { initializeApp } from "firebase/app";
import { getAuth, onAuthStateChanged } from "firebase/auth";

function signIn() {

  const firebaseConfig = {
    apiKey: "AIzaSyCrGWnqUsdsFoDK2c9mLfYoCroIUYNWW5I",
    authDomain: "genyuva2.firebaseapp.com",
    databaseURL: "https://genyuva2-default-rtdb.firebaseio.com",
    projectId: "genyuva2",
    storageBucket: "genyuva2.appspot.com",
    messagingSenderId: "648537327614",
    appId: "1:648537327614:web:57ed10671dd2129afba2af"
  };
  firebase.initializeApp(firebaseConfig);


  // Get a reference to the Google Sign-In provider
  const provider = new firebase.auth.GoogleAuthProvider();

  // Sign in with popup
  firebase.auth().signInWithPopup(provider)
    .then((result) => {
      // Successful login
      const credential = result.credential;
      const user = result.user;
      console.log("Logged in user:", user);

      // Handle successful login (e.g., redirect to departments.html)
      window.location.href = 'departments.html';
    })
    .catch((error) => {
      // Handle errors (e.g., display error message to the user)
      const errorCode = error.code;
      const errorMessage = error.message;
      console.error("Login error:", errorCode, errorMessage);
    });
}


function openNav(){              
  document.getElementById("mySidenav").style.width = "412px";
  //document.getElementById("table-wrapper").style.filter = "blur(8px)";                      
  }
          
            
function closeNav(){              
  document.getElementById("mySidenav").style.width = "0";
  //document.getElementById("table-wrapper").style.filter = "blur(0px)";
   }
        
            
window.onload = function() {            
  setTimeout(function() { document.getElementById("splash-screen").style.transform = "translateY(-150vh)"; }, 2);         
};
        
            

