

// function openNav(){              
//   document.getElementById("mySidenav").style.width = "412px";
//   //document.getElementById("table-wrapper").style.filter = "blur(8px)";                      
//   }


// function closeNav(){              
//   document.getElementById("mySidenav").style.width = "0";
//   //document.getElementById("table-wrapper").style.filter = "blur(0px)";
//    } 

// function openNav() {
//   document.getElementById("mySidenav").style.width = "412px";
//   document.getElementById("mySidenav").style.transition = "0"; // Disable transition temporarily
//   setTimeout(function() {
//     document.getElementById("mySidenav").style.transition = null; // Restore transition
//   }, 100);
// }

// function closeNav() {
//   document.getElementById("mySidenav").style.width = "0";
// }




import { initializeApp } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-app.js";
import { getDatabase, get, set, ref, child, update, remove } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-database.js";
import { getFirestore, doc, getDoc, setDoc } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-firestore.js";
import { getAuth, signInWithEmailAndPassword, createUserWithEmailAndPassword, onAuthStateChanged } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-auth.js";
// import { getStorage, ref, uploadBytesResumable, getDownloadURL } from "https://www.gstatic.com/firebasejs/10.10.0/firebase-storage.js";

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
const db = getFirestore();






let submitButton = document.getElementById("submit");
let signupButton = document.getElementById("sign-up");
let emailInput = document.getElementById("email");
let passwordInput = document.getElementById("password");
let main = document.getElementById("main");
let createacct = document.getElementById("create-acct")

let signupEmailIn = document.getElementById("email-signup");
// let usernameIN = document.getElementById("username");
//  const confirmSignupEmailIn = document.getElementById("confirm-email-signup");
let signupPasswordIn = document.getElementById("password-signup");
let confirmSignUpPasswordIn = document.getElementById("confirm-password-signup");
let createacctbtn = document.getElementById("create-acct-btn");

let returnBtn = document.getElementById("return-btn");

var email, password, signupEmail, signupPassword, confirmSignUpPassword;

createacctbtn.addEventListener("click", function () {
  var isVerified = true;

  //  signupEmail = signupEmailIn.value;
  //   confirmSignupEmail = confirmSignupEmailIn.value;
  //  if(signupEmail != confirmSignupEmail) {
  //      window.alert("Email fields do not match. Try again.")
  //      isVerified = false;
  //  }
  signupEmail = signupEmailIn.value;
  // username = usernameIN.value;
  signupPassword = signupPasswordIn.value;
  confirmSignUpPassword = confirmSignUpPasswordIn.value;

  if (signupPassword != confirmSignUpPassword) {
    window.alert("Password fields do not match. Try again.");
    isVerified = false;
  }

  if (signupEmail == null || signupPassword == null || confirmSignUpPassword == null) {
    window.alert("Please fill out all required fields.");
    isVerified = false;
  }

  if (isVerified) {
    createUserWithEmailAndPassword(auth, signupEmail, signupPassword)
      .then(async (credentials) => {
        // Signed in 
        console.log(credentials);
        var ref = doc(db, "userAuthList", credentials.user.uid);
        await setDoc(ref, {
          email: signupEmailIn.value,

        })
        //const user = credentials.user;
        //  set(ref(db, 'UsersAuthList/' + credentials.user.uid),{
        //   account : signupEmail.value
        //  })
        window.alert("Success! Account created.");

      })
      .catch((error) => {
        console.log(error.message);
        console.log(error.code);
        window.alert(error.message);
        //  window.alert(errorCode);
      });
  }
});





submitButton.addEventListener("click", function () {
  email = emailInput.value;
  console.log(email);
  password = passwordInput.value;
  console.log(password);


  signInWithEmailAndPassword(auth, email, password)
    .then(async (credentials) => {
      // Signed in
      //const user = credentials.user;
      console.log(credentials);
      var ref = doc(db, "userAuthList", credentials.user.uid);
      const docSnap = await getDoc(ref);

      if (docSnap.exists()) {
        sessionStorage.setItem("user-info", JSON.stringify({
          email: docSnap.data().signupEmailIn,
          //username: docSnap.data().usernameIN
        }))
        sessionStorage.setItem("user-creds", JSON.stringify(credentials.user))
        window.location.href = "departments.html"
      }
      //  get(child(dbref,'UsersAuthList/' + credentials.user.uid)).then((snapshot)=>{
      //   if(snapshot.exists){
      //     sessionStorage.setItem("user-info", JSON.stringify({
      //       account: snapshot.val().account
      //     }))
      //     sessionStorage.setItem("user-creds",JSON.stringify(credentials.user));
      //     //.......window.location
      //   }
      //  })
    })

    .catch((error) => {
      console.log(error.message);
      console.log(error.code);
      window.alert("Error occurred. Try again.");
    });
});


signupButton.addEventListener("click", function () {
  main.style.display = "none";
  createacct.style.display = "block";
});

returnBtn.addEventListener("click", function () {
  main.style.display = "block";
  createacct.style.display = "none";
});



/////////
