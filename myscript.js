 function openNav()
            {
                document.getElementById("mySidenav").style.width = "412px";
                //document.getElementById("table-wrapper").style.filter = "blur(8px)";                      
            }
          
            function closeNav() 
            {
                document.getElementById("mySidenav").style.width = "0";
                //document.getElementById("table-wrapper").style.filter = "blur(0px)";
            }
        
            setTimeout(function() {
                document.getElementById("splash-screen").style.transform = "translateY(-150vh)";
            }, 2000); // Adjust timing as needed (in milliseconds)
            



    function storeUsername() {
      const username = document.getElementById("uname").value;
      localStorage.setItem("uname", uname);
      console.log("username :",uname);
    }





            // For Firebase JS SDK v7.20.0 and later, measurementId is optional


const firebaseConfig = {
    apiKey: "AIzaSyAfkB08Z_C80b46nlyrzf8BvgfOqyNsv1g",
    authDomain: "genyuva-6c7f3.firebaseapp.com",
    databaseURL: "https://genyuva-6c7f3-default-rtdb.firebaseio.com",
    projectId: "genyuva-6c7f3",
    storageBucket: "genyuva-6c7f3.appspot.com",
    messagingSenderId: "28526423082",
    appId: "1:28526423082:web:4c88376539abbe1f56e753",
    measurementId: "G-15D06LX77L"
  };

  firebase.initializeApp(firebaseConfig);

  var genyuvaloginDB = firebase.database().ref('genyuvalogin');

  document.getElementById('genyuvaloginform').addEventListener("submit", submitcredential)

  function submitcredential(e){
    e.preventDefault();

    var name = getElementVal('uname');
    var passsword = getElementVal('password');

    console.log(name, password);
  }

  const getElementVal = (id) =>{
    return document.getElementById(id).ariaValueMax;
  };



  console.log("username :",uname);
  console.log("password :",password);


