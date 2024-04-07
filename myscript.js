

 
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
        
            window.onload = function() {
              setTimeout(function() {
                document.getElementById("splash-screen").style.transform = "translateY(-150vh)";
              }, 200); // Adjust timing as needed (in milliseconds)
            };
             // Adjust timing as needed (in milliseconds)
            

